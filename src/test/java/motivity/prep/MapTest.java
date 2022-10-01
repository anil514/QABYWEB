 package motivity.prep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "x");
		map.put(2, "y");
		map.put(2, "z");
		map.put(3, "x");
		map.put(4, "y");
		map.put(5, "z");
		map.put(6, "x");
		map.put(7, "y");
		System.out.println("Original map: " + map);
		 // 1. Using an iterator
        Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        // 2. For-each loop
        for (Integer key: map.keySet()) {
            System.out.println(key);
        }
        

        // 5. Convert to a string
        System.out.println(map.keySet().toString());

	}

}
