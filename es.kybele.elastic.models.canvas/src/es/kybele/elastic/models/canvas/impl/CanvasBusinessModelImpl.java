/**
 */
package es.kybele.elastic.models.canvas.impl;

import es.kybele.elastic.models.canvas.CanvasBusinessModel;
import es.kybele.elastic.models.canvas.CanvasDiagram;
import es.kybele.elastic.models.canvas.CanvasPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.kybele.elastic.models.canvas.impl.CanvasBusinessModelImpl#getCanvasDiagram <em>Canvas Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CanvasBusinessModelImpl extends MinimalEObjectImpl.Container implements CanvasBusinessModel {
	/**
	 * The cached value of the '{@link #getCanvasDiagram() <em>Canvas Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanvasDiagram()
	 * @generated
	 * @ordered
	 */
	protected CanvasDiagram canvasDiagram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanvasBusinessModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanvasPackage.Literals.CANVAS_BUSINESS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasDiagram getCanvasDiagram() {
		return canvasDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCanvasDiagram(CanvasDiagram newCanvasDiagram, NotificationChain msgs) {
		CanvasDiagram oldCanvasDiagram = canvasDiagram;
		canvasDiagram = newCanvasDiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanvasPackage.CANVAS_BUSINESS_MODEL__CANVAS_DIAGRAM, oldCanvasDiagram, newCanvasDiagram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanvasDiagram(CanvasDiagram newCanvasDiagram) {
		if (newCanvasDiagram != canvasDiagram) {
			NotificationChain msgs = null;
			if (canvasDiagram != null)
				msgs = ((InternalEObject)canvasDiagram).eInverseRemove(this, CanvasPackage.CANVAS_DIAGRAM__IN_CANVAS_BUSINESS_MODEL, CanvasDiagram.class, msgs);
			if (newCanvasDiagram != null)
				msgs = ((InternalEObject)newCanvasDiagram).eInverseAdd(this, CanvasPackage.CANVAS_DIAGRAM__IN_CANVAS_BUSINESS_MODEL, CanvasDiagram.class, msgs);
			msgs = basicSetCanvasDiagram(newCanvasDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.CANVAS_BUSINESS_MODEL__CANVAS_DIAGRAM, newCanvasDiagram, newCanvasDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanvasPackage.CANVAS_BUSINESS_MODEL__CANVAS_DIAGRAM:
				if (canvasDiagram != null)
					msgs = ((InternalEObject)canvasDiagram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanvasPackage.CANVAS_BUSINESS_MODEL__CANVAS_DIAGRAM, null, msgs);
				return basicSetCanvasDiagram((CanvasDiagram)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanvasPackage.CANVAS_BUSINESS_MODEL__CANVAS_DIAGRAM:
				return basicSetCanvasDiagram(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanvasPackage.CANVAS_BUSINESS_MODEL__CANVAS_DIAGRAM:
				return getCanvasDiagram();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CanvasPackage.CANVAS_BUSINESS_MODEL__CANVAS_DIAGRAM:
				setCanvasDiagram((CanvasDiagram)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CanvasPackage.CANVAS_BUSINESS_MODEL__CANVAS_DIAGRAM:
				setCanvasDiagram((CanvasDiagram)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CanvasPackage.CANVAS_BUSINESS_MODEL__CANVAS_DIAGRAM:
				return canvasDiagram != null;
		}
		return super.eIsSet(featureID);
	}

} //CanvasBusinessModelImpl
