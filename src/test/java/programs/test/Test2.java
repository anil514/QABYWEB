package programs.test;

public class Test2 {

	public static void main(String[] args) {
		String s = "Anil Potla";
		int a = s.indexOf("Pot");
		boolean v = s.contains("P");
		System.out.println(a);
		int i =0;
		char[] ch = s.toCharArray();
		for(char c : ch) {
			//System.out.println(c);
			i++;
		}
		System.out.println(i);

	}

}
