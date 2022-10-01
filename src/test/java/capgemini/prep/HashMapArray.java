package capgemini.prep;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapArray {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(5, "Three");
		hm.put(3, "Three");
		hm.put(4, "Four");
		Object[] it =  hm.keySet().toArray();
		System.out.println(it.length);
		Object[] it1 =  hm.values().toArray();
		System.out.println(it1.length);
		
		Collection<String> values = hm.values();
		HashSet<String> hs = new HashSet<String>(values);
		for(String s : hs) {
			System.out.println(s);
		}

	}

}
