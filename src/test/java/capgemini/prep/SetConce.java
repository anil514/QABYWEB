package capgemini.prep;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetConce {

	public static void main(String[] args) {
		      String s = "ANIIAN";
		    //  String[] a = s.split("");
		      LinkedHashSet<Character> set = new LinkedHashSet<Character>();   
		      //Add each character of the string into LinkedHashSet   
		        for(int i=0;i<s.length();i++)   {
		            set.add(s.charAt(i));   	
	}     
		        // print the string after removing duplicate characters   
		        for(Character ch : set)   {
		            System.out.println(ch); 
		    }   

	}

}
