package programs.test;

import java.util.Scanner;

public class Vote {
	public static boolean Eligible(int age) {
		if(age>=18) {
			System.out.println("Vote eligible");
			return true;
		}else {
			System.out.println("Not eligible");
			return false;
		}
	}

	public static void main(String[] args) {
		Eligible(16);
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(input>18 || input == 18) {
			System.out.println("Vote eligible");
		}else {
			System.out.println("Not eligible");
		}
		

	}

}
