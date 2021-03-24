package collectionExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashmapExample {

	public static void main(String[] args) {
		 
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("firstName", "Raman");
		map.put("lastName", "Arora");
		map.put("sub", "Selenium");
		map.put("location", "India");
		
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map.get("firstName"));
		
		//return the keyset in the map
		System.out.println(map.keySet());
		
		//return all the values
		System.out.println(map.values());
		
		//return all the entry set of collection as a set
		System.out.println(map.entrySet());
		
		//return key and value using for loop
		
		Set<String> keys = map.keySet();
		
		for(String key:keys) {
			
			System.out.println("Key --> " + key + "  Value is --> " + map.get(key));
		}
		
		//Key in a form of List as well
		
		Map<String, List<String>> map1 = new HashMap<String,List<String>>();
		
		//create a list of string type
		
		List<String> loe = new ArrayList<String>();
		loe.add("abc@gmail.com");
		loe.add("xyz@gmail.com");
		loe.add("qwe@gmail.com");
		
		map1.put("email", loe);
		
		System.out.println(loe);
		
		
		
	}

}
