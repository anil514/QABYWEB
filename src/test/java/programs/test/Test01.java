package programs.test;
import java.util.HashMap;

public class Test01 {

	public static void main(String[] args) {
		String s = "I AM ANIL";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(Character c : s.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
			
		}
		System.out.println(hm);
		for (Character key : hm.keySet()) {
	        System.out.println(key + ":" + hm.get(key));
	    }

	}

}
