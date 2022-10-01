package programs.test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int i = sc.nextInt();
		  int i = 3;
		  if(i%2 != 0) {
			  System.out.println("odd");
		  }else {
			  System.out.println("even");
		  }
		  
		  String s = "ABCD572838*^$$$gy44";
		 String[] spe =  s.split("\\w");  //print non word charcter
		 for(String ch : spe) {
			System.out.println(ch.trim());
		 }
		// String s = "ABCD572838*^$$$gy44";
		 String[] spe1 =  s.split("\\d");  //print non decimial charcter
		 for(String ch1 : spe1) {
				System.out.println(ch1.trim());
			 }

	}

}
