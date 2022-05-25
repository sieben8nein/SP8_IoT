/**
 * generated by Xtext 2.24.0
 */
package dsl.greenhouse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.greenhouse.Hardware#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see dsl.greenhouse.GreenhousePackage#getHardware()
 * @model
 * @generated
 */
public interface Hardware extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dsl.greenhouse.GreenhousePackage#getHardware_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dsl.greenhouse.Hardware#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Hardware
