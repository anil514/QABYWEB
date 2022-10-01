package valuelabs.prep;

public class A_Int_01 {

	public static void main(String[] args) {
		String s = "Hello World";
		int count =0;
		for(int i =0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == 'l') {
				count++;
				s = s.replaceFirst("l", "" + count);			
			}				
		}
		System.out.println(s);
		System.out.println(count);
	}

}
