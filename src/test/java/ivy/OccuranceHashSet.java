package ivy;

import java.util.LinkedHashSet;

public class OccuranceHashSet {

	public static void main(String[] args) {
		String s = "Aniill";
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for(int i =0; i<s.length(); i++) {
			hs.add(s.charAt(i));
		}
		System.out.println(hs);
		for(char c : hs) {
			System.out.print(c);
		}

	}

}
