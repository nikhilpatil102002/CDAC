package Wrapper_Class;
import java.lang.Byte;
public class PrimitiveToString {

	public static void main(String[] args) {
		//byte
		byte byteVar = 8;
		String byteStr1 = Byte.toString(byteVar);
		String byteStr2 = String.valueOf(byteVar);

		System.out.println("byte to String using toString(): " + byteStr1);
		System.out.println("byte to String using valueOf(): " + byteStr2);
		
		//Short
		short shortVar = 100;
		String shortStr1 = Short.toString(shortVar);
		String shortStr2 = String.valueOf(shortVar);

		System.out.println("short to String using toString(): " + shortStr1);
		System.out.println("short to String using valueOf(): " + shortStr2);
	
		//int 
		int intVar =75;
		String intStr1 = Integer.toString(intVar);
		String intStr2 = String.valueOf(intVar);

		System.out.println("int to String using toString(): " + intStr1);
		System.out.println("int to String using valueOf(): " + intStr2);
		
		//float
		float floatVar = 2.5f;
		String floatStr1 = Float.toString(floatVar);
		String floatStr2 = String.valueOf(floatVar);

		System.out.println("float to String using toString(): " + floatStr1);
		System.out.println("float to String using valueOf(): " + floatStr2);

		//char
		
		char charVar = 'A';
		String charStr1 = Character.toString(charVar);
		String charStr2 = String.valueOf(charVar);

		System.out.println("char to String using toString(): " + charStr1);
		System.out.println("char to String using valueOf(): " + charStr2);
		
		//Boolean
		boolean boolVar = true;
		String boolStr1 = Boolean.toString(boolVar);
		String boolStr2 = String.valueOf(boolVar);

		System.out.println("boolean to String using toString(): " + boolStr1);
		System.out.println("boolean to String using valueOf(): " + boolStr2);
		
		//double 
		double doubleVar = 3.14159;
		String doubleStr1 = Double.toString(doubleVar);
		String doubleStr2 = String.valueOf(doubleVar);

		System.out.println("double to String using toString(): " + doubleStr1);
		System.out.println("double to String using valueOf(): " + doubleStr2);
		
		//long
		long longVar = 123456789L;
		String longStr1 = Long.toString(longVar);
		String longStr2 = String.valueOf(longVar);

		System.out.println("long to String using toString(): " + longStr1);
		System.out.println("long to String using valueOf(): " + longStr2);





	}

}
