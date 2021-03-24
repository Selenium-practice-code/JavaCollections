package collectionExamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		 
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Sumit");
		hs.add("Raman");
		hs.add("Rohit");
		hs.add("Selenium");
		hs.add("Lenovo");
		hs.add("Sumit");
		
		System.out.println(hs);
		
		//get the value
		/*for(String var:hs) {
			
			System.out.println(var);
		}*/
		
		Iterator<String> itr = hs.iterator();
		
		/*while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}*/
		//Return particular 

		String var = itr.next();
		if(var.equals("Lenovo")) {
			
			System.out.println(var);
		}

	}

}
