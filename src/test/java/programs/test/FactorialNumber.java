package programs.test;

public class FactorialNumber {
	public int factorialNumber(int num) {
		int fact = 1;
		for(int i =1; i<=num;i++) {
			fact = fact * i;
		}
		System.out.println(fact);
		return fact;		
	}

	public static void main(String[] args) {
		FactorialNumber fn = new FactorialNumber();
		fn.factorialNumber(3);
		
		
		int number = 5;
		int fact1 =1;
		for(int i =1; i<=number; i++) {
			fact1 = fact1 *i;
		}
		System.out.println(fact1);

	}

}
