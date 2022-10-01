


package remove.duplicate;

import java.util.Arrays;
import java.util.HashSet;

public class IntDup {

	public static void main(String[] args) {
		int n = 1235453;
		String s = Integer.toString(n);
		char[] ch = s.toCharArray();
		//Arrays.sort(ch);
		HashSet<Character> hs = new HashSet<Character>();
		Arrays.sort(ch);
		for(char c : ch) {
			if(hs.add(c) == true) {
				System.out.print(c);
			}
		}

	}

}
