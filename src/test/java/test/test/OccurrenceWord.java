package test.test;

public class OccurrenceWord {

	public static void main(String[] args) {
		String s = "In India in test all test";
		s = s.toLowerCase();
		String[] st = s.split(" ");
		for(int i = 0; i<st.length; i++) {
			//System.out.println(st[i]);
			for(int j = i+1; j<st.length; j++) {
				if(st[j].equals(st[i])) {
					System.out.println(st[j]);
				}
			}
		}
				

	}

}
