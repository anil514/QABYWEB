package capgemini.prep;

public class A_IN_ArraySort {

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 1, 0, 1, 0, 1, 0, 1 };
		System.out.println("Array elements after sorting:");
		// sorting logic
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			// prints the sorted element of the array
			System.out.println(arr[i]);
		}
	}

}
