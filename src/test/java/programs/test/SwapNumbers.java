package programs.test;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b =20;
		 System.out.println("Before Swap-> "+a+" - "+b);
		int c = a+b; //==>c = 30
		a = c-a; //==> 30-20 = a= 20
		 b = c-a; //==> 10+10 = 20
		System.out.println("After Swap-> "+a+" - "+b);
		 

	}

}
