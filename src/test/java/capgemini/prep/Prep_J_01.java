package capgemini.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Prep_J_01 {

	public static void main(String[] args) {
		int[] i = {1,2,4,5, 3,7};
		//List<int[]> l = Arrays.asList(i);
		//System.out.println(l);
		ArrayList<Integer> al = new ArrayList<Integer>();
		//Collections.addAll(al, i);
		//System.out.println(al);
		for(Integer a : i) {
			al.add(a);
		}
		System.out.println(al);
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		
		Set<Integer> set = hm.keySet();
		ArrayList<Integer> a1 = new ArrayList<Integer>(set);
		System.out.println(a1);
		
		Collection<String> v = hm.values();
		ArrayList<String> a2 = new ArrayList<String>(v);
		System.out.println(a2);
		
		
		
		
	}

}
