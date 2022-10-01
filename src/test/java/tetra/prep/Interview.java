package tetra.prep;

public class Interview {

	public static void main(String[] args) {
		int number = 110101; 
		String temp = Integer.toString(number);
		int[] numbers = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
		    numbers[i] = temp.charAt(i) - '0';
		}

	}

}
