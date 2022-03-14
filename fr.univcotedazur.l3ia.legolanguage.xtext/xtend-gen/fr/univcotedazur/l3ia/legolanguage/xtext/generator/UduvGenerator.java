/**
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.l3ia.legolanguage.xtext.generator;

import fr.univcotedazur.l3ia.langagecompilation.Actuator;
import fr.univcotedazur.l3ia.langagecompilation.ActuatorStatement;
import fr.univcotedazur.l3ia.langagecompilation.Addition;
import fr.univcotedazur.l3ia.langagecompilation.And;
import fr.univcotedazur.l3ia.langagecompilation.Arm;
import fr.univcotedazur.l3ia.langagecompilation.Assignement;
import fr.univcotedazur.l3ia.langagecompilation.BinaryOperation;
import fr.univcotedazur.l3ia.langagecompilation.Calcul;
import fr.univcotedazur.l3ia.langagecompilation.ChangeAngle;
import fr.univcotedazur.l3ia.langagecompilation.ChangeIntensity;
import fr.univcotedazur.l3ia.langagecompilation.ColorSensor;
import fr.univcotedazur.l3ia.langagecompilation.Commentary;
import fr.univcotedazur.l3ia.langagecompilation.Comparaison;
import fr.univcotedazur.l3ia.langagecompilation.Condition;
import fr.univcotedazur.l3ia.langagecompilation.Direction;
import fr.univcotedazur.l3ia.langagecompilation.Division;
import fr.univcotedazur.l3ia.langagecompilation.Equal;
import fr.univcotedazur.l3ia.langagecompilation.Exponential;
import fr.univcotedazur.l3ia.langagecompilation.Expression;
import fr.univcotedazur.l3ia.langagecompilation.GPSSensor;
import fr.univcotedazur.l3ia.langagecompilation.GT;
import fr.univcotedazur.l3ia.langagecompilation.GTEqual;
import fr.univcotedazur.l3ia.langagecompilation.GetColor;
import fr.univcotedazur.l3ia.langagecompilation.GetDistance;
import fr.univcotedazur.l3ia.langagecompilation.GetGyro;
import fr.univcotedazur.l3ia.langagecompilation.GetPosition;
import fr.univcotedazur.l3ia.langagecompilation.Go;
import fr.univcotedazur.l3ia.langagecompilation.GyroSensor;
import fr.univcotedazur.l3ia.langagecompilation.If;
import fr.univcotedazur.l3ia.langagecompilation.LT;
import fr.univcotedazur.l3ia.langagecompilation.LTEqual;
import fr.univcotedazur.l3ia.langagecompilation.LaserSensor;
import fr.univcotedazur.l3ia.langagecompilation.LeBoolean;
import fr.univcotedazur.l3ia.langagecompilation.LeFloat;
import fr.univcotedazur.l3ia.langagecompilation.LeInteger;
import fr.univcotedazur.l3ia.langagecompilation.LeString;
import fr.univcotedazur.l3ia.langagecompilation.Led;
import fr.univcotedazur.l3ia.langagecompilation.Loop;
import fr.univcotedazur.l3ia.langagecompilation.Motor;
import fr.univcotedazur.l3ia.langagecompilation.Multiplication;
import fr.univcotedazur.l3ia.langagecompilation.Or;
import fr.univcotedazur.l3ia.langagecompilation.Print;
import fr.univcotedazur.l3ia.langagecompilation.Program;
import fr.univcotedazur.l3ia.langagecompilation.Robot;
import fr.univcotedazur.l3ia.langagecompilation.RotativeMotor;
import fr.univcotedazur.l3ia.langagecompilation.Sensor;
import fr.univcotedazur.l3ia.langagecompilation.SensorExpression;
import fr.univcotedazur.l3ia.langagecompilation.Shoot;
import fr.univcotedazur.l3ia.langagecompilation.ShootLauncher;
import fr.univcotedazur.l3ia.langagecompilation.Statement;
import fr.univcotedazur.l3ia.langagecompilation.Substarction;
import fr.univcotedazur.l3ia.langagecompilation.Turn;
import fr.univcotedazur.l3ia.langagecompilation.Variable;
import fr.univcotedazur.l3ia.langagecompilation.VariableProxy;
import fr.univcotedazur.l3ia.langagecompilation.Wheel;
import fr.univcotedazur.l3ia.langagecompilation.WhileLoop;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class UduvGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
    Program prog = ((Program) _head);
    String fileContent = "";
    EList<Statement> _statement = prog.getStatement();
    for (final Statement s : _statement) {
      String _fileContent = fileContent;
      String _StatementToString = this.StatementToString(s);
      fileContent = (_fileContent + _StatementToString);
    }
    String _name = prog.getName();
    String _plus = (_name + ".py");
    fsa.generateFile(_plus, ("#!/usr/bin/env python3\n# Import Libraries\nimport time\nimport math\nfrom ev3dev2.motor import *\nfrom ev3dev2.sound import Sound\nfrom ev3dev2.button import Button\nfrom ev3dev2.sensor import *\nfrom ev3dev2.sensor.lego import *\nfrom ev3dev2.sensor.virtual import *\n\n\n#Veuillez brancher la roue gauche sur OUTPUT_1 et roue droite sur OUTPUT_2\n\n" + fileContent));
  }
  
  private int indentation = 0;
  
  public String StatementToString(final Statement s) {
    String res = "";
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, this.indentation, true);
    for (final Integer i : _doubleDotLessThan) {
      String _res = res;
      res = (_res + "\t");
    }
    if ((s instanceof Variable)) {
      String _res_1 = res;
      String _VariableToString = this.VariableToString(((Variable) s));
      res = (_res_1 + _VariableToString);
    } else {
      if ((s instanceof Expression)) {
        String _res_2 = res;
        String _ExpressionToString = this.ExpressionToString(((Expression) s));
        res = (_res_2 + _ExpressionToString);
      } else {
        if ((s instanceof Loop)) {
          String _res_3 = res;
          String _LoopToString = this.LoopToString(((Loop) s));
          res = (_res_3 + _LoopToString);
        } else {
          if ((s instanceof If)) {
            String _res_4 = res;
            String _IfToString = this.IfToString(((If) s));
            res = (_res_4 + _IfToString);
          } else {
            if ((s instanceof Robot)) {
              String _res_5 = res;
              String _RobotToString = this.RobotToString(((Robot) s));
              res = (_res_5 + _RobotToString);
            } else {
              if ((s instanceof Actuator)) {
                String _res_6 = res;
                String _ActuatorToString = this.ActuatorToString(((Actuator) s));
                res = (_res_6 + _ActuatorToString);
              } else {
                if ((s instanceof Sensor)) {
                  String _res_7 = res;
                  String _SensorToString = this.SensorToString(((Sensor) s));
                  res = (_res_7 + _SensorToString);
                } else {
                  if ((s instanceof ActuatorStatement)) {
                    String _res_8 = res;
                    String _ActuatorStatementToString = this.ActuatorStatementToString(((ActuatorStatement) s));
                    res = (_res_8 + _ActuatorStatementToString);
                  } else {
                    if ((s instanceof Print)) {
                      String _res_9 = res;
                      res = (_res_9 + "print(");
                      EList<Statement> _statement = ((Print)s).getStatement();
                      for (final Statement state : _statement) {
                        String _res_10 = res;
                        String _StatementToString = this.StatementToString(((Statement) state));
                        res = (_res_10 + _StatementToString);
                      }
                      String _res_11 = res;
                      res = (_res_11 + ")");
                    } else {
                      if ((s instanceof Commentary)) {
                        String _res_12 = res;
                        String _initialeValue = ((Commentary)s).getInitialeValue();
                        String _plus = ("\'\'\'" + _initialeValue);
                        String _plus_1 = (_plus + "\'\'\'");
                        res = (_res_12 + _plus_1);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    String _res_13 = res;
    res = (_res_13 + "\n");
    return res;
  }
  
  public String VariableToString(final Variable v) {
    String res = "";
    if ((v instanceof LeInteger)) {
      String _res = res;
      String _name = ((LeInteger)v).getName();
      String _plus = (_name + ":int = ");
      int _initialeValue = ((LeInteger)v).getInitialeValue();
      String _plus_1 = (_plus + Integer.valueOf(_initialeValue));
      res = (_res + _plus_1);
    } else {
      if ((v instanceof LeFloat)) {
        String _res_1 = res;
        String _name_1 = ((LeFloat)v).getName();
        String _plus_2 = (_name_1 + ":float = ");
        float _initialeValue_1 = ((LeFloat)v).getInitialeValue();
        String _plus_3 = (_plus_2 + Float.valueOf(_initialeValue_1));
        res = (_res_1 + _plus_3);
      } else {
        if ((v instanceof LeString)) {
          String _res_2 = res;
          String _name_2 = ((LeString)v).getName();
          String _plus_4 = (_name_2 + ":str = ");
          String _plus_5 = (_plus_4 + "\'");
          String _initialeValue_2 = ((LeString)v).getInitialeValue();
          String _plus_6 = (_plus_5 + _initialeValue_2);
          String _plus_7 = (_plus_6 + "\'");
          res = (_res_2 + _plus_7);
        } else {
          if ((v instanceof LeBoolean)) {
            boolean _equals = Boolean.valueOf(((LeBoolean)v).isInitialeValue()).equals(Boolean.valueOf(true));
            if (_equals) {
              String _res_3 = res;
              String _name_3 = ((LeBoolean)v).getName();
              String _plus_8 = (_name_3 + ":bool = ");
              String _plus_9 = (_plus_8 + "True");
              res = (_res_3 + _plus_9);
            } else {
              String _res_4 = res;
              String _name_4 = ((LeBoolean)v).getName();
              String _plus_10 = (_name_4 + ":bool = ");
              String _plus_11 = (_plus_10 + "False");
              res = (_res_4 + _plus_11);
            }
          }
        }
      }
    }
    return res;
  }
  
  public String ExpressionToString(final Expression e) {
    String res = "";
    if ((e instanceof BinaryOperation)) {
      String _res = res;
      String _BinaryOperationToString = this.BinaryOperationToString(((BinaryOperation) e));
      res = (_res + _BinaryOperationToString);
    } else {
      if ((e instanceof VariableProxy)) {
        String _res_1 = res;
        String _name = ((VariableProxy)e).getVariable().getName();
        res = (_res_1 + _name);
      } else {
        if ((e instanceof Variable)) {
          if ((e instanceof LeInteger)) {
            String _res_2 = res;
            int _initialeValue = ((LeInteger)e).getInitialeValue();
            res = (_res_2 + Integer.valueOf(_initialeValue));
          } else {
            if ((e instanceof LeFloat)) {
              String _res_3 = res;
              float _initialeValue_1 = ((LeFloat)e).getInitialeValue();
              res = (_res_3 + Float.valueOf(_initialeValue_1));
            } else {
              if ((e instanceof LeString)) {
                String _res_4 = res;
                String _initialeValue_2 = ((LeString)e).getInitialeValue();
                String _plus = ("\'" + _initialeValue_2);
                String _plus_1 = (_plus + "\'");
                res = (_res_4 + _plus_1);
              } else {
                if ((e instanceof LeBoolean)) {
                  boolean _equals = Boolean.valueOf(((LeBoolean)e).isInitialeValue()).equals(Boolean.valueOf(true));
                  if (_equals) {
                    String _res_5 = res;
                    res = (_res_5 + "True");
                  } else {
                    String _res_6 = res;
                    res = (_res_6 + "False");
                  }
                }
              }
            }
          }
        } else {
          if ((e instanceof SensorExpression)) {
            String _res_7 = res;
            String _SensorExpressionToString = this.SensorExpressionToString(((SensorExpression) e));
            res = (_res_7 + _SensorExpressionToString);
          }
        }
      }
    }
    return res;
  }
  
  public String LoopToString(final Loop l) {
    String res = "";
    if ((l instanceof WhileLoop)) {
      String _res = res;
      Condition _loopCondition = ((WhileLoop)l).getLoopCondition();
      String _ExpressionToString = this.ExpressionToString(((Expression) _loopCondition));
      String _plus = (("while" + " (") + _ExpressionToString);
      String _plus_1 = (_plus + ") ");
      String _plus_2 = (_plus_1 + ":");
      String _plus_3 = (_plus_2 + "\n");
      res = (_res + _plus_3);
      int _indentation = this.indentation;
      this.indentation = (_indentation + 1);
      EList<Statement> _statement = ((WhileLoop)l).getStatement();
      for (final Statement s : _statement) {
        String _res_1 = res;
        String _StatementToString = this.StatementToString(((Statement) s));
        res = (_res_1 + _StatementToString);
      }
      int _indentation_1 = this.indentation;
      this.indentation = (_indentation_1 - 1);
    }
    return res;
  }
  
  public String IfToString(final If i) {
    String res = "";
    String _res = res;
    Condition _condition = i.getCondition();
    String _ExpressionToString = this.ExpressionToString(((Expression) _condition));
    String _plus = (("if" + " (") + _ExpressionToString);
    String _plus_1 = (_plus + ") ");
    String _plus_2 = (_plus_1 + ":");
    String _plus_3 = (_plus_2 + "\n");
    res = (_res + _plus_3);
    int _indentation = this.indentation;
    this.indentation = (_indentation + 1);
    EList<Statement> _statement = i.getStatement();
    for (final Statement state : _statement) {
      String _res_1 = res;
      String _StatementToString = this.StatementToString(((Statement) state));
      res = (_res_1 + _StatementToString);
    }
    int _indentation_1 = this.indentation;
    this.indentation = (_indentation_1 - 1);
    return res;
  }
  
  public String BinaryOperationToString(final BinaryOperation b) {
    String _xblockexpression = null;
    {
      String res = "";
      if ((b instanceof Assignement)) {
        String _res = res;
        String _ExpressionToString = this.ExpressionToString(((Assignement)b).getLeft());
        String _plus = (_ExpressionToString + "=");
        String _ExpressionToString_1 = this.ExpressionToString(((Assignement)b).getRight());
        String _plus_1 = (_plus + _ExpressionToString_1);
        res = (_res + _plus_1);
      } else {
        if ((b instanceof Calcul)) {
          String _res_1 = res;
          String _CalculToString = this.CalculToString(((Calcul) b));
          res = (_res_1 + _CalculToString);
        } else {
          if ((b instanceof Comparaison)) {
            String _res_2 = res;
            String _ComparaisonToString = this.ComparaisonToString(((Comparaison) b));
            res = (_res_2 + _ComparaisonToString);
          }
        }
      }
      String _xifexpression = null;
      if ((b instanceof And)) {
        String _res_3 = res;
        String _ExpressionToString_2 = this.ExpressionToString(((And)b).getLeft());
        String _plus_2 = (_ExpressionToString_2 + " and ");
        String _ExpressionToString_3 = this.ExpressionToString(((And)b).getRight());
        String _plus_3 = (_plus_2 + _ExpressionToString_3);
        _xifexpression = res = (_res_3 + _plus_3);
      } else {
        String _xifexpression_1 = null;
        if ((b instanceof Or)) {
          String _res_4 = res;
          String _ExpressionToString_4 = this.ExpressionToString(((Or)b).getLeft());
          String _plus_4 = (_ExpressionToString_4 + " or ");
          String _ExpressionToString_5 = this.ExpressionToString(((Or)b).getRight());
          String _plus_5 = (_plus_4 + _ExpressionToString_5);
          _xifexpression_1 = res = (_res_4 + _plus_5);
        } else {
          return res;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String CalculToString(final Calcul c) {
    String res = "";
    if ((c instanceof Addition)) {
      String _res = res;
      String _ExpressionToString = this.ExpressionToString(((Addition)c).getLeft());
      String _plus = (_ExpressionToString + "+");
      String _ExpressionToString_1 = this.ExpressionToString(((Addition)c).getRight());
      String _plus_1 = (_plus + _ExpressionToString_1);
      res = (_res + _plus_1);
    } else {
      if ((c instanceof Substarction)) {
        String _res_1 = res;
        String _ExpressionToString_2 = this.ExpressionToString(((Substarction)c).getLeft());
        String _plus_2 = (_ExpressionToString_2 + "-");
        String _ExpressionToString_3 = this.ExpressionToString(((Substarction)c).getRight());
        String _plus_3 = (_plus_2 + _ExpressionToString_3);
        res = (_res_1 + _plus_3);
      } else {
        if ((c instanceof Exponential)) {
          String _res_2 = res;
          String _ExpressionToString_4 = this.ExpressionToString(((Exponential)c).getLeft());
          String _plus_4 = (_ExpressionToString_4 + "^");
          String _ExpressionToString_5 = this.ExpressionToString(((Exponential)c).getRight());
          String _plus_5 = (_plus_4 + _ExpressionToString_5);
          res = (_res_2 + _plus_5);
        } else {
          if ((c instanceof Multiplication)) {
            String _res_3 = res;
            String _ExpressionToString_6 = this.ExpressionToString(((Multiplication)c).getLeft());
            String _plus_6 = (_ExpressionToString_6 + "*");
            String _ExpressionToString_7 = this.ExpressionToString(((Multiplication)c).getRight());
            String _plus_7 = (_plus_6 + _ExpressionToString_7);
            res = (_res_3 + _plus_7);
          } else {
            if ((c instanceof Division)) {
              String _res_4 = res;
              String _ExpressionToString_8 = this.ExpressionToString(((Division)c).getLeft());
              String _plus_8 = (_ExpressionToString_8 + "/");
              String _ExpressionToString_9 = this.ExpressionToString(((Division)c).getRight());
              String _plus_9 = (_plus_8 + _ExpressionToString_9);
              res = (_res_4 + _plus_9);
            }
          }
        }
      }
    }
    return res;
  }
  
  public String ComparaisonToString(final Comparaison c) {
    String res = "";
    if ((c instanceof GT)) {
      String _res = res;
      String _ExpressionToString = this.ExpressionToString(((GT)c).getLeft());
      String _plus = (_ExpressionToString + ">");
      String _ExpressionToString_1 = this.ExpressionToString(((GT)c).getRight());
      String _plus_1 = (_plus + _ExpressionToString_1);
      res = (_res + _plus_1);
    } else {
      if ((c instanceof LT)) {
        String _res_1 = res;
        String _ExpressionToString_2 = this.ExpressionToString(((LT)c).getLeft());
        String _plus_2 = (_ExpressionToString_2 + "<");
        String _ExpressionToString_3 = this.ExpressionToString(((LT)c).getRight());
        String _plus_3 = (_plus_2 + _ExpressionToString_3);
        res = (_res_1 + _plus_3);
      } else {
        if ((c instanceof Equal)) {
          String _res_2 = res;
          String _ExpressionToString_4 = this.ExpressionToString(((Equal)c).getLeft());
          String _plus_4 = (_ExpressionToString_4 + "==");
          String _ExpressionToString_5 = this.ExpressionToString(((Equal)c).getRight());
          String _plus_5 = (_plus_4 + _ExpressionToString_5);
          res = (_res_2 + _plus_5);
        } else {
          if ((c instanceof GTEqual)) {
            String _res_3 = res;
            String _ExpressionToString_6 = this.ExpressionToString(((GTEqual)c).getLeft());
            String _plus_6 = (_ExpressionToString_6 + ">=");
            String _ExpressionToString_7 = this.ExpressionToString(((GTEqual)c).getRight());
            String _plus_7 = (_plus_6 + _ExpressionToString_7);
            res = (_res_3 + _plus_7);
          } else {
            if ((c instanceof LTEqual)) {
              String _res_4 = res;
              String _ExpressionToString_8 = this.ExpressionToString(((LTEqual)c).getLeft());
              String _plus_8 = (_ExpressionToString_8 + "<=");
              String _ExpressionToString_9 = this.ExpressionToString(((LTEqual)c).getRight());
              String _plus_9 = (_plus_8 + _ExpressionToString_9);
              res = (_res_4 + _plus_9);
            }
          }
        }
      }
    }
    return res;
  }
  
  public String RobotToString(final Robot r) {
    String res = "";
    EList<Actuator> _actuator = r.getActuator();
    for (final Actuator r_a : _actuator) {
      String _res = res;
      String _StatementToString = this.StatementToString(((Actuator) r_a));
      res = (_res + _StatementToString);
    }
    EList<Sensor> _sensor = r.getSensor();
    for (final Sensor r_s : _sensor) {
      String _res_1 = res;
      String _StatementToString_1 = this.StatementToString(((Sensor) r_s));
      res = (_res_1 + _StatementToString_1);
    }
    String _res_2 = res;
    Wheel _leftWheel = r.getLeftWheel();
    String _RotativeMotorToString = this.RotativeMotorToString(((Wheel) _leftWheel));
    String _plus = ("left" + _RotativeMotorToString);
    String _plus_1 = (_plus + "\n");
    res = (_res_2 + _plus_1);
    String _res_3 = res;
    Wheel _rightWheel = r.getRightWheel();
    String _RotativeMotorToString_1 = this.RotativeMotorToString(((Wheel) _rightWheel));
    String _plus_2 = ("right" + _RotativeMotorToString_1);
    String _plus_3 = (_plus_2 + "\n");
    res = (_res_3 + _plus_3);
    return res;
  }
  
  public String ActuatorToString(final Actuator a) {
    String res = "";
    if ((a instanceof Motor)) {
      String _res = res;
      String _MotorToString = this.MotorToString(((Motor) a));
      res = (_res + _MotorToString);
    } else {
      if ((a instanceof Led)) {
        String _res_1 = res;
        String _portID = ((Led)a).getPortID();
        String _plus = ("ledMotor" + _portID);
        String _plus_1 = (_plus + " = ");
        String _plus_2 = (_plus_1 + "LargeMotor");
        String _plus_3 = (_plus_2 + "(");
        String _portID_1 = ((Led)a).getPortID();
        String _plus_4 = (_plus_3 + _portID_1);
        String _plus_5 = (_plus_4 + ")");
        res = (_res_1 + _plus_5);
      }
    }
    return res;
  }
  
  public String SensorToString(final Sensor s) {
    String res = "";
    if ((s instanceof ColorSensor)) {
      String _res = res;
      String _portID = ((ColorSensor)s).getPortID();
      String _plus = ("colorSensor" + _portID);
      String _plus_1 = (_plus + " = ");
      String _plus_2 = (_plus_1 + "ColorSensor");
      String _plus_3 = (_plus_2 + "(");
      String _portID_1 = ((ColorSensor)s).getPortID();
      String _plus_4 = (_plus_3 + _portID_1);
      String _plus_5 = (_plus_4 + ")");
      res = (_res + _plus_5);
    } else {
      if ((s instanceof LaserSensor)) {
        String _res_1 = res;
        String _portID_2 = ((LaserSensor)s).getPortID();
        String _plus_6 = ("laserSensor" + _portID_2);
        String _plus_7 = (_plus_6 + " = ");
        String _plus_8 = (_plus_7 + "LaserRangeSensor");
        String _plus_9 = (_plus_8 + "(");
        String _portID_3 = ((LaserSensor)s).getPortID();
        String _plus_10 = (_plus_9 + _portID_3);
        String _plus_11 = (_plus_10 + ")");
        res = (_res_1 + _plus_11);
      } else {
        if ((s instanceof GyroSensor)) {
          String _res_2 = res;
          String _portID_4 = ((GyroSensor)s).getPortID();
          String _plus_12 = ("gyroSensor" + _portID_4);
          String _plus_13 = (_plus_12 + " = ");
          String _plus_14 = (_plus_13 + "GyroSensor");
          String _plus_15 = (_plus_14 + "(");
          String _portID_5 = ((GyroSensor)s).getPortID();
          String _plus_16 = (_plus_15 + _portID_5);
          String _plus_17 = (_plus_16 + ")");
          res = (_res_2 + _plus_17);
        } else {
          if ((s instanceof GPSSensor)) {
            String _res_3 = res;
            String _portID_6 = ((GPSSensor)s).getPortID();
            String _plus_18 = ("gpsSensor" + _portID_6);
            String _plus_19 = (_plus_18 + " = ");
            String _plus_20 = (_plus_19 + "GPSSensor");
            String _plus_21 = (_plus_20 + "(");
            String _portID_7 = ((GPSSensor)s).getPortID();
            String _plus_22 = (_plus_21 + _portID_7);
            String _plus_23 = (_plus_22 + ")");
            res = (_res_3 + _plus_23);
          }
        }
      }
    }
    return res;
  }
  
  public String MotorToString(final Motor m) {
    String res = "";
    if ((m instanceof RotativeMotor)) {
      String _res = res;
      String _RotativeMotorToString = this.RotativeMotorToString(((RotativeMotor) m));
      res = (_res + _RotativeMotorToString);
    } else {
      if ((m instanceof ShootLauncher)) {
        String _res_1 = res;
        String _portID = ((ShootLauncher)m).getPortID();
        String _plus = ("shootMotor" + _portID);
        String _plus_1 = (_plus + " = ");
        String _plus_2 = (_plus_1 + "LargeMotor");
        String _plus_3 = (_plus_2 + "(");
        String _portID_1 = ((ShootLauncher)m).getPortID();
        String _plus_4 = (_plus_3 + _portID_1);
        String _plus_5 = (_plus_4 + ")");
        res = (_res_1 + _plus_5);
      }
    }
    return res;
  }
  
  public String RotativeMotorToString(final RotativeMotor rm) {
    String res = "";
    if ((rm instanceof Arm)) {
      String _res = res;
      String _portID = ((Arm)rm).getPortID();
      String _plus = ("armMotor" + _portID);
      String _plus_1 = (_plus + " = ");
      String _plus_2 = (_plus_1 + "LargeMotor");
      String _plus_3 = (_plus_2 + "(");
      String _portID_1 = ((Arm)rm).getPortID();
      String _plus_4 = (_plus_3 + _portID_1);
      String _plus_5 = (_plus_4 + ")");
      res = (_res + _plus_5);
    } else {
      if ((rm instanceof Wheel)) {
        String _res_1 = res;
        String _portID_2 = ((Wheel)rm).getPortID();
        String _plus_6 = ("wheelMotor" + _portID_2);
        String _plus_7 = (_plus_6 + " = ");
        String _plus_8 = (_plus_7 + "LargeMotor");
        String _plus_9 = (_plus_8 + "(");
        String _portID_3 = ((Wheel)rm).getPortID();
        String _plus_10 = (_plus_9 + _portID_3);
        String _plus_11 = (_plus_10 + ")");
        res = (_res_1 + _plus_11);
      }
    }
    return res;
  }
  
  public String ActuatorStatementToString(final ActuatorStatement rs) {
    String res = "";
    if ((rs instanceof Go)) {
      String _res = res;
      String _portID = ((Go)rs).getRobot().getLeftWheel().getPortID();
      String _plus = ("MoveSteering(" + _portID);
      String _plus_1 = (_plus + ",");
      String _portID_1 = ((Go)rs).getRobot().getRightWheel().getPortID();
      String _plus_2 = (_plus_1 + _portID_1);
      String _plus_3 = (_plus_2 + ").on(");
      String _plus_4 = (_plus_3 + "0, ");
      Expression _speed = ((Go)rs).getSpeed();
      String _ExpressionToString = this.ExpressionToString(((Expression) _speed));
      String _plus_5 = (_plus_4 + _ExpressionToString);
      String _plus_6 = (_plus_5 + ")");
      res = (_res + _plus_6);
    }
    if ((rs instanceof Turn)) {
      boolean _equals = ((Turn)rs).getDirection().equals(Direction.LEFT);
      if (_equals) {
        String _res_1 = res;
        String _portID_2 = ((Turn)rs).getRobot().getLeftWheel().getPortID();
        String _plus_7 = ("MoveSteering(" + _portID_2);
        String _plus_8 = (_plus_7 + ",");
        String _portID_3 = ((Turn)rs).getRobot().getRightWheel().getPortID();
        String _plus_9 = (_plus_8 + _portID_3);
        String _plus_10 = (_plus_9 + ").on(");
        String _plus_11 = (_plus_10 + "-90, ");
        Expression _speed_1 = ((Turn)rs).getSpeed();
        String _ExpressionToString_1 = this.ExpressionToString(((Expression) _speed_1));
        String _plus_12 = (_plus_11 + _ExpressionToString_1);
        String _plus_13 = (_plus_12 + ")");
        res = (_res_1 + _plus_13);
      } else {
        boolean _equals_1 = ((Turn)rs).getDirection().equals(Direction.RIGHT);
        if (_equals_1) {
          String _res_2 = res;
          String _portID_4 = ((Turn)rs).getRobot().getLeftWheel().getPortID();
          String _plus_14 = ("MoveSteering(" + _portID_4);
          String _plus_15 = (_plus_14 + ",");
          String _portID_5 = ((Turn)rs).getRobot().getRightWheel().getPortID();
          String _plus_16 = (_plus_15 + _portID_5);
          String _plus_17 = (_plus_16 + ").on(");
          String _plus_18 = (_plus_17 + "90, ");
          Expression _speed_2 = ((Turn)rs).getSpeed();
          String _ExpressionToString_2 = this.ExpressionToString(((Expression) _speed_2));
          String _plus_19 = (_plus_18 + _ExpressionToString_2);
          String _plus_20 = (_plus_19 + ")");
          res = (_res_2 + _plus_20);
        }
      }
    }
    EList<Actuator> _actuator = rs.getRobot().getActuator();
    for (final Actuator act : _actuator) {
      if ((rs instanceof ChangeAngle)) {
        if ((act instanceof Arm)) {
          String _res_3 = res;
          String _portID_6 = ((Arm)act).getPortID();
          String _plus_21 = ("armMotor" + _portID_6);
          String _plus_22 = (_plus_21 + ".on_for_degrees(20,");
          Expression _angle = ((ChangeAngle)rs).getAngle();
          String _ExpressionToString_3 = this.ExpressionToString(((Expression) _angle));
          String _plus_23 = (_plus_22 + _ExpressionToString_3);
          String _plus_24 = (_plus_23 + ")");
          res = (_res_3 + _plus_24);
        }
      } else {
        if ((rs instanceof ChangeIntensity)) {
          if ((act instanceof Led)) {
            String _res_4 = res;
            String _portID_7 = ((Led)act).getPortID();
            String _plus_25 = ("ledMotor" + _portID_7);
            String _plus_26 = (_plus_25 + ".intensity(");
            Expression _intensity = ((ChangeIntensity)rs).getIntensity();
            String _ExpressionToString_4 = this.ExpressionToString(((Expression) _intensity));
            String _plus_27 = (_plus_26 + _ExpressionToString_4);
            String _plus_28 = (_plus_27 + ")");
            res = (_res_4 + _plus_28);
          }
        } else {
          if ((rs instanceof Shoot)) {
            if ((act instanceof ShootLauncher)) {
              String _res_5 = res;
              String _portID_8 = ((ShootLauncher)act).getPortID();
              String _plus_29 = ("shootMotor" + _portID_8);
              String _plus_30 = (_plus_29 + ".on_for_rotations(100,-");
              Expression _force = ((Shoot)rs).getForce();
              String _ExpressionToString_5 = this.ExpressionToString(((Expression) _force));
              String _plus_31 = (_plus_30 + _ExpressionToString_5);
              String _plus_32 = (_plus_31 + ") , ");
              res = (_res_5 + _plus_32);
              String _res_6 = res;
              String _portID_9 = ((ShootLauncher)act).getPortID();
              String _plus_33 = ("shootMotor" + _portID_9);
              String _plus_34 = (_plus_33 + ".on_for_rotations(100,");
              Expression _force_1 = ((Shoot)rs).getForce();
              String _ExpressionToString_6 = this.ExpressionToString(((Expression) _force_1));
              String _plus_35 = (_plus_34 + _ExpressionToString_6);
              String _plus_36 = (_plus_35 + ")");
              res = (_res_6 + _plus_36);
            }
          }
        }
      }
    }
    return res;
  }
  
  public String SensorExpressionToString(final SensorExpression se) {
    String res = "";
    if ((se instanceof GetDistance)) {
      String _res = res;
      String _portID = ((GetDistance)se).getSensor().getPortID();
      String _plus = ("laserSensor" + _portID);
      res = (_res + _plus);
    } else {
      if ((se instanceof GetPosition)) {
        String _res_1 = res;
        String _portID_1 = ((GetPosition)se).getSensor().getPortID();
        String _plus_1 = ("gpsSensor" + _portID_1);
        res = (_res_1 + _plus_1);
      } else {
        if ((se instanceof GetGyro)) {
          String _res_2 = res;
          String _portID_2 = ((GetGyro)se).getSensor().getPortID();
          String _plus_2 = ("gyroSensor" + _portID_2);
          res = (_res_2 + _plus_2);
        } else {
          if ((se instanceof GetColor)) {
            String _res_3 = res;
            String _portID_3 = ((GetColor)se).getSensor().getPortID();
            String _plus_3 = ("colorSensor" + _portID_3);
            String _plus_4 = (_plus_3 + ".color_name");
            res = (_res_3 + _plus_4);
          }
        }
      }
    }
    return res;
  }
}
