package capgemini.prep;

public class A_IN_MiddleChar {

	public static void main(String[] args) {
		String str = "Capgemini";
		int l = str.length();
		//int length;
		char ch;
		if (l % 2 == 0) {
			ch = str.charAt(l / 2 - 1);
			//length = 2;
			//System.out.println(str.substring(l/2,l/2+length));
		} else {
			ch = str.charAt(l / 2);
			//length = 1;
			//System.out.println(str.substring(l/2,l/2+length));
		}
		System.out.println(ch);
	}

}
