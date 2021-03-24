package reflactionExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Home {
	
	public static void main(String[] args) {
		 
		Test t = new Test();
		
		//Returning the object of class 
		Class clazz = t.getClass();
		
		System.out.println(clazz.getSimpleName());// return class name
		
		Method[] arrayOfMethods = clazz.getDeclaredMethods();
		
		System.out.println(arrayOfMethods.length);
		System.out.println(clazz.getMethods().length);
		
		//getting Constructor information..
		Constructor[] cons = clazz.getDeclaredConstructors();
		System.out.println(cons.length);
		
		for(Constructor c:cons) {
			
			System.out.println(c.getName());
		}
		
		//Print the methods name using for each loop
		for(Method m:arrayOfMethods) {
			
			System.out.println(m.getName());
			
			//return type
			System.out.println(m.getName() +"---Return type is: --" + m.getReturnType());
			
			//return the parameter type(return arguments )
			Parameter[] p = m.getParameters();
			
			for(Parameter para:p) {
				
				System.out.println(para.getName());
			}
		
		}
	}


}
 