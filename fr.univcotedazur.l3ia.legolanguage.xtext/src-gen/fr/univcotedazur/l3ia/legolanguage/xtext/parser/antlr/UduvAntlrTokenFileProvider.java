/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.l3ia.legolanguage.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class UduvAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/univcotedazur/l3ia/legolanguage/xtext/parser/antlr/internal/InternalUduv.tokens");
	}
}
