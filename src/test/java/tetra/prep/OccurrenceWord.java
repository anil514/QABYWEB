package tetra.prep;

import java.util.HashMap;
import java.util.HashSet;

public class OccurrenceWord {

	public static void main(String[] args) {
		String s = "the anil is the man";
		String[] st = s.split(" ");
		HashSet<String> set = new HashSet<String>();
		for(String se : st) {
			set.add(se);
		}
		System.out.println(set);
		
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(String w : st) {
			if(hm.containsKey(w)) {
				hm.put(w, hm.get(w)+1);
			}else {
				hm.put(w, 1);
			}
		}
		System.out.println(hm);

	}

}
