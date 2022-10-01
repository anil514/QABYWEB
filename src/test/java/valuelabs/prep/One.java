package valuelabs.prep;

public class One {

	public static void main(String[] args) {
		String s = "ab?cd?";
		for(int i = 100; i<=122; i++) {
			   char c = (char) i;
			  // System.out.println(c);
			   String st = s.replace('?', c);
			//s= s.replaceAll("[^[A-z][0-9]]", );
			   System.out.println(st);
		}
		
		

	}

}
