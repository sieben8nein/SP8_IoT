/**
 * generated by Xtext 2.25.0
 */
package dsl.greenhouse.impl;

import dsl.greenhouse.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GreenhouseFactoryImpl extends EFactoryImpl implements GreenhouseFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GreenhouseFactory init()
  {
    try
    {
      GreenhouseFactory theGreenhouseFactory = (GreenhouseFactory)EPackage.Registry.INSTANCE.getEFactory(GreenhousePackage.eNS_URI);
      if (theGreenhouseFactory != null)
      {
        return theGreenhouseFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GreenhouseFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreenhouseFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GreenhousePackage.MODEL: return createModel();
      case GreenhousePackage.HARDWARE_SETUP: return createHardwareSetup();
      case GreenhousePackage.HARDWARE: return createHardware();
      case GreenhousePackage.SETTING_ACTUATOR: return createSettingActuator();
      case GreenhousePackage.SETTING_SENSOR: return createSettingSensor();
      case GreenhousePackage.TOPIC: return createTopic();
      case GreenhousePackage.SETTING_ACTION: return createSettingAction();
      case GreenhousePackage.SETTING_VALUE: return createSettingValue();
      case GreenhousePackage.GREENHOUSE: return createGreenhouse();
      case GreenhousePackage.ROW: return createRow();
      case GreenhousePackage.GREENHOUSE_ELEMENT: return createGreenhouseElement();
      case GreenhousePackage.ROW_ELEMENT: return createRowElement();
      case GreenhousePackage.GREENHOUSE_ACTUATOR: return createGreenhouseActuator();
      case GreenhousePackage.ROW_ACTUATOR: return createRowActuator();
      case GreenhousePackage.GREENHOUSE_SENSOR: return createGreenhouseSensor();
      case GreenhousePackage.ROW_SENSOR: return createRowSensor();
      case GreenhousePackage.STATE: return createState();
      case GreenhousePackage.VARIABLE: return createVariable();
      case GreenhousePackage.ACTION: return createAction();
      case GreenhousePackage.TRIGGER: return createTrigger();
      case GreenhousePackage.CONDITION: return createCondition();
      case GreenhousePackage.VALUE: return createValue();
      case GreenhousePackage.ROW_RULE_SET: return createRowRuleSet();
      case GreenhousePackage.GREENHOUSE_RULE_SET: return createGreenhouseRuleSet();
      case GreenhousePackage.SETTING: return createSetting();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HardwareSetup createHardwareSetup()
  {
    HardwareSetupImpl hardwareSetup = new HardwareSetupImpl();
    return hardwareSetup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Hardware createHardware()
  {
    HardwareImpl hardware = new HardwareImpl();
    return hardware;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SettingActuator createSettingActuator()
  {
    SettingActuatorImpl settingActuator = new SettingActuatorImpl();
    return settingActuator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SettingSensor createSettingSensor()
  {
    SettingSensorImpl settingSensor = new SettingSensorImpl();
    return settingSensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Topic createTopic()
  {
    TopicImpl topic = new TopicImpl();
    return topic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SettingAction createSettingAction()
  {
    SettingActionImpl settingAction = new SettingActionImpl();
    return settingAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SettingValue createSettingValue()
  {
    SettingValueImpl settingValue = new SettingValueImpl();
    return settingValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Greenhouse createGreenhouse()
  {
    GreenhouseImpl greenhouse = new GreenhouseImpl();
    return greenhouse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Row createRow()
  {
    RowImpl row = new RowImpl();
    return row;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GreenhouseElement createGreenhouseElement()
  {
    GreenhouseElementImpl greenhouseElement = new GreenhouseElementImpl();
    return greenhouseElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RowElement createRowElement()
  {
    RowElementImpl rowElement = new RowElementImpl();
    return rowElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GreenhouseActuator createGreenhouseActuator()
  {
    GreenhouseActuatorImpl greenhouseActuator = new GreenhouseActuatorImpl();
    return greenhouseActuator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RowActuator createRowActuator()
  {
    RowActuatorImpl rowActuator = new RowActuatorImpl();
    return rowActuator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GreenhouseSensor createGreenhouseSensor()
  {
    GreenhouseSensorImpl greenhouseSensor = new GreenhouseSensorImpl();
    return greenhouseSensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RowSensor createRowSensor()
  {
    RowSensorImpl rowSensor = new RowSensorImpl();
    return rowSensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Trigger createTrigger()
  {
    TriggerImpl trigger = new TriggerImpl();
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RowRuleSet createRowRuleSet()
  {
    RowRuleSetImpl rowRuleSet = new RowRuleSetImpl();
    return rowRuleSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GreenhouseRuleSet createGreenhouseRuleSet()
  {
    GreenhouseRuleSetImpl greenhouseRuleSet = new GreenhouseRuleSetImpl();
    return greenhouseRuleSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Setting createSetting()
  {
    SettingImpl setting = new SettingImpl();
    return setting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GreenhousePackage getGreenhousePackage()
  {
    return (GreenhousePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GreenhousePackage getPackage()
  {
    return GreenhousePackage.eINSTANCE;
  }

} //GreenhouseFactoryImpl