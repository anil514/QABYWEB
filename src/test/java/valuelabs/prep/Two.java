package valuelabs.prep;

import java.util.HashSet;

public class Two {

	public static void main(String[] args) {
		int N = 15958;
		String temp = "";
		String s = Integer.toString(N);
		//System.out.println(s);
		String[] st = s.split("");
		for (int i = 0; i < st.length; i++) {
			for (int j = i + 1; j < st.length; j++) {
				if (st[j].equals(st[i])) {
					System.out.print(st[i]);
				}
				

			}

		}
		HashSet<String> hm = new HashSet<>();
		for(String ab : st) {
			if(hm.add(ab) == true) {
				System.out.println("dub:" +ab);
			}
		}

	}

}
