/*
 * generated by Xtext 2.24.0
 */
package dsl.ui.tests;

import com.google.inject.Injector;
import greenhouse.ui.internal.GreenhouseActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class GreenhouseUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return GreenhouseActivator.getInstance().getInjector("dsl.Greenhouse");
	}

}
