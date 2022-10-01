package capgemini.prep;

public class StringPro {

	public static void main(String[] args) {
		String s = "Ind12ia45";
		String[] c = s.split("[^A-z]");
		String word = "";
		String[] n = s.split("[^0-9]");
		String no = "";
		//System.out.println(c.length);
		for(String a : c) {
			word = word + a.trim();
			//System.out.println(a.trim());
		}
		System.out.println(word);
		for(String b : n) {
			no = no + b.trim();
		}
		System.out.println(no);
		System.out.println(word +"my"+ no);

	}

}
