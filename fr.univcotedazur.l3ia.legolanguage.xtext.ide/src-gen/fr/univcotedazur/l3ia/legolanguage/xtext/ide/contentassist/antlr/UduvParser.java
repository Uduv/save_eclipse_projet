/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.l3ia.legolanguage.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.univcotedazur.l3ia.legolanguage.xtext.ide.contentassist.antlr.internal.InternalUduvParser;
import fr.univcotedazur.l3ia.legolanguage.xtext.services.UduvGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class UduvParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(UduvGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, UduvGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
			builder.put(grammarAccess.getCalculAccess().getAlternatives(), "rule__Calcul__Alternatives");
			builder.put(grammarAccess.getBinaryOperationAccess().getAlternatives(), "rule__BinaryOperation__Alternatives");
			builder.put(grammarAccess.getComparaisonAccess().getAlternatives(), "rule__Comparaison__Alternatives");
			builder.put(grammarAccess.getVariableAccess().getAlternatives(), "rule__Variable__Alternatives");
			builder.put(grammarAccess.getSensorAccess().getAlternatives(), "rule__Sensor__Alternatives");
			builder.put(grammarAccess.getActuatorAccess().getAlternatives(), "rule__Actuator__Alternatives");
			builder.put(grammarAccess.getMotorAccess().getAlternatives(), "rule__Motor__Alternatives");
			builder.put(grammarAccess.getRotativeMotorAccess().getAlternatives(), "rule__RotativeMotor__Alternatives");
			builder.put(grammarAccess.getLoopAccess().getAlternatives(), "rule__Loop__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
			builder.put(grammarAccess.getRobotDeclarationAccess().getGroup(), "rule__RobotDeclaration__Group__0");
			builder.put(grammarAccess.getRobotDeclarationAccess().getGroup_2(), "rule__RobotDeclaration__Group_2__0");
			builder.put(grammarAccess.getCommentaryAccess().getGroup(), "rule__Commentary__Group__0");
			builder.put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
			builder.put(grammarAccess.getWhileLoopAccess().getGroup(), "rule__WhileLoop__Group__0");
			builder.put(grammarAccess.getForLoopAccess().getGroup(), "rule__ForLoop__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
			builder.put(grammarAccess.getSubstarctionAccess().getGroup(), "rule__Substarction__Group__0");
			builder.put(grammarAccess.getDivisionAccess().getGroup(), "rule__Division__Group__0");
			builder.put(grammarAccess.getExponentialAccess().getGroup(), "rule__Exponential__Group__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
			builder.put(grammarAccess.getGTAccess().getGroup(), "rule__GT__Group__0");
			builder.put(grammarAccess.getGTEqualAccess().getGroup(), "rule__GTEqual__Group__0");
			builder.put(grammarAccess.getLTAccess().getGroup(), "rule__LT__Group__0");
			builder.put(grammarAccess.getLTEqualAccess().getGroup(), "rule__LTEqual__Group__0");
			builder.put(grammarAccess.getEqualAccess().getGroup(), "rule__Equal__Group__0");
			builder.put(grammarAccess.getAssignementAccess().getGroup(), "rule__Assignement__Group__0");
			builder.put(grammarAccess.getLeIntegerAccess().getGroup(), "rule__LeInteger__Group__0");
			builder.put(grammarAccess.getLeIntegerAccess().getGroup_1(), "rule__LeInteger__Group_1__0");
			builder.put(grammarAccess.getLeStringAccess().getGroup(), "rule__LeString__Group__0");
			builder.put(grammarAccess.getLeStringAccess().getGroup_1(), "rule__LeString__Group_1__0");
			builder.put(grammarAccess.getLeBooleanAccess().getGroup(), "rule__LeBoolean__Group__0");
			builder.put(grammarAccess.getLeBooleanAccess().getGroup_1(), "rule__LeBoolean__Group_1__0");
			builder.put(grammarAccess.getLeFloatAccess().getGroup(), "rule__LeFloat__Group__0");
			builder.put(grammarAccess.getLeFloatAccess().getGroup_1(), "rule__LeFloat__Group_1__0");
			builder.put(grammarAccess.getPrintAccess().getGroup(), "rule__Print__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getEFloatAccess().getGroup(), "rule__EFloat__Group__0");
			builder.put(grammarAccess.getWheelAccess().getGroup(), "rule__Wheel__Group__0");
			builder.put(grammarAccess.getWheelAccess().getGroup_4(), "rule__Wheel__Group_4__0");
			builder.put(grammarAccess.getArmAccess().getGroup(), "rule__Arm__Group__0");
			builder.put(grammarAccess.getArmAccess().getGroup_5(), "rule__Arm__Group_5__0");
			builder.put(grammarAccess.getLedAccess().getGroup(), "rule__Led__Group__0");
			builder.put(grammarAccess.getLedAccess().getGroup_5(), "rule__Led__Group_5__0");
			builder.put(grammarAccess.getShootLauncherAccess().getGroup(), "rule__ShootLauncher__Group__0");
			builder.put(grammarAccess.getShootLauncherAccess().getGroup_5(), "rule__ShootLauncher__Group_5__0");
			builder.put(grammarAccess.getColorDectorAccess().getGroup(), "rule__ColorDector__Group__0");
			builder.put(grammarAccess.getLaserAccess().getGroup(), "rule__Laser__Group__0");
			builder.put(grammarAccess.getProgramAccess().getStatementAssignment_1(), "rule__Program__StatementAssignment_1");
			builder.put(grammarAccess.getRobotDeclarationAccess().getNameAssignment_1(), "rule__RobotDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getRobotDeclarationAccess().getLeftWheelAssignment_2_2(), "rule__RobotDeclaration__LeftWheelAssignment_2_2");
			builder.put(grammarAccess.getRobotDeclarationAccess().getRightWheelAssignment_2_4(), "rule__RobotDeclaration__RightWheelAssignment_2_4");
			builder.put(grammarAccess.getRobotDeclarationAccess().getActuatorAssignment_2_5(), "rule__RobotDeclaration__ActuatorAssignment_2_5");
			builder.put(grammarAccess.getRobotDeclarationAccess().getSensorAssignment_2_6(), "rule__RobotDeclaration__SensorAssignment_2_6");
			builder.put(grammarAccess.getCommentaryAccess().getInitialeValueAssignment_2(), "rule__Commentary__InitialeValueAssignment_2");
			builder.put(grammarAccess.getIfAccess().getConditionAssignment_1(), "rule__If__ConditionAssignment_1");
			builder.put(grammarAccess.getIfAccess().getStatementAssignment_3(), "rule__If__StatementAssignment_3");
			builder.put(grammarAccess.getWhileLoopAccess().getLoopConditionAssignment_1(), "rule__WhileLoop__LoopConditionAssignment_1");
			builder.put(grammarAccess.getWhileLoopAccess().getStatementAssignment_3(), "rule__WhileLoop__StatementAssignment_3");
			builder.put(grammarAccess.getForLoopAccess().getLoopConditionAssignment_1(), "rule__ForLoop__LoopConditionAssignment_1");
			builder.put(grammarAccess.getForLoopAccess().getStatementAssignment_3(), "rule__ForLoop__StatementAssignment_3");
			builder.put(grammarAccess.getAdditionAccess().getLeftAssignment_1(), "rule__Addition__LeftAssignment_1");
			builder.put(grammarAccess.getAdditionAccess().getRightAssignment_3(), "rule__Addition__RightAssignment_3");
			builder.put(grammarAccess.getSubstarctionAccess().getLeftAssignment_1(), "rule__Substarction__LeftAssignment_1");
			builder.put(grammarAccess.getSubstarctionAccess().getRightAssignment_3(), "rule__Substarction__RightAssignment_3");
			builder.put(grammarAccess.getDivisionAccess().getLeftAssignment_1(), "rule__Division__LeftAssignment_1");
			builder.put(grammarAccess.getDivisionAccess().getRightAssignment_3(), "rule__Division__RightAssignment_3");
			builder.put(grammarAccess.getExponentialAccess().getLeftAssignment_1(), "rule__Exponential__LeftAssignment_1");
			builder.put(grammarAccess.getExponentialAccess().getRightAssignment_3(), "rule__Exponential__RightAssignment_3");
			builder.put(grammarAccess.getMultiplicationAccess().getLeftAssignment_1(), "rule__Multiplication__LeftAssignment_1");
			builder.put(grammarAccess.getMultiplicationAccess().getRightAssignment_3(), "rule__Multiplication__RightAssignment_3");
			builder.put(grammarAccess.getGTAccess().getLeftAssignment_1(), "rule__GT__LeftAssignment_1");
			builder.put(grammarAccess.getGTAccess().getRightAssignment_3(), "rule__GT__RightAssignment_3");
			builder.put(grammarAccess.getGTEqualAccess().getLeftAssignment_1(), "rule__GTEqual__LeftAssignment_1");
			builder.put(grammarAccess.getGTEqualAccess().getRightAssignment_3(), "rule__GTEqual__RightAssignment_3");
			builder.put(grammarAccess.getLTAccess().getLeftAssignment_1(), "rule__LT__LeftAssignment_1");
			builder.put(grammarAccess.getLTAccess().getRightAssignment_3(), "rule__LT__RightAssignment_3");
			builder.put(grammarAccess.getLTEqualAccess().getLeftAssignment_1(), "rule__LTEqual__LeftAssignment_1");
			builder.put(grammarAccess.getLTEqualAccess().getRightAssignment_3(), "rule__LTEqual__RightAssignment_3");
			builder.put(grammarAccess.getEqualAccess().getLeftAssignment_1(), "rule__Equal__LeftAssignment_1");
			builder.put(grammarAccess.getEqualAccess().getRightAssignment_3(), "rule__Equal__RightAssignment_3");
			builder.put(grammarAccess.getAssignementAccess().getLeftAssignment_1(), "rule__Assignement__LeftAssignment_1");
			builder.put(grammarAccess.getAssignementAccess().getRightAssignment_3(), "rule__Assignement__RightAssignment_3");
			builder.put(grammarAccess.getLeIntegerAccess().getNameAssignment_1_1(), "rule__LeInteger__NameAssignment_1_1");
			builder.put(grammarAccess.getLeIntegerAccess().getInitialeValueAssignment_2(), "rule__LeInteger__InitialeValueAssignment_2");
			builder.put(grammarAccess.getLeStringAccess().getNameAssignment_1_1(), "rule__LeString__NameAssignment_1_1");
			builder.put(grammarAccess.getLeStringAccess().getInitialeValueAssignment_2(), "rule__LeString__InitialeValueAssignment_2");
			builder.put(grammarAccess.getLeBooleanAccess().getNameAssignment_1_1(), "rule__LeBoolean__NameAssignment_1_1");
			builder.put(grammarAccess.getLeBooleanAccess().getInitialeValueAssignment_2(), "rule__LeBoolean__InitialeValueAssignment_2");
			builder.put(grammarAccess.getLeFloatAccess().getNameAssignment_1_1(), "rule__LeFloat__NameAssignment_1_1");
			builder.put(grammarAccess.getLeFloatAccess().getInitialeValueAssignment_2(), "rule__LeFloat__InitialeValueAssignment_2");
			builder.put(grammarAccess.getPrintAccess().getStatementAssignment_3(), "rule__Print__StatementAssignment_3");
			builder.put(grammarAccess.getVariableProxyAccess().getVariableAssignment(), "rule__VariableProxy__VariableAssignment");
			builder.put(grammarAccess.getSensorProxyAccess().getSensorAssignment(), "rule__SensorProxy__SensorAssignment");
			builder.put(grammarAccess.getActuatorProxyAccess().getActuatorAssignment(), "rule__ActuatorProxy__ActuatorAssignment");
			builder.put(grammarAccess.getWheelAccess().getPortIDAssignment_3(), "rule__Wheel__PortIDAssignment_3");
			builder.put(grammarAccess.getWheelAccess().getSpeedAssignment_4_1(), "rule__Wheel__SpeedAssignment_4_1");
			builder.put(grammarAccess.getArmAccess().getNameAssignment_2(), "rule__Arm__NameAssignment_2");
			builder.put(grammarAccess.getArmAccess().getPortIDAssignment_4(), "rule__Arm__PortIDAssignment_4");
			builder.put(grammarAccess.getArmAccess().getAngleAssignment_5_1(), "rule__Arm__AngleAssignment_5_1");
			builder.put(grammarAccess.getLedAccess().getNameAssignment_2(), "rule__Led__NameAssignment_2");
			builder.put(grammarAccess.getLedAccess().getPortIDAssignment_4(), "rule__Led__PortIDAssignment_4");
			builder.put(grammarAccess.getLedAccess().getBrightAssignment_5_1(), "rule__Led__BrightAssignment_5_1");
			builder.put(grammarAccess.getShootLauncherAccess().getNameAssignment_2(), "rule__ShootLauncher__NameAssignment_2");
			builder.put(grammarAccess.getShootLauncherAccess().getPortIDAssignment_4(), "rule__ShootLauncher__PortIDAssignment_4");
			builder.put(grammarAccess.getShootLauncherAccess().getForceAssignment_5_1(), "rule__ShootLauncher__ForceAssignment_5_1");
			builder.put(grammarAccess.getColorDectorAccess().getNameAssignment_2(), "rule__ColorDector__NameAssignment_2");
			builder.put(grammarAccess.getColorDectorAccess().getPortIDAssignment_4(), "rule__ColorDector__PortIDAssignment_4");
			builder.put(grammarAccess.getLaserAccess().getNameAssignment_2(), "rule__Laser__NameAssignment_2");
			builder.put(grammarAccess.getLaserAccess().getPortIDAssignment_4(), "rule__Laser__PortIDAssignment_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private UduvGrammarAccess grammarAccess;

	@Override
	protected InternalUduvParser createParser() {
		InternalUduvParser result = new InternalUduvParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public UduvGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UduvGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
