package tetra.prep;

public class Occurrence {

	public static void main(String[] args) {
		String s = "aniili";
		char[] ch = s.toCharArray();
		int count =0;
		for(int i =0; i<ch.length; i++) {
			//char ch = s.charAt(i);
			for(int j = i+1; j<ch.length; j++) {
				if(ch[j] == ch[i]) {
					System.out.println(ch[j]);
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
