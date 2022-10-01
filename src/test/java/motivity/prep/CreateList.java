package motivity.prep;

import java.util.ArrayList;

public class CreateList {

	public static void main(String[] args) {
		String s = "ANANA";
		ArrayList<Character> li = new ArrayList<Character>();
		for(int i =0; i<s.length(); i++) {
			li.add(s.charAt(i));
		}
		
		for(Character ch : li) {
			System.out.println(ch);
		}

	}

}
