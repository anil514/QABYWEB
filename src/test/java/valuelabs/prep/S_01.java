package valuelabs.prep;

public class S_01 {


	public static void main(String[] args) {
		String s = "Anil'";
		s = s.replaceAll("[^A-z]", "").trim();
		System.out.println(s);

	}

}
