package programs.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DayTwo2 {

	public static void main(String[] args) {
		String s = "Anil";
		for(int i =s.length()-1; i>=0; i--) {
			char ch = s.charAt(i);
			System.out.print(ch);
		}
		
		System.out.println("*************************");
		
		int a = 0, b = 1, c;
		
		for(int i =0; i<=6; i++) {
			c = a+b;
			System.out.print(c+ ", ");
			 a = b;
			 b = c;
		}
		
		System.out.println("*************************");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		if(p%2 == 0) {
			System.out.println("Not Prime");
		}else {
			System.out.println("prime");
		}
		System.out.println("*************************");
		
		String ch = "This is my world";
		
		char[] c1 = ch.toCharArray();
		int count = 0;
		for(char o: c1) {
			count++;
		}
		System.out.println(count);
		
		System.out.println("*************************");
		int nn[]={1,2,5,6,3,2};  
		Arrays.sort(nn); 
		System.out.println(nn.length);
		
		int len = nn.length;
		int temp =0;
		for(int i = 0; i<nn.length; i++) {
			for(int j = i+1; j<nn.length; j++) {
				if(nn[i] > nn[j]) {
					temp = nn[i];
					nn[i] = nn[j];
					nn[j] = temp;
				}
				
			}
			
		}
		System.out.println(temp);
		HashMap hm = new HashMap();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		System.out.println(hm.get(8));
		
		String con = "Test";
		con.toUpperCase();
	}
	

}
