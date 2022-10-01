package programs.test;

public class Large {

	public static void main(String[] args) {
		int a[]={1,2,5,8,8,2};  
		int temp =0;
		for(int i =0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		
		System.out.println(temp);

	}

}
