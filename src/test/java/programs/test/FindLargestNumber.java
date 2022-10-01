package programs.test;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x>y && x>z) {
			System.out.println("X large number");
		}else if(y>z && y>x) {
			System.out.println("y large number");
		}else if(z>x && z>y) {
			System.out.println("Z large number");
		}else {
			System.out.println("Duplicate number");
		}

	}

}
