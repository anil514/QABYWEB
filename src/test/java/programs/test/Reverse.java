package programs.test;

public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "Test";
		String rev = "";
		int len = s.length();
		for(int i = 0; i<len; i++) {
			char c = s.charAt(i);
			rev = c + rev;
		}
		System.out.println(rev);

	}

}
