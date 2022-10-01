package programs.test;

import java.util.ArrayList;

public class ArrayListColours {
	public static String searchList(String phone) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("iPhone");
		al1.add("iPad");
		al1.add("Samsung");
		al1.add("Mi");
		al1.add("oppo");
		for(String oj : al1) {
			if(al1.contains(phone)) {
				System.out.println(phone+" found");
				return phone;
			}else {
				System.out.println("no match found...");
				return phone;
			}
		}
		//return al1;
		return phone;
	}

	public static void main(String[] args) {
		searchList("iPad");
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("red");
		al.add("blue");
		al.add("black");
		for(String s:al) {
			System.out.println(s.toString());
		}
		System.out.println("----******-----");
		
		for(int i =0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("----******-----");
		
		//insert first and last position
		System.out.println("Size of list:- "+al.size());
		al.add(0, "pink");
		al.add(4, "white");
		System.out.println("After adding, Size of list:- "+al.size());
		
		//retrieve element
		System.out.println("retrieve element:- "+al.get(3));
		
		//update element
		System.out.println("update element:- "+al.set(3, "midnight blue"));
		System.out.println("After updating, retrieve element:- "+al.get(3));
		
		//remove third element
		System.out.println("----*Before Removing*-----");
		for(int i =0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("remove third element:- "+al.remove(2));
		System.out.println("After removing, retrieve element:- "+al.get(3));
		System.out.println("----*After Removing*-----");
		for(int i =0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		//Search element
		System.out.println("----*Search Element*-----");
		for(int i =0; i<al.size(); i++) {
			if(al.contains("red")) {
				System.out.println("Print Red");
				break;
			}else {
				System.out.println("not found");
			}
			//System.out.println(al.get(i));
		}

	}

}
