package programs.test;

public class ThreeDay {

	public static void main(String[] args) {
		String st = "Aitbvvatye";
		String a = st.toLowerCase();
		for(int i =0; i<a.length(); i++) {
			char x = a.charAt(i);
			if(x == 'a' || x == 'e' || x == 'i') {
				System.out.println(x);
			}
		}

	}

}
