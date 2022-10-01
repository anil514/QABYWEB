package programs.test;

import java.util.ArrayList;

public class ReverseElements {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		System.out.println(al.subList(0, 2));
		for(int i=al.size()-1; i>=0; i--) {
			System.out.println(al.get(i));
		}

	}

}
