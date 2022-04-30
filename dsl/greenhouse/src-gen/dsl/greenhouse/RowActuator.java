/**
 * generated by Xtext 2.25.0
 */
package dsl.greenhouse;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.greenhouse.RowActuator#getName <em>Name</em>}</li>
 *   <li>{@link dsl.greenhouse.RowActuator#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see dsl.greenhouse.GreenhousePackage#getRowActuator()
 * @model
 * @generated
 */
public interface RowActuator extends RowElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dsl.greenhouse.GreenhousePackage#getRowActuator_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dsl.greenhouse.RowActuator#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference list.
   * The list contents are of type {@link dsl.greenhouse.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference list.
   * @see dsl.greenhouse.GreenhousePackage#getRowActuator_Action()
   * @model containment="true"
   * @generated
   */
  EList<Action> getAction();

} // RowActuator
