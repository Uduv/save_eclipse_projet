/**
 */
package fr.univcotedazur.l3ia.langagecompilation.provider;

import fr.univcotedazur.l3ia.langagecompilation.Go;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrFactory;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Go} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GoItemProvider extends RobotStatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(LegolanguagePrPackage.Literals.GO__SPEED);
			childrenFeatures.add(LegolanguagePrPackage.Literals.GO__DURATION);
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
	 * This returns Go.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Go"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Go) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Go_type") : getString("_UI_Go_type") + " " + label;
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

		switch (notification.getFeatureID(Go.class)) {
		case LegolanguagePrPackage.GO__SPEED:
		case LegolanguagePrPackage.GO__DURATION:
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

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__SPEED,
				LegolanguagePrFactory.eINSTANCE.createSubstarction()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__SPEED,
				LegolanguagePrFactory.eINSTANCE.createGT()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__SPEED,
				LegolanguagePrFactory.eINSTANCE.createAssignement()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__SPEED,
				LegolanguagePrFactory.eINSTANCE.createLT()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__SPEED,
				LegolanguagePrFactory.eINSTANCE.createVariableProxy()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__SPEED,
				LegolanguagePrFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__SPEED,
				LegolanguagePrFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__SPEED,
				LegolanguagePrFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__SPEED,
				LegolanguagePrFactory.eINSTANCE.createExponential()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__SPEED,
				LegolanguagePrFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__SPEED,
				LegolanguagePrFactory.eINSTANCE.createGTEqual()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__SPEED,
				LegolanguagePrFactory.eINSTANCE.createLTEqual()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__SPEED,
				LegolanguagePrFactory.eINSTANCE.createSensorProxy()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__SPEED,
				LegolanguagePrFactory.eINSTANCE.createActuatorProxy()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__DURATION,
				LegolanguagePrFactory.eINSTANCE.createSubstarction()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__DURATION,
				LegolanguagePrFactory.eINSTANCE.createGT()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__DURATION,
				LegolanguagePrFactory.eINSTANCE.createAssignement()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__DURATION,
				LegolanguagePrFactory.eINSTANCE.createLT()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__DURATION,
				LegolanguagePrFactory.eINSTANCE.createVariableProxy()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__DURATION,
				LegolanguagePrFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__DURATION,
				LegolanguagePrFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__DURATION,
				LegolanguagePrFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__DURATION,
				LegolanguagePrFactory.eINSTANCE.createExponential()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__DURATION,
				LegolanguagePrFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__DURATION,
				LegolanguagePrFactory.eINSTANCE.createGTEqual()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__DURATION,
				LegolanguagePrFactory.eINSTANCE.createLTEqual()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__DURATION,
				LegolanguagePrFactory.eINSTANCE.createSensorProxy()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.GO__DURATION,
				LegolanguagePrFactory.eINSTANCE.createActuatorProxy()));
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

		boolean qualify = childFeature == LegolanguagePrPackage.Literals.GO__SPEED
				|| childFeature == LegolanguagePrPackage.Literals.GO__DURATION;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
