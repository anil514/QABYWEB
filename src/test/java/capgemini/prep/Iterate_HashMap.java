package capgemini.prep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Iterate_HashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		// iterating through key/value mappings
		 System.out.print("Entries: ");
		 for(Entry<Integer, String> entry: hm.entrySet()) {
		      System.out.print(entry);
		      System.out.print(", ");
		    }
		
		Iterator it = hm.entrySet().iterator();
		while(it.hasNext()) {
		System.out.println("Entries1: " + it.next());	
		System.out.print(", ");
		}
		
		// iterating through keys
	    System.out.print("\nKeys: ");
	    for(Integer key: hm.keySet()) {
	      System.out.print(key);
	      System.out.print(", ");
	    }
	    
	 // iterating through values
	    System.out.print("\nValues: ");
	    for(String value: hm.values()) {
	      System.out.print(value);
	      System.out.print(", ");
	    }
		

	}

}
