package programs.test;

import java.util.Scanner;

public class PrimeNumber {
	public static void Prime(int num) {
		boolean flag = false;
		if(num %2 ==0) {
			flag = true;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean flag = false;
		for(int i =2; i<=number/2; i++) {
			//Condition for non prime
			if(number % i ==0) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Prime");
		}else {
			System.out.println("not prime");
		}

	}

}
