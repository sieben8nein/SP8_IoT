/**
 * generated by Xtext 2.24.0
 */
package dsl.greenhouse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.greenhouse.Row#getName <em>Name</em>}</li>
 *   <li>{@link dsl.greenhouse.Row#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see dsl.greenhouse.GreenhousePackage#getRow()
 * @model
 * @generated
 */
public interface Row extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dsl.greenhouse.GreenhousePackage#getRow_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dsl.greenhouse.Row#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link dsl.greenhouse.RowElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see dsl.greenhouse.GreenhousePackage#getRow_Elements()
   * @model containment="true"
   * @generated
   */
  EList<RowElement> getElements();

} // Row
