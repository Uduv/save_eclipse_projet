/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.l3ia.legolanguage.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import fr.univcotedazur.l3ia.langagecompilation.Program
import fr.univcotedazur.l3ia.langagecompilation.Statement
import fr.univcotedazur.l3ia.langagecompilation.Addition
import fr.univcotedazur.l3ia.langagecompilation.Expression
import fr.univcotedazur.l3ia.langagecompilation.LeInteger
import fr.univcotedazur.l3ia.langagecompilation.Variable
import fr.univcotedazur.l3ia.langagecompilation.LeFloat
import fr.univcotedazur.l3ia.langagecompilation.LeString
import fr.univcotedazur.l3ia.langagecompilation.LeBoolean
import fr.univcotedazur.l3ia.langagecompilation.BinaryOperation
import fr.univcotedazur.l3ia.langagecompilation.Assignement
import fr.univcotedazur.l3ia.langagecompilation.Calcul
import fr.univcotedazur.l3ia.langagecompilation.Division
import fr.univcotedazur.l3ia.langagecompilation.Substarction
import fr.univcotedazur.l3ia.langagecompilation.Exponential
import fr.univcotedazur.l3ia.langagecompilation.Multiplication
import fr.univcotedazur.l3ia.langagecompilation.Comparaison
import fr.univcotedazur.l3ia.langagecompilation.GT
import fr.univcotedazur.l3ia.langagecompilation.LT
import fr.univcotedazur.l3ia.langagecompilation.Equal
import fr.univcotedazur.l3ia.langagecompilation.Loop
import fr.univcotedazur.l3ia.langagecompilation.ForLoop
import fr.univcotedazur.l3ia.langagecompilation.WhileLoop
import fr.univcotedazur.l3ia.langagecompilation.Print
import fr.univcotedazur.l3ia.langagecompilation.Commentary
import fr.univcotedazur.l3ia.langagecompilation.If
import fr.univcotedazur.l3ia.langagecompilation.GTEqual
import fr.univcotedazur.l3ia.langagecompilation.LTEqual
import fr.univcotedazur.l3ia.langagecompilation.VariableProxy

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class UduvGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))



	var Program prog = resource.allContents.head as Program 
	var String fileContent = ''
	//fileContent += CodeToString(prog.statement)
	for (s : prog.statement) {
		fileContent += StatementToString(s)
	}
	
	fsa.generateFile(prog.name + '.py', '#!/usr/bin/env python3
# Import library
import math
import time\n\n' + fileContent )
	}
	
	def String StatementToString(Statement s) {
		var res = ''
		// not work 
		// check before if variable is a "variable expression" and after a variable flottante
		if (s instanceof Variable) {
			res += VariableToString(s as Variable)
		}else
		if (s instanceof Expression) {
			res += ExpressionToString(s as Expression)
		}else
		if(s instanceof Loop){
			res += LoopToString(s as Loop)
		}else
		if(s instanceof If){
			res += 'if' + ' ('+ ExpressionToString(s.condition as Expression) + ') ' +':' + '\n'
			for ( state : s.statement ) {
				res += '\t' + StatementToString(state as Statement)
			}
		}else
		if(s instanceof Print){
			res += 'print'+'('+ ExpressionToString(s.statement as Expression) + ')' 
		}else
		if(s instanceof Commentary){
			res += '\'\'\'' + s.initialeValue + '\'\'\''
		}
		res +=  '\n'
		return res
	}
	
	def String VariableToString(Variable v) {
		var res = ''
		
		if (v instanceof LeInteger) {
			if (v.isInExpression){ 
			res += v.initialeValue
			}else{
				
			res += v.name + ':int = '+ v.initialeValue
			}
		}else
		if (v instanceof LeFloat) {
			res += v.name + ':float = '+ v.initialeValue
		}else
		if (v instanceof LeString) {
			res += v.name + ':str = '+ '\'' + v.initialeValue + '\'' 

		}else
		if (v instanceof LeBoolean) {
		
			if ( v.initialeValue.equals('True') ){
				res += v.name + ':bool = ' + "True"
			}else 
			{
				res += v.name + ':bool = ' + "False"
				
			}
		}
				
			
		return res
	}
	
	def String ExpressionToString(Expression e) {
		var res = ''
		if (e instanceof BinaryOperation) {
			res += BinaryOperationToString(e as BinaryOperation)
		}else 
		if (e instanceof Variable) {
			e.isInExpression = true
			res += VariableToString(e as Variable)
		} 
		if (e instanceof VariableProxy){
			res += e.variable.name
		}
		return res 
	}
	
	def String LoopToString(Loop l){
		var res = ''
		if(l instanceof ForLoop){
			res += 'for' + ' (' + ExpressionToString(l.loopCondition as Expression) + ') ' +':' + '\n'
			for ( s : l.statement ) {
				res += '\t' + StatementToString(s as Statement)
			}  
		}
		if(l instanceof WhileLoop){
			res += 'while' + ' ('+ ExpressionToString(l.loopCondition as Expression) + ') ' +':' + '\n'
			for ( s : l.statement ) {
				res += '\t' + StatementToString(s as Statement)
			}
		}
		return res 
	}
	
	
	def String BinaryOperationToString(BinaryOperation b){
		var res = ''
		if (b instanceof Assignement) {
			res += ExpressionToString(b.left) + '=' + ExpressionToString(b.right)
		}else
		if (b instanceof Calcul) {
			res += CalculToString(b as Calcul)
		}else 
		if (b instanceof Comparaison){
			res += ComparaisonToString(b as Comparaison)
		}
		
		return res
	} 
	
	
	def String CalculToString(Calcul c){
		var res = ''
		if (c instanceof Addition){
			res += ExpressionToString(c.left) + '+' + ExpressionToString(c.right)
		}else
		if (c instanceof Substarction){
			res += ExpressionToString(c.left) + '-' + ExpressionToString(c.right)
		}else
		if (c instanceof Exponential){
			res += ExpressionToString(c.left) + '^' + ExpressionToString(c.right)
		}else
		if (c instanceof Multiplication){
			res += ExpressionToString(c.left) + '*' + ExpressionToString(c.right)
		}else
		if (c instanceof Division){
			res += ExpressionToString(c.left) + '/' + ExpressionToString(c.right)
		}
		
		
		return res
	}
	
	def String ComparaisonToString(Comparaison c){
		var res = ''
		if (c instanceof GT){
			res += ExpressionToString(c.left) + '>' + ExpressionToString(c.right)
		}else
		if (c instanceof LT){
			res += ExpressionToString(c.left) + '<' + ExpressionToString(c.right)
		}else
		if (c instanceof Equal){
			res += ExpressionToString(c.left) + '==' + ExpressionToString(c.right)
		}else
		if (c instanceof GTEqual){
			res += ExpressionToString(c.left) + '>=' + ExpressionToString(c.right)
		}else
		if (c instanceof LTEqual){
			res += ExpressionToString(c.left) + '<=' + ExpressionToString(c.right)
		}
		
		
		
		return res
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
