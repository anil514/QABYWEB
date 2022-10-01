package programs.test;

public class SwapNumber_One {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before Swap-> "+a+" - "+b);
		a = a+b; //=> a = 30
		b = a-b; //=>b =10
		a = a-b; //=> a = 20
		System.out.println("After Swap-> "+a+" - "+b);

	}

}
