package tetra.prep;

import java.util.Scanner;

public class Palindram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//int a = 121;
		int rev =0;
		int temp = a;
		while(a != 0 ) {
			int rem = a % 10;
			rev = rev * 10 + rem;
			a = a/10;
		}
		System.out.println(rev);
		if(temp == rev) {
			System.out.println("Palindram");
		}else {
			System.out.println("not Plaindram");
		}
		

	}

}
