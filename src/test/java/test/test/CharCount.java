package test.test;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class CharCount {

	public static void main(String[] args) {
		String s = "I love India";
		s = s.toLowerCase();
		String[] st = s.split(" ");
		int count = 0;
		LinkedHashSet<Character> ls = new LinkedHashSet<Character>();
		for(String w : st) {
			char[] c = w.toCharArray();
			for(int i =0; i<c.length; i++) {
				char c1 = w.charAt(i);
				ls.add(c1);
				//System.out.println(w.charAt(i));
				//System.out.println(count++);
			}
		}
		System.out.println(ls.size());
		for(char c : ls) {
			System.out.print(c);
		}
		
		String a = "Bob i am in Allegion Ind";
		a  = a.toLowerCase();
		char[] ab = a.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(Character c : ab) {
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
		

	}

}
