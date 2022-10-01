package capgemini.prep;

public class A_IN_Palindrom {

	public static void main(String[] args) {
		String s = "DEED";
		String rev = "";
		for(int i = s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		if(rev.equals(s)) {
			System.out.println("Its Palindrome");
		}else {
			System.out.println("Its not Palindrome");
		}

	}

}
