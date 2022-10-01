package ivy;

import java.util.HashMap;

public class OccuranceHashMap {

	public static void main(String[] args) {
		String s = "Aniill";
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(char c : ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		

	}

}
