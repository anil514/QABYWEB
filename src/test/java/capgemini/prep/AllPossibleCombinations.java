package capgemini.prep;

public class AllPossibleCombinations {

	public static void main(String[] args) {
		int[] input = { 1, 4, 3 };
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				for (int z = 0; z < 3; z++) {
					if (x != y && y != z && z != x) {
						System.out.println(input[x] + "" + input[y] + "" + input[z]);
					}
				}
			}
		}
		
		String s = "123AM256CD";
		System.out.println(s.replaceAll("[^A-z]", ""));
		
		String[] chr = s.split("[^A-z]"); 
		for(String c : chr) {
			System.out.println(c.trim());
		}

	}

}
