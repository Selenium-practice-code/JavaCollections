package comparisonTest;

public class SingleTonTest {
	
	//Creating private variable reference object
	private static SingleTonTest instance = new SingleTonTest();
	
	private SingleTonTest() {
		
		System.out.println("Creating Object");
	}
	
	public static SingleTonTest getInstance() {
		
		return instance;
	}
	
	

}
