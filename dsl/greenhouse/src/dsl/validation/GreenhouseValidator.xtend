/*
 * generated by Xtext 2.25.0
 */
package dsl.validation


/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */

import org.eclipse.xtext.validation.Check
import dsl.greenhouse.SettingSensor
import dsl.greenhouse.HardwareSetup
import dsl.greenhouse.GreenhousePackage
import dsl.greenhouse.RowSensor
import dsl.greenhouse.Row
import dsl.greenhouse.RowActuator
import dsl.greenhouse.GreenhouseSensor
import org.eclipse.xtext.EcoreUtil2
import dsl.greenhouse.Trigger
import dsl.greenhouse.SettingActuator
import dsl.greenhouse.Greenhouse
import dsl.greenhouse.GreenhouseActuator

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class GreenhouseValidator extends AbstractGreenhouseValidator {
	
	public static final String VAR_UNIQUE = 'var_unique'
		
		@Check
		def void uniqueGlobalSettingSensorDefinition(SettingSensor sensor){
			if((sensor.eContainer as HardwareSetup).hardware .filter[it.name == sensor.name].size > 1)
				error("Duplicate global hardware", GreenhousePackage.eINSTANCE.hardware_Name, VAR_UNIQUE)
		}
		
		@Check
		def void uniqueGlobalSettingActuatorDefinition(SettingActuator actuator){
			if((actuator.eContainer as HardwareSetup).hardware .filter[it.name == actuator.name].size > 1)
				error("Duplicate global hardware", GreenhousePackage.eINSTANCE.hardware_Name, VAR_UNIQUE)
		}
		
		@Check
		def void uniqueLocalSensorDefinition(RowSensor sensor){
			if((sensor.eContainer as Row).elements.filter[
				switch (it){
					RowSensor: it.name.toLowerCase == sensor.name.toLowerCase
					RowActuator: it.name.toLowerCase == sensor.name.toLowerCase
					default: false
				}
			].size > 1)
				error("Duplicate local variable", GreenhousePackage.eINSTANCE.rowSensor_Name, VAR_UNIQUE)
		}
		
		@Check
		def void uniqueGlobalSensorDefinition(GreenhouseSensor sensor){

			if((sensor.eContainer as Greenhouse).elements.filter[
				switch (it){
					GreenhouseActuator: it.name.toLowerCase == sensor.name.toLowerCase
					GreenhouseSensor: it.name.toLowerCase == sensor.name.toLowerCase
					default: false
				}
			].size > 1)
				error("Duplicate local variable", GreenhousePackage.eINSTANCE.rowSensor_Name, VAR_UNIQUE)
		}
		
		@Check
		def void uniqueLocalActuatorDefinition(RowActuator actuator){
			if((actuator.eContainer as Row).elements.filter[
				switch (it){
					RowSensor: it.name.toLowerCase == actuator.name.toLowerCase
					RowActuator: it.name.toLowerCase == actuator.name.toLowerCase
					default: false
				}
			].size > 1)
				error("Duplicate local variable", GreenhousePackage.eINSTANCE.rowActuator_Name, VAR_UNIQUE)
		}
		
		@Check
		def void uniqueLocalStateDefinition(dsl.greenhouse.State state){
			switch(state.eContainer){
				RowSensor: if((state.eContainer as RowSensor).states.filter[ 
						it.name.toLowerCase == state.name.toLowerCase
					].size > 1)
						error("Duplicate local state", GreenhousePackage.eINSTANCE.state_Name, VAR_UNIQUE)
				GreenhouseSensor: if((state.eContainer as GreenhouseSensor).states.filter[ 
						it.name == state.name
					].size > 1)
						error("Duplicate local state", GreenhousePackage.eINSTANCE.state_Name, VAR_UNIQUE)
					}
				
		}
		
		@Check
		def void uniqueTriggerDefinition(Trigger trigger){
			val actuator = trigger.eContainer.eContainer;
			val triggers = EcoreUtil2.getAllContentsOfType(actuator, Trigger)
			if(triggers.filter[ 
						it.name.toLowerCase == trigger.name.toLowerCase
					].size > 1)
						error("Duplicate local trigger", GreenhousePackage.eINSTANCE.trigger_Name, VAR_UNIQUE)

				
		}
	
}
