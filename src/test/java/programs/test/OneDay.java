package programs.test;

import java.io.IOException;



public class OneDay {
	int i = 10;
	public void test() {
		
	}

	public static void main(String[] args) {
		String stg = "123AB456CD";
		String stg1 = "ABCD";
		System.out.println(stg.replaceAll("[0-9]", ""));
		System.out.println(stg.replaceAll("[^0-9]", ""));
		
		String a[] = stg1.split("");
		String rev = "";
		String st = "";
		for(int i = a.length-1; i>=0; i--) {
			 st = st + a[i];
		}
		System.out.println(st);
		
		for(int i = stg1.length()-1; i>=0; i--) {
			rev = rev+stg1.charAt(i);
	}
	
	
	}

}
 