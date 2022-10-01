package programs.test;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 1234;
		int r=0;
		while(n!=0) {
			int rem = n % 10;   // 1234 % 10 = 4
			r = r * 10 + rem;   // 4 = 0 * 10 + 4 ==>4
			n = n/10;           // 123 = 1234/10
		}
		System.out.println(r);

	}

}
