package programs.test;

import java.awt.image.renderable.RenderableImage;
import java.util.Random;
import java.util.Scanner;

import javax.management.remote.SubjectDelegationPermission;

public class TwoDay extends OneDay{
	TwoDay(){
		super();
		System.out.println("test");
		super.i = 10;
	}
	
	Random ren = new Random();
	int rand_int1 = ren.nextInt(1000);
	
	public void test1() {
		System.out.println("test");
		super.i = 10;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int n1 = 0, n2 = 1, n3;
		for(int j = 0; j<=10; j++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
		
		
		
		int fact = 1;
		for(int k = 1; k<= 5; k++) {
			fact = fact * k;
		}
		System.out.println(fact);
		
		try {
			
		}catch(Exception e) {
			
		}finally {
			
		}
	}

}
