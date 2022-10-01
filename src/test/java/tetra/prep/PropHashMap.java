package tetra.prep;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class PropHashMap {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("B", "k@h.com");
		prop.setProperty("A", "k@h.com");
	    prop.setProperty("C", "R@h.com");
	    prop.setProperty("D", "S@h.com");
		
		//HashMap<String, String> hm = new HashMap<String, String>();
		HashMap<String, String> propMap = new HashMap<String, String>((Map) prop);

		for(Entry<String, String> t : propMap.entrySet()) {
			System.out.print(t.getKey() + ": ");
		      System.out.println(t.getValue());
		}

	}

}
