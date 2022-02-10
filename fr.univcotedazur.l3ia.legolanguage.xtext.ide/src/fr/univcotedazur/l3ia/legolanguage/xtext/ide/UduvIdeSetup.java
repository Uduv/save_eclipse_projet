/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.l3ia.legolanguage.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.univcotedazur.l3ia.legolanguage.xtext.UduvRuntimeModule;
import fr.univcotedazur.l3ia.legolanguage.xtext.UduvStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class UduvIdeSetup extends UduvStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new UduvRuntimeModule(), new UduvIdeModule()));
	}
	
}
