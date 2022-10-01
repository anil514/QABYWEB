package programs.test;

import java.util.HashMap;

public class RevString {

	public static void main(String[] args) {
		String s = "Anil";
		String rev = "";
		for(int i = s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			rev = rev + c;
		}
		System.out.println(rev);
		
		
		String str = "pencil programmer";    
	    //Split sentence into words
	    String words[]=str.split(" ");
        String newString ="";      
        for(String w: words){
            String first = w.substring(0,1);      //First Letter
            String rest = w.substring(1);         //Rest of the letters     
            //Concatenete and reassign after 
            //converting the first letter to uppercase
            newString+=first.toUpperCase()+ rest+ " ";  
        }    
        //trim to remove the last redundant blank space
        System.out.println(newString.trim());
        
        
        String c = "Fighting";
    	char[] ch = c.toCharArray();
    	//int count =1;
    	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    	for(Character c1 : ch) {
    		if(hm.containsKey(c1)) {
    		//hm.put(c1, count++);
    			hm.put(c1, hm.get(c1)+1);
    		}else {
    			hm.put(c1, 1);
    		}   		
    	}
        System.out.println(hm);  
	}
}
