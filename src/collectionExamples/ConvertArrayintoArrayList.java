package collectionExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayintoArrayList {

	public static void main(String[] args) {
		 
		String arr[] = {"a","b","c"};
		
		/*for(String value:arr) {
			
			System.out.println(value);
		}*/
		
		ArrayList al = new ArrayList(Arrays.asList(arr));
		
		System.out.println(al);

	}

}
