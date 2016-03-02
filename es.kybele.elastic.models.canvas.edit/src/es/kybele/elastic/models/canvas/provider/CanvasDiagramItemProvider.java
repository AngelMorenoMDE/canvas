/**
 */
package es.kybele.elastic.models.canvas.provider;


import es.kybele.elastic.models.canvas.CanvasDiagram;
import es.kybele.elastic.models.canvas.CanvasFactory;
import es.kybele.elastic.models.canvas.CanvasPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link es.kybele.elastic.models.canvas.CanvasDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CanvasDiagramItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasDiagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_KEY_PARTNERS_ANNOTATIONS);
			childrenFeatures.add(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_KEY_ACTIVITIES_ANNOTATIONS);
			childrenFeatures.add(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_KEY_RESOURCES_ANNOTATIONS);
			childrenFeatures.add(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_VALUE_PROPOSITIONS_ANNOTATIONS);
			childrenFeatures.add(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_CUSTOMER_RELATIONSHIPS_ANNOTATIONS);
			childrenFeatures.add(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_CHANNELS_ANNOTATIONS);
			childrenFeatures.add(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_CUSTOMER_SEGMENTS_ANNOTATIONS);
			childrenFeatures.add(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_COST_STRUCTURE_ANNOTATIONS);
			childrenFeatures.add(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_REVENUE_STREAMS_ANNOTATIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CanvasDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CanvasDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_CanvasDiagram_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CanvasDiagram.class)) {
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_PARTNERS_ANNOTATIONS:
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_ACTIVITIES_ANNOTATIONS:
			case CanvasPackage.CANVAS_DIAGRAM__HAS_KEY_RESOURCES_ANNOTATIONS:
			case CanvasPackage.CANVAS_DIAGRAM__HAS_VALUE_PROPOSITIONS_ANNOTATIONS:
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CUSTOMER_RELATIONSHIPS_ANNOTATIONS:
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CHANNELS_ANNOTATIONS:
			case CanvasPackage.CANVAS_DIAGRAM__HAS_CUSTOMER_SEGMENTS_ANNOTATIONS:
			case CanvasPackage.CANVAS_DIAGRAM__HAS_COST_STRUCTURE_ANNOTATIONS:
			case CanvasPackage.CANVAS_DIAGRAM__HAS_REVENUE_STREAMS_ANNOTATIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_KEY_PARTNERS_ANNOTATIONS,
				 CanvasFactory.eINSTANCE.createCanvasAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_KEY_ACTIVITIES_ANNOTATIONS,
				 CanvasFactory.eINSTANCE.createCanvasAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_KEY_RESOURCES_ANNOTATIONS,
				 CanvasFactory.eINSTANCE.createCanvasAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_VALUE_PROPOSITIONS_ANNOTATIONS,
				 CanvasFactory.eINSTANCE.createCanvasAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_CUSTOMER_RELATIONSHIPS_ANNOTATIONS,
				 CanvasFactory.eINSTANCE.createCanvasAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_CHANNELS_ANNOTATIONS,
				 CanvasFactory.eINSTANCE.createCanvasAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_CUSTOMER_SEGMENTS_ANNOTATIONS,
				 CanvasFactory.eINSTANCE.createCanvasAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_COST_STRUCTURE_ANNOTATIONS,
				 CanvasFactory.eINSTANCE.createCanvasAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_REVENUE_STREAMS_ANNOTATIONS,
				 CanvasFactory.eINSTANCE.createCanvasAnnotation()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_KEY_PARTNERS_ANNOTATIONS ||
			childFeature == CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_KEY_ACTIVITIES_ANNOTATIONS ||
			childFeature == CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_KEY_RESOURCES_ANNOTATIONS ||
			childFeature == CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_VALUE_PROPOSITIONS_ANNOTATIONS ||
			childFeature == CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_CUSTOMER_RELATIONSHIPS_ANNOTATIONS ||
			childFeature == CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_CHANNELS_ANNOTATIONS ||
			childFeature == CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_CUSTOMER_SEGMENTS_ANNOTATIONS ||
			childFeature == CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_COST_STRUCTURE_ANNOTATIONS ||
			childFeature == CanvasPackage.Literals.CANVAS_DIAGRAM__HAS_REVENUE_STREAMS_ANNOTATIONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CanvasEditPlugin.INSTANCE;
	}

}
