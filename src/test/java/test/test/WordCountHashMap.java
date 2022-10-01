package test.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class WordCountHashMap {

	public static void main(String[] args) {
		String s = "In India in test all test";
		s = s.toLowerCase();
		String[] st = s.split(" ");
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		for(String w : st) {
			if(hs.containsKey(w)) {
				hs.put(w, hs.get(w)+1);
			}else {
				hs.put(s, 1);
			}
		}
		System.out.println(hs);
		Set<String>keys = hs.keySet();
		for(String c : keys) {
			if(hs.get(c)>1) {
				System.out.println(c + " : "+hs.get(c));
			}else {
				System.out.println(c + " : " + hs.get(c));
			}
		}

	}

}
