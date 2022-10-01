package wipro.interview;

public class ReverseString {

	public static void main(String[] args) {
		String s = "I am in Bangalore";
		String[] w = s.split(" ");
		String rev = "";
		 for (int i = 0; i < w.length; i++) {
			 rev = " " + w[i] + rev;
	      //rev = w[i] +" "+rev ;
	    
		 }
		 System.out.println(rev.trim());
	}

}
