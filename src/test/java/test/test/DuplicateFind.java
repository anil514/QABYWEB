package test.test;

import java.util.LinkedHashSet;

public class DuplicateFind {
	
	public static void removeStringDup() {
		String s = "ANANITA";
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for(int i =0; i<s.length(); i++) {
			hs.add(s.charAt(i));
		}
		for(char c : hs) {
			System.out.print(c);
		}
	}
	
	public static void stringDupCount() {
		String s = "ANANITA";
		int count =0; 
		String[] st = s.split("");
		for(int i =0; i<st.length; i++) {
			for(int j = i+1; j<st.length; j++) {
				if(st[i].equals(st[j])) {
					System.out.println(st[j]);
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void ArrayDup() {
		  int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};   
		 for(int i = 0; i < arr.length; i++) {  
		        for(int j = i + 1; j < arr.length; j++) {  
		            if(arr[i] == arr[j])  
		            	System.out.println(arr[j]);  
		        }  
		    }  
	}
	
	
	
	

	public static void main(String[] args) {
		removeStringDup();
		stringDupCount();
		ArrayDup();

	}

}
