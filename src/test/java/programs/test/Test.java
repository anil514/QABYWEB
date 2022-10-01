package programs.test;

public class Test extends Count{
	

	public static void main(String[] args) {
		
String s = "Teest";
String[] chn = s.split("");
int count =0;
for(int i =0; i<s.length(); i++) {
	char ch = s.charAt(i);
	if(ch == 'a' || ch == 'e') {
		count++;
		System.out.println("true");
	}
	
}
System.out.println(count);


	}

}
