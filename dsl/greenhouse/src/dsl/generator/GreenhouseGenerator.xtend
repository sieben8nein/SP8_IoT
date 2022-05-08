/*
 * generated by Xtext 2.25.0
 */
package dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dsl.greenhouse.Model

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class GreenhouseGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		val model = resource.allContents.filter(Model).next
		fsa.generateFile('math_expression/' + model.name + ".java", model.compile)
		
	}
	
	def compile(Model model)'''
	from paho.mqtt import client as mqtt_client
	
	broker = 'localhost'
	port = 1883
	topic1 = "temp"
	topic2 = "humidity"
	topic3 = "co2"
	pubTopic = "actuators"
	client_id = 'python-mqtt-rulechecker'
	username = 'my_user'
	password = 'bendevictor'
	
	def connect_mqtt() -> mqtt_client:
	    def on_connect(client, userdata, flags, rc):
	        if rc == 0:
	            print("Connected to MQTT Broker!")
	        else:
	            print("Failed to connect, return code %d\n", rc)
	
	    client = mqtt_client.Client(client_id)
	    client.username_pw_set(username, password)
	    client.on_connect = on_connect
	    client.connect(broker, port)
	    return client
	
	def subscribe(client: mqtt_client, topic):
	    def on_message(client, userdata, msg):
	        print(f"Received `{msg.payload.decode()}` from `{msg.topic}` topic")
	        ruleCheck(msg.payload.decode(), msg.topic, client)
	
	    client.subscribe(topic)
	    client.on_message = on_message
	
	def publish(client, message):
	    msg = message
	    result = client.publish(pubTopic, msg)
	    # result: [0, 1]
	    status = result[0]
	    if status == 0:
	        print(f"Send `{msg}` to topic `{pubTopic}`")
	    else:
	        print(f"Failed to send message to topic {pubTopic}")
	        
	def ruleCheck(value, topic, client):
	    if topic == "temp":
	        if value > 25:
	            publish(client, ["fan", "open"])
	        else:
	            publish(client, ["fan", "close"])
	        
	    elif topic == "humidity":
	        if value > 30:
	            publish(client, ["dehumidifyer", "open"])
	        else:
	            publish(client, ["dehumidifyer", "close"])
	    elif topic == "co2":
	        if value > 1200:
	            publish(client, ["window", "open"])
	        else:
	            publish(client, ["window", "close"])
	    return
	
	def run():
	    client = connect_mqtt()
	    subscribe(client, topic1)
	    subscribe(client, topic2)
	    subscribe(client, topic3)
	    client.loop_forever()
	    
	
	
	if __name__ == '__main__':
	    run()
	'''
}