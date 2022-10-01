package tetra.prep;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapRetrive {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("One", "1");
		hm.put("two", "12");
		hm.put("three", "123");
		hm.put("four", "1234");
		for(String k : hm.keySet()) {
			System.out.println(k);
		}
		for(String v : hm.values()) {
			System.out.println(v);
		}
		for(Entry<String, String> es : hm.entrySet()) {
			System.out.println(es.getKey()+ " : " + es.getValue());
		}
		

	}

}
