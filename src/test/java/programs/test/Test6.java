package programs.test;

public class Test6 {

	public static void main(String[] args) {
		String s = "Anila";
		String rev ="";
		for(int i = s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
		String[] a = s.split("");
		int count = 0;
		for(int i =0; i<s.length(); i++) {
			for(int j = i+1; j <s.length(); j++) {
				if(a[i].equalsIgnoreCase(a[j])) {
					count++;
					System.out.println(a[i]);
				}
			}		
		}
		System.out.println(count);
	}

}
