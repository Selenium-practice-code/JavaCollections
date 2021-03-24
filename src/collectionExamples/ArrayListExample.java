package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		 
		
		ArrayList list = new ArrayList();
		
		
		System.out.println(list);
		
		//Add value in array List
		
		list.add(10);
		list.add("Sumit");
		list.add(25.25);
		list.add('c');
		list.add(true);
		list.add("Sumit");
		
		System.out.println(list);

		System.out.println(list.size());
		
		//How to fetch the value form a list
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		//System.out.println(list.get(6));//Throw exception
		
		//remove
		list.remove(5);
		System.out.println(list);
		System.out.println(list.size());
		
		//Using for loop
		/*for(int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i));
		}*/
		
		//For each loop
		/*for(Object var:list) {
			
			System.out.println(var);
		}*/
		
		//iterator method
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
	}

}
