/**
 */
package fr.univcotedazur.l3ia.langagecompilation.provider;

import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrFactory;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage;
import fr.univcotedazur.l3ia.langagecompilation.Robot;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Robot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(LegolanguagePrPackage.Literals.ROBOT__SENSOR);
			childrenFeatures.add(LegolanguagePrPackage.Literals.ROBOT__ACTUATOR);
			childrenFeatures.add(LegolanguagePrPackage.Literals.ROBOT__RIGHT_WHEEL);
			childrenFeatures.add(LegolanguagePrPackage.Literals.ROBOT__LEFT_WHEEL);
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
	 * This returns Robot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Robot"));
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
		String label = ((Robot) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Robot_type")
				: getString("_UI_Robot_type") + " " + label;
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

		switch (notification.getFeatureID(Robot.class)) {
		case LegolanguagePrPackage.ROBOT__SENSOR:
		case LegolanguagePrPackage.ROBOT__ACTUATOR:
		case LegolanguagePrPackage.ROBOT__RIGHT_WHEEL:
		case LegolanguagePrPackage.ROBOT__LEFT_WHEEL:
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

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.ROBOT__SENSOR,
				LegolanguagePrFactory.eINSTANCE.createColorSensor()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.ROBOT__SENSOR,
				LegolanguagePrFactory.eINSTANCE.createLaserSensor()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.ROBOT__SENSOR,
				LegolanguagePrFactory.eINSTANCE.createGyroSensor()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.ROBOT__SENSOR,
				LegolanguagePrFactory.eINSTANCE.createGPSSensor()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.ROBOT__ACTUATOR,
				LegolanguagePrFactory.eINSTANCE.createShootLauncher()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.ROBOT__ACTUATOR,
				LegolanguagePrFactory.eINSTANCE.createLed()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.ROBOT__ACTUATOR,
				LegolanguagePrFactory.eINSTANCE.createWheel()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.ROBOT__ACTUATOR,
				LegolanguagePrFactory.eINSTANCE.createArm()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.ROBOT__RIGHT_WHEEL,
				LegolanguagePrFactory.eINSTANCE.createWheel()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.ROBOT__LEFT_WHEEL,
				LegolanguagePrFactory.eINSTANCE.createWheel()));
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

		boolean qualify = childFeature == LegolanguagePrPackage.Literals.ROBOT__ACTUATOR
				|| childFeature == LegolanguagePrPackage.Literals.ROBOT__RIGHT_WHEEL
				|| childFeature == LegolanguagePrPackage.Literals.ROBOT__LEFT_WHEEL;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
