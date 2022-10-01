package tetra.prep;

public class ReverseWordString {

	public static void main(String[] args) {
		String s = "I am in Bangalore";
		String[] st = s.split(" ");
		String rev = "";
		for(String w : st) {
			rev = " " + w + rev;
			
		}
		System.out.println(rev.trim());

	}

}
