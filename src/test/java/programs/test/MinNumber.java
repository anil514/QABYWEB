package programs.test;

public class MinNumber {
	public int Min(int a, int b, int c) {
		if(a<b && a<c) {
			return a;
		}else if(b<c && b<a) {
			return b;
		}else {
			return c;
		}
		
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 1;
		if(a<b && a<c) {
			System.out.println(a);
		}else if(b<c && b<a) {
			System.out.println(b);
		}else if(c<a && c<b) {
			System.out.println(c);
		}

	}

}
