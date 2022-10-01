package test.test;

public class TestOne {

	public static void main(String[] args) {
		String s = "Anil";
		String rev = "";
		for(int i = s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		int a =0; 
		int b = 1;
		int c ;
		for(int i = 2; i<=5; i++) {
			c = a+b;
			System.out.println(c);
			a = b;
			b =c;
		}
		

	}

}
