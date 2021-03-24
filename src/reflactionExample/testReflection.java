package reflactionExample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 
		String x = "click";
		
		Method method = testReflection.class.getMethod(x, String.class);
		method.invoke(method, "Hi, there");

	}
	
	
	public static void click(String x) {
	 
		System.out.println("Executing the Test : " + x);
	}

}
