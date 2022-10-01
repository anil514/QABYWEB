package capgemini.prep;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2)); //true
		StringBuffer sb1 = new StringBuffer(s1); 
		System.out.println(s1.equals(sb1)); //false
		String s3 = "abc"; 
		s3.intern(); 
		System.out.println(s1 ==s3); //false
		System.out.println(s1.equals(s3)); //true
		
	}

}
