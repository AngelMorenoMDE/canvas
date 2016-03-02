/**
 */
package es.kybele.elastic.models.canvas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.kybele.elastic.models.canvas.CanvasBusinessModel#getCanvasDiagram <em>Canvas Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.kybele.elastic.models.canvas.CanvasPackage#getCanvasBusinessModel()
 * @model
 * @generated
 */
public interface CanvasBusinessModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Canvas Diagram</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.kybele.elastic.models.canvas.CanvasDiagram#getInCanvasBusinessModel <em>In Canvas Business Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canvas Diagram</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canvas Diagram</em>' containment reference.
	 * @see #setCanvasDiagram(CanvasDiagram)
	 * @see es.kybele.elastic.models.canvas.CanvasPackage#getCanvasBusinessModel_CanvasDiagram()
	 * @see es.kybele.elastic.models.canvas.CanvasDiagram#getInCanvasBusinessModel
	 * @model opposite="inCanvasBusinessModel" containment="true"
	 * @generated
	 */
	CanvasDiagram getCanvasDiagram();

	/**
	 * Sets the value of the '{@link es.kybele.elastic.models.canvas.CanvasBusinessModel#getCanvasDiagram <em>Canvas Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canvas Diagram</em>' containment reference.
	 * @see #getCanvasDiagram()
	 * @generated
	 */
	void setCanvasDiagram(CanvasDiagram value);

} // CanvasBusinessModel
