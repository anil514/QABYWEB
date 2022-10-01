package programs.test;

public class One {

	public static void main(String[] args) {
		String s = "Anil";
		String s1 = new String(s);
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
		System.out.println("*******************");
		String s2 = s1;
		System.out.println(s == s2);
		System.out.println(s.equals(s2));
		String s3 = new String(s); 
		System.out.println(s1 == s2);
		System.out.println(s3.equals(s2));
		System.out.println("*******************");
		String a = "Anil";
		System.out.println(s == a);

	}

}
