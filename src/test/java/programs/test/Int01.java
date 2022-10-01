package programs.test;
import java.util.HashMap;

public class Int01 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();  //implements map interface  
		hm.put(110,"Ravi");  
		hm.put(120,"Prateek");  
		hm.put(130, "Davesh");    
		hm.put(140, "Kamal");  
		hm.put(150, "Pawan");  
		for (Integer key : hm.keySet()) {
	        System.out.println(key + ":" + hm.get(key));
	    }
	}

}
