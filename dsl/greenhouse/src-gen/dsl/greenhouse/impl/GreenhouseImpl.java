/**
 * generated by Xtext 2.24.0
 */
package dsl.greenhouse.impl;

import dsl.greenhouse.Greenhouse;
import dsl.greenhouse.GreenhouseElement;
import dsl.greenhouse.GreenhousePackage;
import dsl.greenhouse.Row;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Greenhouse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsl.greenhouse.impl.GreenhouseImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsl.greenhouse.impl.GreenhouseImpl#getRow <em>Row</em>}</li>
 *   <li>{@link dsl.greenhouse.impl.GreenhouseImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GreenhouseImpl extends MinimalEObjectImpl.Container implements Greenhouse
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRow() <em>Row</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRow()
   * @generated
   * @ordered
   */
  protected EList<Row> row;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<GreenhouseElement> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GreenhouseImpl()
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
    return GreenhousePackage.Literals.GREENHOUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreenhousePackage.GREENHOUSE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Row> getRow()
  {
    if (row == null)
    {
      row = new EObjectContainmentEList<Row>(Row.class, this, GreenhousePackage.GREENHOUSE__ROW);
    }
    return row;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GreenhouseElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<GreenhouseElement>(GreenhouseElement.class, this, GreenhousePackage.GREENHOUSE__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GreenhousePackage.GREENHOUSE__ROW:
        return ((InternalEList<?>)getRow()).basicRemove(otherEnd, msgs);
      case GreenhousePackage.GREENHOUSE__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GreenhousePackage.GREENHOUSE__NAME:
        return getName();
      case GreenhousePackage.GREENHOUSE__ROW:
        return getRow();
      case GreenhousePackage.GREENHOUSE__ELEMENTS:
        return getElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GreenhousePackage.GREENHOUSE__NAME:
        setName((String)newValue);
        return;
      case GreenhousePackage.GREENHOUSE__ROW:
        getRow().clear();
        getRow().addAll((Collection<? extends Row>)newValue);
        return;
      case GreenhousePackage.GREENHOUSE__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends GreenhouseElement>)newValue);
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
      case GreenhousePackage.GREENHOUSE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GreenhousePackage.GREENHOUSE__ROW:
        getRow().clear();
        return;
      case GreenhousePackage.GREENHOUSE__ELEMENTS:
        getElements().clear();
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
      case GreenhousePackage.GREENHOUSE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GreenhousePackage.GREENHOUSE__ROW:
        return row != null && !row.isEmpty();
      case GreenhousePackage.GREENHOUSE__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //GreenhouseImpl
