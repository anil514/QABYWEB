package programs.test;

public class Reverase {

	public static void main(String[] args) {
		int i = 1234;
		int rev =0;
		while(i!=0) {
			int r = i % 10;  //1234%10 = 4
			rev = rev * 10 + r; //  0 * 10 + 4 = 4
			i = i / 10;   // 1234/10 = 123			
		}
		System.out.println(rev);

	}

}
