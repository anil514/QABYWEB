package programs.test;

import java.util.HashMap;
import java.util.HashSet;

public class Test5 {

	public static void main(String[] args) {
		int i = 151;
		int rev =0;
		int temp = i;
		while(i>0) {
			int rem = i %10;  //1
			rev = rev * 10 + rem; //1
			i = i/10;
		}
		System.out.println(rev);
		if(rev == temp) {
			System.out.println("pali");
		}else {
			System.out.println("not pali");
		}
		
		String s = "Aniil";
		char[] ch = s.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
			for(char x : set) {
				
			}
			HashMap hm = new HashMap();
			hm.put(1, "One");
			
		

	}

}
