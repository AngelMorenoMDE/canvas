/**
 */
package es.kybele.elastic.models.canvas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.kybele.elastic.models.canvas.CanvasAnnotation#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.kybele.elastic.models.canvas.CanvasPackage#getCanvasAnnotation()
 * @model
 * @generated
 */
public interface CanvasAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see es.kybele.elastic.models.canvas.CanvasPackage#getCanvasAnnotation_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link es.kybele.elastic.models.canvas.CanvasAnnotation#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // CanvasAnnotation
