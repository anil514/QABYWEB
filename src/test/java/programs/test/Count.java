package programs.test;

import java.util.ArrayList;

public class Count {
	Count(){
		
	}
	public void tt() {
		
	}

	public static void main(String[] args) {
		String s = "Spring is beautiful but so is winter";
		int count =0;
		String[] word = s.split(" ");
		ArrayList<String> al = new ArrayList<String>();
		for(int i =0; i<word.length; i++) {
			String dif = word[i].toString();
			al.add(dif);
			//System.out.println(dif);	
			
		}
		//System.out.println(count);
		System.out.println(al);	

	}

}
