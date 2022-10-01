package programs.test;

public class A {
 A(){
	 System.out.println("A Class Const");
 }
 
 public static void main(String[] args) {
	 System.out.println("Test");
	 String a = "java";
	 int count = 0;
	String[] a1 = a.split("");
	System.out.println(a1);
	for(int i =0; i<a1.length; i++) {
		for(int j =i+1; j<a1.length; j++) {
			if(a1[i].equalsIgnoreCase(a1[j])) {
				count++;
				System.out.println(a1[i]);
			}
		}
	}
	System.out.println(count);
 }
}
