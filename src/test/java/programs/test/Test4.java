package programs.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
		String nor = "Anil";
		System.out.println(nor.toUpperCase());
		ArrayList<String> ar =  new ArrayList<String>();
		ar.add("Ani");
		ar.add("Ani1");
		ar.add("Ani");
		ar.add("Ani1");
		ar.add("Ani2");
		System.out.println(ar.toString());
		Set<String> s = new HashSet<String>(ar);
		System.out.println(s);
		for(int i=0;i<ar.size();i++){
	        for(int j=i+1;j<ar.size();j++){
	            if(ar.get(i).equals(ar.get(j))){
	                ar.remove(j);
	                j--;
	            }
	        }
	    }
	    System.out.println("After Removing duplicate:"+ar);
	    String s1="Sachin";
	    s1.concat(" Tendulkar");
	    System.out.println(s1);
	    
	

	}

}
