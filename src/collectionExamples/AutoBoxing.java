package collectionExamples;

public class AutoBoxing {

	public static void main(String[] args) {
		 
		int var = 10;
		
		//Converting the primitive to the object of integer class
		@SuppressWarnings("deprecation")
		Integer obj = new Integer(var);//Wrapping ---->Autoboxing
		
		System.out.println(obj);
		
		//Convert object in to primitive
		int i = obj;//unwrapping ---->autoUnboxing
		
		
	}

}
