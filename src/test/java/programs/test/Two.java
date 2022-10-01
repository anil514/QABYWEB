package programs.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Two {

	public static void main(String[] args) {
		String s = "BOB I AM IN ALLEGION IND";
		char[] ch = s.toCharArray() ;  
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		Set<Character>keys = map.keySet();
		for(char k : keys) {
			if(map.get(k)>1) {
				System.out.println(k + "==" +map.get(k));
			}else {
				System.out.println(k + "==" +map.get(k));
			}
		}

	}

}
