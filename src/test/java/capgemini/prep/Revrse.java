package capgemini.prep;

import java.util.ArrayList;

public class Revrse {

	public static void main(String[] args) {
		int num = 234;
		int rev = 0;
		while(num>0) {
			int rem = num%10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		System.out.println(rev);
		
		
		String s = "Anil";
		//String[] a = s.split("");
		//int f = a.length;
		String r = "";
		for(int i = s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			r = r + c;
		}
		System.out.println(r);
		
		ArrayList al = new ArrayList();
		al.size();

	}

}
