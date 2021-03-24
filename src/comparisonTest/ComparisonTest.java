package comparisonTest;

public class ComparisonTest {

	/*
	 * == comparison = object reference same, address
	 * 
	 * .equals() = content is same
	 */
	
	
	public static void main(String[] args) {
		
		String name1 = "Sumit";
		String name2 = "Sumit";
		
		String name_1 = new String("Raman");
		String name_2 = new String("Raman");
		
		System.out.println(name_1 == name_2);
		System.out.println(name_1.equals(name_2));
		
		//creating two object with the same address
		SingleTonTest s = SingleTonTest.getInstance();
		SingleTonTest s1 = SingleTonTest.getInstance();
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s1 == s);
		/*System.out.println(name1 == name2);//True
		System.out.println(name1.equals(name2));//True*/
	}
	 

}
