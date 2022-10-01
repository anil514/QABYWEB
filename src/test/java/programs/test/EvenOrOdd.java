package programs.test;

import java.util.Scanner;

public class EvenOrOdd {
	public static boolean EvenOrOdd(int num) {
		if(num%2==0) {
			System.out.println("Given number even-> " +num);
			return true;
		}else {
			System.out.println("Given number odd-> " +num);
			return false;
		}
	}

	public static void main(String[] args) {
		EvenOrOdd(99);
		
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		//int a = 6;
		if(input%2==0) {
			System.out.println("Given number even--> "+input);
		}else {
			System.out.println("Given number odd---> "+input);
		}

	}

}
