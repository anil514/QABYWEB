package capgemini.prep;

import java.util.LinkedHashSet;

public class A_IN_RemoveDupString {

	public static void main(String[] args) {
		String s = "ANNAIA";
		//String[] a = s.split("");
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		 for(int i=0;i<s.length();i++)   {
	            hs.add(s.charAt(i)); 
		 }
		 
		 for(Character ca : hs) {
			 System.out.println(ca);
		 }

	}

}
