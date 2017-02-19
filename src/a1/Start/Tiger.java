package a1.Start;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

//implements ReplaceMethod interface to be able to donate method
public class Tiger implements MethodReplacer {

	// here donated replacing method
	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		return "Replaced - I'm angry tiger!";
	}
}
