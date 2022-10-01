package capgemini.prep;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(1);
		li.add(3);
		li.add(2);
		li.add(5);
		li.add(9);
		li.add(7);
		System.out.println(li.size());
		System.out.println(li);
		System.out.println(li.get(4));
		Iterator<Integer> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		li.add(3, 10);
		System.out.println(li);
		li.addAll(li);
		li.addFirst(17);
		li.addLast(62);
		li.remove(3);
		li.removeAll(li);
		li.removeLast();
		li.clear();
		//reverse iterator
		Iterator itr = li.descendingIterator();
		while(itr.hasNext()) {
			itr.next();
		}
		
		Collections.sort(li);
	}

}
