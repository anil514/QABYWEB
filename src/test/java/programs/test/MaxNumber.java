package programs.test;

public class MaxNumber {
	
	public int Max(int a, int b, int c) {
		if(a>b && a>c) {
			return a;
		}else if(b>c && b>a) {
			return b;
		}else {
			return c;
		}
	}

	public static void main(String[] args) {
		int a = 60;
		int b = 70;
		int c = 80;
		if(a>b && a>c) {
			System.out.println(a);
		}else if(b>c && b>a){
			System.out.println(b);
		}
		else if(c>a && c>b) {
			System.out.println(c);
		}
		System.out.println("----*******------");
		MaxNumber m = new MaxNumber();
		System.out.println(m.Max(10, 20, 30));
		
	}

}
