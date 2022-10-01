package ivy;

public class Occurance {

	public static void main(String[] args) {
		String s = "Anilil";
		char[] ch = s.toCharArray();
		for(int i =0; i<ch.length; i++) {
			for(int j = i+1; j<ch.length; j++) {
			if(ch[j] == ch[i]) {
				System.out.println(ch[j]);
			}
			
			}
			}

	}

}
