package tetra.prep;

import java.util.Scanner;

public class PalindramString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next().toLowerCase();
		//String s = "AAOAA";
		String rev = "";
		for(int i = s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(s)) {
			System.out.println("Palindram");
		}else {
			System.out.println("not Plaindram");
		}

	}

}
