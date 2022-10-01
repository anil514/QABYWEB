package capgemini.prep;

public class A_IN_ArraySecondLargeNumber {

	public static void main(String[] args) {
		int a[] = { 22, 34, 1, 4, 5, 8 };
		int total = a.length;
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
			//System.out.println(a[i]);
		}
		System.out.println(a[total - 2]);
	}

}
