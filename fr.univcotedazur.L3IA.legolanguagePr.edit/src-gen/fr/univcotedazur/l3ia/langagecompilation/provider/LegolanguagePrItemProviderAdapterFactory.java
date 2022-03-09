/**
 */
package fr.univcotedazur.l3ia.langagecompilation.provider;

import fr.univcotedazur.l3ia.langagecompilation.util.LegolanguagePrAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LegolanguagePrItemProviderAdapterFactory extends LegolanguagePrAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegolanguagePrItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Program} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramItemProvider programItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProgramAdapter() {
		if (programItemProvider == null) {
			programItemProvider = new ProgramItemProvider(this);
		}

		return programItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.WhileLoop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileLoopItemProvider whileLoopItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.WhileLoop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhileLoopAdapter() {
		if (whileLoopItemProvider == null) {
			whileLoopItemProvider = new WhileLoopItemProvider(this);
		}

		return whileLoopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Substarction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstarctionItemProvider substarctionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Substarction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubstarctionAdapter() {
		if (substarctionItemProvider == null) {
			substarctionItemProvider = new SubstarctionItemProvider(this);
		}

		return substarctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.GT} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GTItemProvider gtItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.GT}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGTAdapter() {
		if (gtItemProvider == null) {
			gtItemProvider = new GTItemProvider(this);
		}

		return gtItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Assignement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignementItemProvider assignementItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Assignement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignementAdapter() {
		if (assignementItemProvider == null) {
			assignementItemProvider = new AssignementItemProvider(this);
		}

		return assignementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.LeInteger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeIntegerItemProvider leIntegerItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.LeInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLeIntegerAdapter() {
		if (leIntegerItemProvider == null) {
			leIntegerItemProvider = new LeIntegerItemProvider(this);
		}

		return leIntegerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.LeString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeStringItemProvider leStringItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.LeString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLeStringAdapter() {
		if (leStringItemProvider == null) {
			leStringItemProvider = new LeStringItemProvider(this);
		}

		return leStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.LT} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LTItemProvider ltItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.LT}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLTAdapter() {
		if (ltItemProvider == null) {
			ltItemProvider = new LTItemProvider(this);
		}

		return ltItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.ForLoop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForLoopItemProvider forLoopItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.ForLoop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForLoopAdapter() {
		if (forLoopItemProvider == null) {
			forLoopItemProvider = new ForLoopItemProvider(this);
		}

		return forLoopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Print} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrintItemProvider printItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Print}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrintAdapter() {
		if (printItemProvider == null) {
			printItemProvider = new PrintItemProvider(this);
		}

		return printItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.VariableProxy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableProxyItemProvider variableProxyItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.VariableProxy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableProxyAdapter() {
		if (variableProxyItemProvider == null) {
			variableProxyItemProvider = new VariableProxyItemProvider(this);
		}

		return variableProxyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Equal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualItemProvider equalItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Equal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEqualAdapter() {
		if (equalItemProvider == null) {
			equalItemProvider = new EqualItemProvider(this);
		}

		return equalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.LeBoolean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeBooleanItemProvider leBooleanItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.LeBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLeBooleanAdapter() {
		if (leBooleanItemProvider == null) {
			leBooleanItemProvider = new LeBooleanItemProvider(this);
		}

		return leBooleanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.LeFloat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeFloatItemProvider leFloatItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.LeFloat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLeFloatAdapter() {
		if (leFloatItemProvider == null) {
			leFloatItemProvider = new LeFloatItemProvider(this);
		}

		return leFloatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Addition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionItemProvider additionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Addition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdditionAdapter() {
		if (additionItemProvider == null) {
			additionItemProvider = new AdditionItemProvider(this);
		}

		return additionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Commentary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentaryItemProvider commentaryItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Commentary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommentaryAdapter() {
		if (commentaryItemProvider == null) {
			commentaryItemProvider = new CommentaryItemProvider(this);
		}

		return commentaryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Division} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivisionItemProvider divisionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Division}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDivisionAdapter() {
		if (divisionItemProvider == null) {
			divisionItemProvider = new DivisionItemProvider(this);
		}

		return divisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Exponential} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExponentialItemProvider exponentialItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Exponential}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExponentialAdapter() {
		if (exponentialItemProvider == null) {
			exponentialItemProvider = new ExponentialItemProvider(this);
		}

		return exponentialItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Multiplication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicationItemProvider multiplicationItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Multiplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiplicationAdapter() {
		if (multiplicationItemProvider == null) {
			multiplicationItemProvider = new MultiplicationItemProvider(this);
		}

		return multiplicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.If} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfItemProvider ifItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.If}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfAdapter() {
		if (ifItemProvider == null) {
			ifItemProvider = new IfItemProvider(this);
		}

		return ifItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.GTEqual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GTEqualItemProvider gtEqualItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.GTEqual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGTEqualAdapter() {
		if (gtEqualItemProvider == null) {
			gtEqualItemProvider = new GTEqualItemProvider(this);
		}

		return gtEqualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.LTEqual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LTEqualItemProvider ltEqualItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.LTEqual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLTEqualAdapter() {
		if (ltEqualItemProvider == null) {
			ltEqualItemProvider = new LTEqualItemProvider(this);
		}

		return ltEqualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Robot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotItemProvider robotItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Robot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRobotAdapter() {
		if (robotItemProvider == null) {
			robotItemProvider = new RobotItemProvider(this);
		}

		return robotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.ColorSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorSensorItemProvider colorSensorItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.ColorSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColorSensorAdapter() {
		if (colorSensorItemProvider == null) {
			colorSensorItemProvider = new ColorSensorItemProvider(this);
		}

		return colorSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.LaserSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaserSensorItemProvider laserSensorItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.LaserSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLaserSensorAdapter() {
		if (laserSensorItemProvider == null) {
			laserSensorItemProvider = new LaserSensorItemProvider(this);
		}

		return laserSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.ShootLauncher} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShootLauncherItemProvider shootLauncherItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.ShootLauncher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShootLauncherAdapter() {
		if (shootLauncherItemProvider == null) {
			shootLauncherItemProvider = new ShootLauncherItemProvider(this);
		}

		return shootLauncherItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Led} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LedItemProvider ledItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Led}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLedAdapter() {
		if (ledItemProvider == null) {
			ledItemProvider = new LedItemProvider(this);
		}

		return ledItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Wheel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WheelItemProvider wheelItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Wheel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWheelAdapter() {
		if (wheelItemProvider == null) {
			wheelItemProvider = new WheelItemProvider(this);
		}

		return wheelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Arm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArmItemProvider armItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Arm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArmAdapter() {
		if (armItemProvider == null) {
			armItemProvider = new ArmItemProvider(this);
		}

		return armItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Go} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoItemProvider goItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Go}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGoAdapter() {
		if (goItemProvider == null) {
			goItemProvider = new GoItemProvider(this);
		}

		return goItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.ChangeAngle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeAngleItemProvider changeAngleItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.ChangeAngle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChangeAngleAdapter() {
		if (changeAngleItemProvider == null) {
			changeAngleItemProvider = new ChangeAngleItemProvider(this);
		}

		return changeAngleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.ChangeIntensity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeIntensityItemProvider changeIntensityItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.ChangeIntensity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChangeIntensityAdapter() {
		if (changeIntensityItemProvider == null) {
			changeIntensityItemProvider = new ChangeIntensityItemProvider(this);
		}

		return changeIntensityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.GetColor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetColorItemProvider getColorItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.GetColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGetColorAdapter() {
		if (getColorItemProvider == null) {
			getColorItemProvider = new GetColorItemProvider(this);
		}

		return getColorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.GetDistance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetDistanceItemProvider getDistanceItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.GetDistance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGetDistanceAdapter() {
		if (getDistanceItemProvider == null) {
			getDistanceItemProvider = new GetDistanceItemProvider(this);
		}

		return getDistanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Turn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnItemProvider turnItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Turn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTurnAdapter() {
		if (turnItemProvider == null) {
			turnItemProvider = new TurnItemProvider(this);
		}

		return turnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.Shoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShootItemProvider shootItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.Shoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShootAdapter() {
		if (shootItemProvider == null) {
			shootItemProvider = new ShootItemProvider(this);
		}

		return shootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.GyroSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GyroSensorItemProvider gyroSensorItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.GyroSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGyroSensorAdapter() {
		if (gyroSensorItemProvider == null) {
			gyroSensorItemProvider = new GyroSensorItemProvider(this);
		}

		return gyroSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.GPSSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GPSSensorItemProvider gpsSensorItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.GPSSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGPSSensorAdapter() {
		if (gpsSensorItemProvider == null) {
			gpsSensorItemProvider = new GPSSensorItemProvider(this);
		}

		return gpsSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.GetPosition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetPositionItemProvider getPositionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.GetPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGetPositionAdapter() {
		if (getPositionItemProvider == null) {
			getPositionItemProvider = new GetPositionItemProvider(this);
		}

		return getPositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.univcotedazur.l3ia.langagecompilation.GetGyro} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetGyroItemProvider getGyroItemProvider;

	/**
	 * This creates an adapter for a {@link fr.univcotedazur.l3ia.langagecompilation.GetGyro}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGetGyroAdapter() {
		if (getGyroItemProvider == null) {
			getGyroItemProvider = new GetGyroItemProvider(this);
		}

		return getGyroItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (programItemProvider != null)
			programItemProvider.dispose();
		if (whileLoopItemProvider != null)
			whileLoopItemProvider.dispose();
		if (substarctionItemProvider != null)
			substarctionItemProvider.dispose();
		if (gtItemProvider != null)
			gtItemProvider.dispose();
		if (assignementItemProvider != null)
			assignementItemProvider.dispose();
		if (leIntegerItemProvider != null)
			leIntegerItemProvider.dispose();
		if (leStringItemProvider != null)
			leStringItemProvider.dispose();
		if (ltItemProvider != null)
			ltItemProvider.dispose();
		if (forLoopItemProvider != null)
			forLoopItemProvider.dispose();
		if (printItemProvider != null)
			printItemProvider.dispose();
		if (variableProxyItemProvider != null)
			variableProxyItemProvider.dispose();
		if (equalItemProvider != null)
			equalItemProvider.dispose();
		if (leBooleanItemProvider != null)
			leBooleanItemProvider.dispose();
		if (leFloatItemProvider != null)
			leFloatItemProvider.dispose();
		if (additionItemProvider != null)
			additionItemProvider.dispose();
		if (commentaryItemProvider != null)
			commentaryItemProvider.dispose();
		if (divisionItemProvider != null)
			divisionItemProvider.dispose();
		if (exponentialItemProvider != null)
			exponentialItemProvider.dispose();
		if (multiplicationItemProvider != null)
			multiplicationItemProvider.dispose();
		if (ifItemProvider != null)
			ifItemProvider.dispose();
		if (gtEqualItemProvider != null)
			gtEqualItemProvider.dispose();
		if (ltEqualItemProvider != null)
			ltEqualItemProvider.dispose();
		if (robotItemProvider != null)
			robotItemProvider.dispose();
		if (colorSensorItemProvider != null)
			colorSensorItemProvider.dispose();
		if (laserSensorItemProvider != null)
			laserSensorItemProvider.dispose();
		if (shootLauncherItemProvider != null)
			shootLauncherItemProvider.dispose();
		if (ledItemProvider != null)
			ledItemProvider.dispose();
		if (wheelItemProvider != null)
			wheelItemProvider.dispose();
		if (armItemProvider != null)
			armItemProvider.dispose();
		if (goItemProvider != null)
			goItemProvider.dispose();
		if (changeAngleItemProvider != null)
			changeAngleItemProvider.dispose();
		if (changeIntensityItemProvider != null)
			changeIntensityItemProvider.dispose();
		if (getColorItemProvider != null)
			getColorItemProvider.dispose();
		if (getDistanceItemProvider != null)
			getDistanceItemProvider.dispose();
		if (turnItemProvider != null)
			turnItemProvider.dispose();
		if (shootItemProvider != null)
			shootItemProvider.dispose();
		if (gyroSensorItemProvider != null)
			gyroSensorItemProvider.dispose();
		if (gpsSensorItemProvider != null)
			gpsSensorItemProvider.dispose();
		if (getPositionItemProvider != null)
			getPositionItemProvider.dispose();
		if (getGyroItemProvider != null)
			getGyroItemProvider.dispose();
	}

}
