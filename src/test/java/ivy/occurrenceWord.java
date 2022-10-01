package ivy;

public class occurrenceWord {

	public static void main(String[] args) {
		String s = "anil the anil";
		String[] str = s.split(" ");
		for(int i =0; i<str.length; i++) {
			//String word = 
			for(int j = i+1; j<str.length; j++) {
				if(str[j].equals(str[i])) {
					System.out.println(str[j]);
				}
			}
		}

	}

}
