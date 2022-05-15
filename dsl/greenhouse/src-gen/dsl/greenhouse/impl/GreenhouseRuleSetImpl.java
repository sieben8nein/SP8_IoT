/**
 * generated by Xtext 2.25.0
 */
package dsl.greenhouse.impl;

import dsl.greenhouse.Action;
import dsl.greenhouse.GreenhouseActuator;
import dsl.greenhouse.GreenhousePackage;
import dsl.greenhouse.GreenhouseRuleSet;
import dsl.greenhouse.GreenhouseSensor;
import dsl.greenhouse.SettingValue;
import dsl.greenhouse.State;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsl.greenhouse.impl.GreenhouseRuleSetImpl#getActuator <em>Actuator</em>}</li>
 *   <li>{@link dsl.greenhouse.impl.GreenhouseRuleSetImpl#getAction <em>Action</em>}</li>
 *   <li>{@link dsl.greenhouse.impl.GreenhouseRuleSetImpl#getSettingvalue <em>Settingvalue</em>}</li>
 *   <li>{@link dsl.greenhouse.impl.GreenhouseRuleSetImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link dsl.greenhouse.impl.GreenhouseRuleSetImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GreenhouseRuleSetImpl extends GreenhouseElementImpl implements GreenhouseRuleSet
{
  /**
   * The cached value of the '{@link #getActuator() <em>Actuator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActuator()
   * @generated
   * @ordered
   */
  protected GreenhouseActuator actuator;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

  /**
   * The cached value of the '{@link #getSettingvalue() <em>Settingvalue</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSettingvalue()
   * @generated
   * @ordered
   */
  protected SettingValue settingvalue;

  /**
   * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensor()
   * @generated
   * @ordered
   */
  protected GreenhouseSensor sensor;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected State state;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GreenhouseRuleSetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GreenhousePackage.Literals.GREENHOUSE_RULE_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GreenhouseActuator getActuator()
  {
    if (actuator != null && actuator.eIsProxy())
    {
      InternalEObject oldActuator = (InternalEObject)actuator;
      actuator = (GreenhouseActuator)eResolveProxy(oldActuator);
      if (actuator != oldActuator)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GreenhousePackage.GREENHOUSE_RULE_SET__ACTUATOR, oldActuator, actuator));
      }
    }
    return actuator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreenhouseActuator basicGetActuator()
  {
    return actuator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setActuator(GreenhouseActuator newActuator)
  {
    GreenhouseActuator oldActuator = actuator;
    actuator = newActuator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreenhousePackage.GREENHOUSE_RULE_SET__ACTUATOR, oldActuator, actuator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action getAction()
  {
    if (action != null && action.eIsProxy())
    {
      InternalEObject oldAction = (InternalEObject)action;
      action = (Action)eResolveProxy(oldAction);
      if (action != oldAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GreenhousePackage.GREENHOUSE_RULE_SET__ACTION, oldAction, action));
      }
    }
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action basicGetAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAction(Action newAction)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreenhousePackage.GREENHOUSE_RULE_SET__ACTION, oldAction, action));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SettingValue getSettingvalue()
  {
    if (settingvalue != null && settingvalue.eIsProxy())
    {
      InternalEObject oldSettingvalue = (InternalEObject)settingvalue;
      settingvalue = (SettingValue)eResolveProxy(oldSettingvalue);
      if (settingvalue != oldSettingvalue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GreenhousePackage.GREENHOUSE_RULE_SET__SETTINGVALUE, oldSettingvalue, settingvalue));
      }
    }
    return settingvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SettingValue basicGetSettingvalue()
  {
    return settingvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSettingvalue(SettingValue newSettingvalue)
  {
    SettingValue oldSettingvalue = settingvalue;
    settingvalue = newSettingvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreenhousePackage.GREENHOUSE_RULE_SET__SETTINGVALUE, oldSettingvalue, settingvalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GreenhouseSensor getSensor()
  {
    if (sensor != null && sensor.eIsProxy())
    {
      InternalEObject oldSensor = (InternalEObject)sensor;
      sensor = (GreenhouseSensor)eResolveProxy(oldSensor);
      if (sensor != oldSensor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GreenhousePackage.GREENHOUSE_RULE_SET__SENSOR, oldSensor, sensor));
      }
    }
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreenhouseSensor basicGetSensor()
  {
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSensor(GreenhouseSensor newSensor)
  {
    GreenhouseSensor oldSensor = sensor;
    sensor = newSensor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreenhousePackage.GREENHOUSE_RULE_SET__SENSOR, oldSensor, sensor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State getState()
  {
    if (state != null && state.eIsProxy())
    {
      InternalEObject oldState = (InternalEObject)state;
      state = (State)eResolveProxy(oldState);
      if (state != oldState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GreenhousePackage.GREENHOUSE_RULE_SET__STATE, oldState, state));
      }
    }
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setState(State newState)
  {
    State oldState = state;
    state = newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreenhousePackage.GREENHOUSE_RULE_SET__STATE, oldState, state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GreenhousePackage.GREENHOUSE_RULE_SET__ACTUATOR:
        if (resolve) return getActuator();
        return basicGetActuator();
      case GreenhousePackage.GREENHOUSE_RULE_SET__ACTION:
        if (resolve) return getAction();
        return basicGetAction();
      case GreenhousePackage.GREENHOUSE_RULE_SET__SETTINGVALUE:
        if (resolve) return getSettingvalue();
        return basicGetSettingvalue();
      case GreenhousePackage.GREENHOUSE_RULE_SET__SENSOR:
        if (resolve) return getSensor();
        return basicGetSensor();
      case GreenhousePackage.GREENHOUSE_RULE_SET__STATE:
        if (resolve) return getState();
        return basicGetState();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GreenhousePackage.GREENHOUSE_RULE_SET__ACTUATOR:
        setActuator((GreenhouseActuator)newValue);
        return;
      case GreenhousePackage.GREENHOUSE_RULE_SET__ACTION:
        setAction((Action)newValue);
        return;
      case GreenhousePackage.GREENHOUSE_RULE_SET__SETTINGVALUE:
        setSettingvalue((SettingValue)newValue);
        return;
      case GreenhousePackage.GREENHOUSE_RULE_SET__SENSOR:
        setSensor((GreenhouseSensor)newValue);
        return;
      case GreenhousePackage.GREENHOUSE_RULE_SET__STATE:
        setState((State)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GreenhousePackage.GREENHOUSE_RULE_SET__ACTUATOR:
        setActuator((GreenhouseActuator)null);
        return;
      case GreenhousePackage.GREENHOUSE_RULE_SET__ACTION:
        setAction((Action)null);
        return;
      case GreenhousePackage.GREENHOUSE_RULE_SET__SETTINGVALUE:
        setSettingvalue((SettingValue)null);
        return;
      case GreenhousePackage.GREENHOUSE_RULE_SET__SENSOR:
        setSensor((GreenhouseSensor)null);
        return;
      case GreenhousePackage.GREENHOUSE_RULE_SET__STATE:
        setState((State)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GreenhousePackage.GREENHOUSE_RULE_SET__ACTUATOR:
        return actuator != null;
      case GreenhousePackage.GREENHOUSE_RULE_SET__ACTION:
        return action != null;
      case GreenhousePackage.GREENHOUSE_RULE_SET__SETTINGVALUE:
        return settingvalue != null;
      case GreenhousePackage.GREENHOUSE_RULE_SET__SENSOR:
        return sensor != null;
      case GreenhousePackage.GREENHOUSE_RULE_SET__STATE:
        return state != null;
    }
    return super.eIsSet(featureID);
  }

} //GreenhouseRuleSetImpl
