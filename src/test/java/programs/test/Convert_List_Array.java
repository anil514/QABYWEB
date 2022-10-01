package programs.test;
import java.util.ArrayList;

public class Convert_List_Array {
	
	


	public static void main(String[] args) {
		String s  = "123AB456CD";
		System.out.println(s.replaceAll("[0-9]", ""));
		System.out.println(s.replaceAll("[^0-9]", ""));
	       
		ArrayList<String> list = new ArrayList<String>();
	      list.add("Apple");
	      list.add("Orange");
	      list.add("Banana");
	      System.out.println("Contents of list ::"+list);
	      String[] myArray = new String[list.size()];
	      list.toArray(myArray);
	      for(int i =0; i<myArray.length; i++) {
	    	  System.out.println(myArray[i]);
	      }
	}

}
