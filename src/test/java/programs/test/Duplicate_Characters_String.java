package programs.test;
import java.util.HashMap;
import java.util.Set;

public class Duplicate_Characters_String {

	public static void main(String[] args) {
		String s = "ANIAILE";
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(Character c : ch) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}else {
				hm.put(c, 1);		
			}
				
		}
		System.out.println(hm);
		Set<Character>keys = hm.keySet();
		for(char c : keys) {
			if(hm.get(c)>1) {
				System.out.println(c + " : "+hm.get(c));
			}else {
				System.out.println(c + " : " + hm.get(c));
			}
		}
		//System.out.println(keys);
	}

}
