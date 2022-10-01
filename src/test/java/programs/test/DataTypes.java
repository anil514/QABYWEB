package programs.test;

public class DataTypes {

	public static void main(String[] args) {
	/*Data Types:
	 * It used to store the data in memory location.
	 * syntax: DataType variableName = Value
	 * Types:
	 * 1. Primitive data types
	 *      1. Boolean type: boolean (true/false)
	 *      2. Numeric type:
	 *           1. character type: char
	 *           2. integral type:
	 *                 Integer: byte, short, int, long 
	 *                 floating-point: float, double
	 * 2. Non-Primitive data types
	 *        String, Array, Interface, Classes
	 *        
	 *     **********  Primitive data types  *************** 
	 * if you want to store numbers then use this data types: byte, short, int, long
	 * if you want to store decimal values then use this data types: float, double
	 * if you want to store a single character in the variable then use 'char' data type
	 * and the value should be closed by 'single quote'.
	 * 1. byte:
	 *         size: 1 byte = 8 bits
	 *         range: -128 to 127
	 *         byte b = 10;
	 * 2. short:
	 *         size: 2 bytes = 16 bits
	 *         range: -32768 to -32767
	 *         short s = 2345;
	 * 3. int:
	 *         size: 4 bytes = 32 bits
	 *         range: -2147483648 to 2147483647
	 *         int i = 86557;    
	 * 4. long:
	 *         size: 8 byte = 64 bits
	 *         range: -9223372036854775808 to 9223372036854775807
	 *         long l = 98786675646545L;
	 *         long l1 = 097765654453445l;
	 * 5. float:
	 *         size: 4 bytes = 32 bits
	 *         range: after. (up to 7 decimal digits)  
	 *         float f = 3.7655F;
	 *         float f1 = 7.8765f;
	 *         float f2 = (float)5.976;
	 *         float f3 = 40; (output: 30.0)
	 * 6. double:
	 *         size: 8 bytes = 64 bits
	 *         range: after. (up to 16 decimal digits)
	 *         double d = 12.866;      
	 * 7. char:
	 *         size: 2 bytes = 16 bits
	 *         range: single digit value
	 *         char c = 'A'; (A-Z, a-z)
	 *         char c1 = '4'; (0-9)
	 *         char c2 = '&';  
	 * 8. Boolean:
	 *         size: ~1 bit (Around 1 bit)
	 *         boolean flag = true;
	 *         boolean flag1 = false;
	 *         (T)rue, (F)alse not applicable.                             
	 *         		
		*/
		byte b = 10;
		System.out.println("byte:- " +b);
		short s = 2345;
		System.out.println("short:- " +s);
		int i = 234567;
		System.out.println("int:- " +i);
		long l = 2345467779L;
		System.out.println("long:- " +l);
		float f = 6556.876F;
		System.out.println("float:- " +f);
		double d = 767.89876675;
		System.out.println("double:- " +d);
		char c = 'A';
		System.out.println("char:- " +c);
		boolean flag = true;
		System.out.println("boolean:- " +flag);
		
		
	}

}
