/**
 */
package fr.univcotedazur.l3ia.langagecompilation.provider;

import fr.univcotedazur.l3ia.langagecompilation.If;
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
 * This is the item provider adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.If} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(LegolanguagePrPackage.Literals.IF__CONDITION);
			childrenFeatures.add(LegolanguagePrPackage.Literals.IF__STATEMENT);
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
	 * This returns If.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/If"));
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
		String label = ((If) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_If_type") : getString("_UI_If_type") + " " + label;
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

		switch (notification.getFeatureID(If.class)) {
		case LegolanguagePrPackage.IF__CONDITION:
		case LegolanguagePrPackage.IF__STATEMENT:
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

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__CONDITION,
				LegolanguagePrFactory.eINSTANCE.createGT()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__CONDITION,
				LegolanguagePrFactory.eINSTANCE.createLT()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__CONDITION,
				LegolanguagePrFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__CONDITION,
				LegolanguagePrFactory.eINSTANCE.createGTEqual()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__CONDITION,
				LegolanguagePrFactory.eINSTANCE.createLTEqual()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createSubstarction()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createGT()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createAssignement()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createLeInteger()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createLeString()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createLT()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createVariableProxy()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createLeBoolean()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createLeFloat()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createCommentary()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createExponential()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createIf()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createGTEqual()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createLTEqual()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createRobot()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createColorDector()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createLaser()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createShootLauncher()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createLed()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createWheel()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createArm()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createSensorProxy()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createActuatorProxy()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createGo()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createChangeAngle()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createChangeIntensityLight()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createGetColor()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createGetDistance()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createTurn()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.IF__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createShoot()));
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

		boolean qualify = childFeature == LegolanguagePrPackage.Literals.IF__CONDITION
				|| childFeature == LegolanguagePrPackage.Literals.IF__STATEMENT;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
