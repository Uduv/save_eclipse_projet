/**
 */
package fr.univcotedazur.l3ia.langagecompilation.provider;

import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrFactory;
import fr.univcotedazur.l3ia.langagecompilation.LegolanguagePrPackage;
import fr.univcotedazur.l3ia.langagecompilation.Program;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Program} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Program_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Program_name_feature", "_UI_Program_type"),
						LegolanguagePrPackage.Literals.PROGRAM__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT);
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
	 * This returns Program.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Program"));
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
		String label = ((Program) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Program_type")
				: getString("_UI_Program_type") + " " + label;
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

		switch (notification.getFeatureID(Program.class)) {
		case LegolanguagePrPackage.PROGRAM__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case LegolanguagePrPackage.PROGRAM__STATEMENT:
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

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createSubstarction()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createGT()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createAssignement()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createLeInteger()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createLeString()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createLT()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createVariableProxy()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createLeBoolean()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createLeFloat()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createCommentary()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createExponential()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createIf()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createGTEqual()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createLTEqual()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createRobot()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createColorSensor()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createLaserSensor()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createShootLauncher()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createLed()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createWheel()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createArm()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createGo()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createChangeAngle()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createChangeIntensity()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createGetColor()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createGetDistance()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createTurn()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createShoot()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createGyroSensor()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createGPSSensor()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createGetPosition()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createGetGyro()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(LegolanguagePrPackage.Literals.PROGRAM__STATEMENT,
				LegolanguagePrFactory.eINSTANCE.createOr()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LegolanguagePrEditPlugin.INSTANCE;
	}

}
