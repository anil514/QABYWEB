package programs.test;

public class ReverseString {

	public static void main(String[] args) {
		String s ="Anil";
		//char[] c  = s.toCharArray();
		String rev = "";
		//StringBuffer sb = new StringBuffer(s);
		//System.out.println(sb.reverse());
		
		for(int i = s.length()-1; i>=0; i--) {
			//char ch = c[i];
			rev = rev + s.charAt(i);
			
		}
		System.out.println(rev);
	}

}
