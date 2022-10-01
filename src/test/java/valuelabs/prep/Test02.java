package valuelabs.prep;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int i = 123;
		int rev = 0;
		while (i > 0) {
			int rem = i % 10;
			rev = rev * 10 + rem;
			i = i / 10;
		}
		System.out.println(rev);
		System.out.println("_______******************______");
		
		String s = "Anil";
		String re = "";
		
		for(int j = s.length()-1; j>=0; j--) {
			re = re + s.charAt(j);
		}
		System.out.println(re);
		System.out.println("_______******************______");
		
		String str1 = "Race";
	    String str2 = "Care";
	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();
	    
	 // check if length is same
	    if(str1.length() == str2.length()) {
	    	 // convert strings to char array
	    	char[] ch1 = str1.toCharArray();
	    	char[] ch2 = str2.toCharArray();
	    	
	    	// sort the char array
	    	Arrays.sort(ch1);
	    	Arrays.sort(ch2);
	    	
	    	 // if sorted char arrays are same
	        // then the string is anagram
	    	boolean result = Arrays.equals(ch1, ch2);
	    	if(result) {
	    		System.out.println("Anagram");
	    	}else {
		    	System.out.println("Not Anagram");
		    }
	    	
	    }else {
	    	System.out.println("Not Anagram");
	    }
		
	}

}
