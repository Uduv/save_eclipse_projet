/**
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.l3ia.legolanguage.xtext.generator;

import fr.univcotedazur.l3ia.langagecompilation.Addition;
import fr.univcotedazur.l3ia.langagecompilation.Assignement;
import fr.univcotedazur.l3ia.langagecompilation.BinaryOperation;
import fr.univcotedazur.l3ia.langagecompilation.Calcul;
import fr.univcotedazur.l3ia.langagecompilation.Commentary;
import fr.univcotedazur.l3ia.langagecompilation.Comparaison;
import fr.univcotedazur.l3ia.langagecompilation.Division;
import fr.univcotedazur.l3ia.langagecompilation.Equal;
import fr.univcotedazur.l3ia.langagecompilation.Exponential;
import fr.univcotedazur.l3ia.langagecompilation.Expression;
import fr.univcotedazur.l3ia.langagecompilation.ForLoop;
import fr.univcotedazur.l3ia.langagecompilation.GT;
import fr.univcotedazur.l3ia.langagecompilation.GTEqual;
import fr.univcotedazur.l3ia.langagecompilation.If;
import fr.univcotedazur.l3ia.langagecompilation.LT;
import fr.univcotedazur.l3ia.langagecompilation.LTEqual;
import fr.univcotedazur.l3ia.langagecompilation.LeBoolean;
import fr.univcotedazur.l3ia.langagecompilation.LeFloat;
import fr.univcotedazur.l3ia.langagecompilation.LeInteger;
import fr.univcotedazur.l3ia.langagecompilation.LeString;
import fr.univcotedazur.l3ia.langagecompilation.Loop;
import fr.univcotedazur.l3ia.langagecompilation.Multiplication;
import fr.univcotedazur.l3ia.langagecompilation.Print;
import fr.univcotedazur.l3ia.langagecompilation.Program;
import fr.univcotedazur.l3ia.langagecompilation.Statement;
import fr.univcotedazur.l3ia.langagecompilation.Substarction;
import fr.univcotedazur.l3ia.langagecompilation.Variable;
import fr.univcotedazur.l3ia.langagecompilation.VariableProxy;
import fr.univcotedazur.l3ia.langagecompilation.WhileLoop;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
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
    fsa.generateFile(_plus, ("#!/usr/bin/env python3\n# Import Libraries\nimport time\nimport math\nfrom ev3dev2.motor import *\nfrom ev3dev2.sound import Sound\nfrom ev3dev2.button import Button\nfrom ev3dev2.sensor import *\nfrom ev3dev2.sensor.lego import *\nfrom ev3dev2.sensor.virtual import *\n\n" + fileContent));
  }
  
  public String StatementToString(final Statement s) {
    String res = "";
    boolean _isIsInConditionial = s.isIsInConditionial();
    if (_isIsInConditionial) {
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
            Comparaison _condition = ((If)s).getCondition();
            String _ExpressionToString_1 = this.ExpressionToString(((Expression) _condition));
            String _plus = (("if" + " (") + _ExpressionToString_1);
            String _plus_1 = (_plus + ") ");
            String _plus_2 = (_plus_1 + ":");
            String _plus_3 = (_plus_2 + "\n");
            res = (_res_4 + _plus_3);
            EList<Statement> _statement = ((If)s).getStatement();
            for (final Statement state : _statement) {
              {
                state.setIsInConditionial(true);
                String _res_5 = res;
                String _StatementToString = this.StatementToString(((Statement) state));
                String _plus_4 = ("\t" + _StatementToString);
                res = (_res_5 + _plus_4);
              }
            }
          } else {
            if ((s instanceof Print)) {
              String _res_5 = res;
              res = (_res_5 + "print(");
              EList<Statement> _statement_1 = ((Print)s).getStatement();
              for (final Statement state_1 : _statement_1) {
                String _res_6 = res;
                String _StatementToString = this.StatementToString(((Statement) state_1));
                res = (_res_6 + _StatementToString);
              }
              String _res_7 = res;
              res = (_res_7 + ")");
            } else {
              if ((s instanceof Commentary)) {
                String _res_8 = res;
                String _initialeValue = ((Commentary)s).getInitialeValue();
                String _plus_4 = ("\'\'\'" + _initialeValue);
                String _plus_5 = (_plus_4 + "\'\'\'");
                res = (_res_8 + _plus_5);
              }
            }
          }
        }
      }
    }
    String _res_9 = res;
    res = (_res_9 + "\n");
    return res;
  }
  
  public String VariableToString(final Variable v) {
    String res = "";
    if ((v instanceof LeInteger)) {
      boolean _isIsInExpression = ((LeInteger)v).isIsInExpression();
      if (_isIsInExpression) {
        String _res = res;
        int _initialeValue = ((LeInteger)v).getInitialeValue();
        res = (_res + Integer.valueOf(_initialeValue));
      } else {
        String _res_1 = res;
        String _name = ((LeInteger)v).getName();
        String _plus = (_name + ":int = ");
        int _initialeValue_1 = ((LeInteger)v).getInitialeValue();
        String _plus_1 = (_plus + Integer.valueOf(_initialeValue_1));
        res = (_res_1 + _plus_1);
      }
    } else {
      if ((v instanceof LeFloat)) {
        String _res_2 = res;
        String _name_1 = ((LeFloat)v).getName();
        String _plus_2 = (_name_1 + ":float = ");
        float _initialeValue_2 = ((LeFloat)v).getInitialeValue();
        String _plus_3 = (_plus_2 + Float.valueOf(_initialeValue_2));
        res = (_res_2 + _plus_3);
      } else {
        if ((v instanceof LeString)) {
          String _res_3 = res;
          String _name_2 = ((LeString)v).getName();
          String _plus_4 = (_name_2 + ":str = ");
          String _plus_5 = (_plus_4 + "\'");
          String _initialeValue_3 = ((LeString)v).getInitialeValue();
          String _plus_6 = (_plus_5 + _initialeValue_3);
          String _plus_7 = (_plus_6 + "\'");
          res = (_res_3 + _plus_7);
        } else {
          if ((v instanceof LeBoolean)) {
            boolean _equals = Boolean.valueOf(((LeBoolean)v).isInitialeValue()).equals(Boolean.valueOf(true));
            if (_equals) {
              String _res_4 = res;
              String _name_3 = ((LeBoolean)v).getName();
              String _plus_8 = (_name_3 + ":bool = ");
              String _plus_9 = (_plus_8 + "True");
              res = (_res_4 + _plus_9);
            } else {
              String _res_5 = res;
              String _name_4 = ((LeBoolean)v).getName();
              String _plus_10 = (_name_4 + ":bool = ");
              String _plus_11 = (_plus_10 + "False");
              res = (_res_5 + _plus_11);
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
      if ((e instanceof Variable)) {
        ((Variable)e).setIsInExpression(true);
        String _res_1 = res;
        String _VariableToString = this.VariableToString(((Variable) e));
        res = (_res_1 + _VariableToString);
      }
    }
    if ((e instanceof VariableProxy)) {
      String _res_2 = res;
      String _name = ((VariableProxy)e).getVariable().getName();
      res = (_res_2 + _name);
    }
    return res;
  }
  
  public String LoopToString(final Loop l) {
    String res = "";
    if ((l instanceof ForLoop)) {
      String _res = res;
      Comparaison _loopCondition = ((ForLoop)l).getLoopCondition();
      String _ExpressionToString = this.ExpressionToString(((Expression) _loopCondition));
      String _plus = (("for" + " (") + _ExpressionToString);
      String _plus_1 = (_plus + ") ");
      String _plus_2 = (_plus_1 + ":");
      String _plus_3 = (_plus_2 + "\n");
      res = (_res + _plus_3);
      EList<Statement> _statement = ((ForLoop)l).getStatement();
      for (final Statement s : _statement) {
        String _res_1 = res;
        String _StatementToString = this.StatementToString(((Statement) s));
        String _plus_4 = ("\t" + _StatementToString);
        res = (_res_1 + _plus_4);
      }
    }
    if ((l instanceof WhileLoop)) {
      String _res_2 = res;
      Comparaison _loopCondition_1 = ((WhileLoop)l).getLoopCondition();
      String _ExpressionToString_1 = this.ExpressionToString(((Expression) _loopCondition_1));
      String _plus_5 = (("while" + " (") + _ExpressionToString_1);
      String _plus_6 = (_plus_5 + ") ");
      String _plus_7 = (_plus_6 + ":");
      String _plus_8 = (_plus_7 + "\n");
      res = (_res_2 + _plus_8);
      EList<Statement> _statement_1 = ((WhileLoop)l).getStatement();
      for (final Statement s_1 : _statement_1) {
        String _res_3 = res;
        String _StatementToString_1 = this.StatementToString(((Statement) s_1));
        String _plus_9 = ("\t" + _StatementToString_1);
        res = (_res_3 + _plus_9);
      }
    }
    return res;
  }
  
  public String BinaryOperationToString(final BinaryOperation b) {
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
    return res;
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
}
