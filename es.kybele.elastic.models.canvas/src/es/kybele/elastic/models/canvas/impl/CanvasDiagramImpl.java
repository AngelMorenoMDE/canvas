/**
 */
package es.kybele.elastic.models.canvas.impl;

import es.kybele.elastic.models.canvas.CanvasAnnotation;
import es.kybele.elastic.models.canvas.CanvasBusinessModel;
import es.kybele.elastic.models.canvas.CanvasDiagram;
import es.kybele.elastic.models.canvas.CanvasPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.kybele.elastic.models.canvas.impl.CanvasDiagramImpl#getInCanvasBusinessModel <em>In Canvas Business Model</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.impl.CanvasDiagramImpl#getHasKeyPartnersAnnotations <em>Has Key Partners Annotations</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.impl.CanvasDiagramImpl#getHasKeyActivitiesAnnotations <em>Has Key Activities Annotations</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.impl.CanvasDiagramImpl#getHasKeyResourcesAnnotations <em>Has Key Resources Annotations</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.impl.CanvasDiagramImpl#getHasValuePropositionsAnnotations <em>Has Value Propositions Annotations</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.impl.CanvasDiagramImpl#getHasCustomerRelationshipsAnnotations <em>Has Customer Relationships Annotations</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.impl.CanvasDiagramImpl#getHasChannelsAnnotations <em>Has Channels Annotations</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.impl.CanvasDiagramImpl#getHasCustomerSegmentsAnnotations <em>Has Customer Segments Annotations</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.impl.CanvasDiagramImpl#getHasCostStructureAnnotations <em>Has Cost Structure Annotations</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.impl.CanvasDiagramImpl#getHasRevenueStreamsAnnotations <em>Has Revenue Streams Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CanvasDiagramImpl extends MinimalEObjectImpl.Container implements CanvasDiagram {
	/**
	 * The cached value of the '{@link #getHasKeyPartnersAnnotations() <em>Has Key Partners Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasKeyPartnersAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<CanvasAnnotation> hasKeyPartnersAnnotations;

	/**
	 * The cached value of the '{@link #getHasKeyActivitiesAnnotations() <em>Has Key Activities Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasKeyActivitiesAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<CanvasAnnotation> hasKeyActivitiesAnnotations;

	/**
	 * The cached value of the '{@link #getHasKeyResourcesAnnotations() <em>Has Key Resources Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasKeyResourcesAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<CanvasAnnotation> hasKeyResourcesAnnotations;

	/**
	 * The cached value of the '{@link #getHasValuePropositionsAnnotations() <em>Has Value Propositions Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValuePropositionsAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<CanvasAnnotation> hasValuePropositionsAnnotations;

	/**
	 * The cached value of the '{@link #getHasCustomerRelationshipsAnnotations() <em>Has Customer Relationships Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCustomerRelationshipsAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<CanvasAnnotation> hasCustomerRelationshipsAnnotations;

	/**
	 * The cached value of the '{@link #getHasChannelsAnnotations() <em>Has Channels Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasChannelsAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<CanvasAnnotation> hasChannelsAnnotations;

	/**
	 * The cached value of the '{@link #getHasCustomerSegmentsAnnotations() <em>Has Customer Segments Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCustomerSegmentsAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<CanvasAnnotation> hasCustomerSegmentsAnnotations;

	/**
	 * The cached value of the '{@link #getHasCostStructureAnnotations() <em>Has Cost Structure Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCostStructureAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<CanvasAnnotation> hasCostStructureAnnotations;

	/**
	 * The cached value of the '{@link #getHasRevenueStreamsAnnotations() <em>Has Revenue Streams Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRevenueStreamsAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<CanvasAnnotation> hasRevenueStreamsAnnotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanvasDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanvasPackage.Literals.CANVAS_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasBusinessModel getInCanvasBusinessModel() {
		if (eContainerFeatureID() != CanvasPackage.CANVAS_DIAGRAM__IN_CANVAS_BUSINESS_MODEL) return null;
		return (CanvasBusinessModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInCanvasBusinessModel(CanvasBusinessModel newInCanvasBusinessModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInCanvasBusinessModel, CanvasPackage.CANVAS_DIAGRAM__IN_CANVAS_BUSINESS_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInCanvasBusinessModel(CanvasBusinessModel newInCanvasBusinessModel) {
		if (newInCanvasBusinessModel != eInternalContainer() || (eContainerFeatureID() != CanvasPackage.CANVAS_DIAGRAM__IN_CANVAS_BUSINESS_MODEL && newInCanvasBusinessModel != null)) {
			if (EcoreUtil.isAncestor(this, newInCanvasBusinessModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInCanvasBusinessModel != null)
				msgs = ((InternalEObject)newInCanvasBusinessModel).eInverseAdd(this, CanvasPackage.CANVAS_BUSINESS_MODEL__CANVAS_DIAGRAM, CanvasBusinessModel.class, msgs);
			msgs = basicSetInCanvasBusinessModel(newInCanvasBusinessModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.CANVAS_DIAGRAM__IN_CANVAS_BUSINESS_MODEL, newInCanvasBusinessModel, newInCanvasBusinessModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CanvasAnnotation> getHasKeyPartnersAnnotations() {
		if (hasKeyPartnersAnnotations == null) {
			hasKeyPartnersAnnotations = new EObjectContainmentEList<CanvasAnnotation>(CanvasAnnotation.class, this, CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_PARTNERS_ANNOTATIONS);
		}
		return hasKeyPartnersAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CanvasAnnotation> getHasKeyActivitiesAnnotations() {
		if (hasKeyActivitiesAnnotations == null) {
			hasKeyActivitiesAnnotations = new EObjectContainmentEList<CanvasAnnotation>(CanvasAnnotation.class, this, CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_ACTIVITIES_ANNOTATIONS);
		}
		return hasKeyActivitiesAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CanvasAnnotation> getHasKeyResourcesAnnotations() {
		if (hasKeyResourcesAnnotations == null) {
			hasKeyResourcesAnnotations = new EObjectContainmentEList<CanvasAnnotation>(CanvasAnnotation.class, this, CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_RESOURCES_ANNOTATIONS);
		}
		return hasKeyResourcesAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CanvasAnnotation> getHasValuePropositionsAnnotations() {
		if (hasValuePropositionsAnnotations == null) {
			hasValuePropositionsAnnotations = new EObjectContainmentEList<CanvasAnnotation>(CanvasAnnotation.class, this, CanvasPackage.CANVAS_DIAGRAM__HAS_VALUE_PROPOSITIONS_ANNOTATIONS);
		}
		return hasValuePropositionsAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CanvasAnnotation> getHasCustomerRelationshipsAnnotations() {
		if (hasCustomerRelationshipsAnnotations == null) {
			hasCustomerRelationshipsAnnotations = new EObjectContainmentEList<CanvasAnnotation>(CanvasAnnotation.class, this, CanvasPackage.CANVAS_DIAGRAM__HAS_CUSTOMER_RELATIONSHIPS_ANNOTATIONS);
		}
		return hasCustomerRelationshipsAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CanvasAnnotation> getHasChannelsAnnotations() {
		if (hasChannelsAnnotations == null) {
			hasChannelsAnnotations = new EObjectContainmentEList<CanvasAnnotation>(CanvasAnnotation.class, this, CanvasPackage.CANVAS_DIAGRAM__HAS_CHANNELS_ANNOTATIONS);
		}
		return hasChannelsAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CanvasAnnotation> getHasCustomerSegmentsAnnotations() {
		if (hasCustomerSegmentsAnnotations == null) {
			hasCustomerSegmentsAnnotations = new EObjectContainmentEList<CanvasAnnotation>(CanvasAnnotation.class, this, CanvasPackage.CANVAS_DIAGRAM__HAS_CUSTOMER_SEGMENTS_ANNOTATIONS);
		}
		return hasCustomerSegmentsAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CanvasAnnotation> getHasCostStructureAnnotations() {
		if (hasCostStructureAnnotations == null) {
			hasCostStructureAnnotations = new EObjectContainmentEList<CanvasAnnotation>(CanvasAnnotation.class, this, CanvasPackage.CANVAS_DIAGRAM__HAS_COST_STRUCTURE_ANNOTATIONS);
		}
		return hasCostStructureAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CanvasAnnotation> getHasRevenueStreamsAnnotations() {
		if (hasRevenueStreamsAnnotations == null) {
			hasRevenueStreamsAnnotations = new EObjectContainmentEList<CanvasAnnotation>(CanvasAnnotation.class, this, CanvasPackage.CANVAS_DIAGRAM__HAS_REVENUE_STREAMS_ANNOTATIONS);
		}
		return hasRevenueStreamsAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanvasPackage.CANVAS_DIAGRAM__IN_CANVAS_BUSINESS_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInCanvasBusinessModel((CanvasBusinessModel)otherEnd, msgs);
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
			case CanvasPackage.CANVAS_DIAGRAM__IN_CANVAS_BUSINESS_MODEL:
				return basicSetInCanvasBusinessModel(null, msgs);
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_PARTNERS_ANNOTATIONS:
				return ((InternalEList<?>)getHasKeyPartnersAnnotations()).basicRemove(otherEnd, msgs);
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_ACTIVITIES_ANNOTATIONS:
				return ((InternalEList<?>)getHasKeyActivitiesAnnotations()).basicRemove(otherEnd, msgs);
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_RESOURCES_ANNOTATIONS:
				return ((InternalEList<?>)getHasKeyResourcesAnnotations()).basicRemove(otherEnd, msgs);
			case CanvasPackage.CANVAS_DIAGRAM__HAS_VALUE_PROPOSITIONS_ANNOTATIONS:
				return ((InternalEList<?>)getHasValuePropositionsAnnotations()).basicRemove(otherEnd, msgs);
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CUSTOMER_RELATIONSHIPS_ANNOTATIONS:
				return ((InternalEList<?>)getHasCustomerRelationshipsAnnotations()).basicRemove(otherEnd, msgs);
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CHANNELS_ANNOTATIONS:
				return ((InternalEList<?>)getHasChannelsAnnotations()).basicRemove(otherEnd, msgs);
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CUSTOMER_SEGMENTS_ANNOTATIONS:
				return ((InternalEList<?>)getHasCustomerSegmentsAnnotations()).basicRemove(otherEnd, msgs);
			case CanvasPackage.CANVAS_DIAGRAM__HAS_COST_STRUCTURE_ANNOTATIONS:
				return ((InternalEList<?>)getHasCostStructureAnnotations()).basicRemove(otherEnd, msgs);
			case CanvasPackage.CANVAS_DIAGRAM__HAS_REVENUE_STREAMS_ANNOTATIONS:
				return ((InternalEList<?>)getHasRevenueStreamsAnnotations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CanvasPackage.CANVAS_DIAGRAM__IN_CANVAS_BUSINESS_MODEL:
				return eInternalContainer().eInverseRemove(this, CanvasPackage.CANVAS_BUSINESS_MODEL__CANVAS_DIAGRAM, CanvasBusinessModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanvasPackage.CANVAS_DIAGRAM__IN_CANVAS_BUSINESS_MODEL:
				return getInCanvasBusinessModel();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_PARTNERS_ANNOTATIONS:
				return getHasKeyPartnersAnnotations();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_ACTIVITIES_ANNOTATIONS:
				return getHasKeyActivitiesAnnotations();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_RESOURCES_ANNOTATIONS:
				return getHasKeyResourcesAnnotations();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_VALUE_PROPOSITIONS_ANNOTATIONS:
				return getHasValuePropositionsAnnotations();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CUSTOMER_RELATIONSHIPS_ANNOTATIONS:
				return getHasCustomerRelationshipsAnnotations();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CHANNELS_ANNOTATIONS:
				return getHasChannelsAnnotations();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CUSTOMER_SEGMENTS_ANNOTATIONS:
				return getHasCustomerSegmentsAnnotations();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_COST_STRUCTURE_ANNOTATIONS:
				return getHasCostStructureAnnotations();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_REVENUE_STREAMS_ANNOTATIONS:
				return getHasRevenueStreamsAnnotations();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CanvasPackage.CANVAS_DIAGRAM__IN_CANVAS_BUSINESS_MODEL:
				setInCanvasBusinessModel((CanvasBusinessModel)newValue);
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_PARTNERS_ANNOTATIONS:
				getHasKeyPartnersAnnotations().clear();
				getHasKeyPartnersAnnotations().addAll((Collection<? extends CanvasAnnotation>)newValue);
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_ACTIVITIES_ANNOTATIONS:
				getHasKeyActivitiesAnnotations().clear();
				getHasKeyActivitiesAnnotations().addAll((Collection<? extends CanvasAnnotation>)newValue);
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_RESOURCES_ANNOTATIONS:
				getHasKeyResourcesAnnotations().clear();
				getHasKeyResourcesAnnotations().addAll((Collection<? extends CanvasAnnotation>)newValue);
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_VALUE_PROPOSITIONS_ANNOTATIONS:
				getHasValuePropositionsAnnotations().clear();
				getHasValuePropositionsAnnotations().addAll((Collection<? extends CanvasAnnotation>)newValue);
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CUSTOMER_RELATIONSHIPS_ANNOTATIONS:
				getHasCustomerRelationshipsAnnotations().clear();
				getHasCustomerRelationshipsAnnotations().addAll((Collection<? extends CanvasAnnotation>)newValue);
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CHANNELS_ANNOTATIONS:
				getHasChannelsAnnotations().clear();
				getHasChannelsAnnotations().addAll((Collection<? extends CanvasAnnotation>)newValue);
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CUSTOMER_SEGMENTS_ANNOTATIONS:
				getHasCustomerSegmentsAnnotations().clear();
				getHasCustomerSegmentsAnnotations().addAll((Collection<? extends CanvasAnnotation>)newValue);
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_COST_STRUCTURE_ANNOTATIONS:
				getHasCostStructureAnnotations().clear();
				getHasCostStructureAnnotations().addAll((Collection<? extends CanvasAnnotation>)newValue);
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_REVENUE_STREAMS_ANNOTATIONS:
				getHasRevenueStreamsAnnotations().clear();
				getHasRevenueStreamsAnnotations().addAll((Collection<? extends CanvasAnnotation>)newValue);
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
			case CanvasPackage.CANVAS_DIAGRAM__IN_CANVAS_BUSINESS_MODEL:
				setInCanvasBusinessModel((CanvasBusinessModel)null);
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_PARTNERS_ANNOTATIONS:
				getHasKeyPartnersAnnotations().clear();
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_ACTIVITIES_ANNOTATIONS:
				getHasKeyActivitiesAnnotations().clear();
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_RESOURCES_ANNOTATIONS:
				getHasKeyResourcesAnnotations().clear();
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_VALUE_PROPOSITIONS_ANNOTATIONS:
				getHasValuePropositionsAnnotations().clear();
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CUSTOMER_RELATIONSHIPS_ANNOTATIONS:
				getHasCustomerRelationshipsAnnotations().clear();
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CHANNELS_ANNOTATIONS:
				getHasChannelsAnnotations().clear();
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CUSTOMER_SEGMENTS_ANNOTATIONS:
				getHasCustomerSegmentsAnnotations().clear();
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_COST_STRUCTURE_ANNOTATIONS:
				getHasCostStructureAnnotations().clear();
				return;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_REVENUE_STREAMS_ANNOTATIONS:
				getHasRevenueStreamsAnnotations().clear();
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
			case CanvasPackage.CANVAS_DIAGRAM__IN_CANVAS_BUSINESS_MODEL:
				return getInCanvasBusinessModel() != null;
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_PARTNERS_ANNOTATIONS:
				return hasKeyPartnersAnnotations != null && !hasKeyPartnersAnnotations.isEmpty();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_ACTIVITIES_ANNOTATIONS:
				return hasKeyActivitiesAnnotations != null && !hasKeyActivitiesAnnotations.isEmpty();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_RESOURCES_ANNOTATIONS:
				return hasKeyResourcesAnnotations != null && !hasKeyResourcesAnnotations.isEmpty();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_VALUE_PROPOSITIONS_ANNOTATIONS:
				return hasValuePropositionsAnnotations != null && !hasValuePropositionsAnnotations.isEmpty();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CUSTOMER_RELATIONSHIPS_ANNOTATIONS:
				return hasCustomerRelationshipsAnnotations != null && !hasCustomerRelationshipsAnnotations.isEmpty();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CHANNELS_ANNOTATIONS:
				return hasChannelsAnnotations != null && !hasChannelsAnnotations.isEmpty();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CUSTOMER_SEGMENTS_ANNOTATIONS:
				return hasCustomerSegmentsAnnotations != null && !hasCustomerSegmentsAnnotations.isEmpty();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_COST_STRUCTURE_ANNOTATIONS:
				return hasCostStructureAnnotations != null && !hasCostStructureAnnotations.isEmpty();
			case CanvasPackage.CANVAS_DIAGRAM__HAS_REVENUE_STREAMS_ANNOTATIONS:
				return hasRevenueStreamsAnnotations != null && !hasRevenueStreamsAnnotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CanvasDiagramImpl
