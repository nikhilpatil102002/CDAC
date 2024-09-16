package Wrapper_Class;
import java.lang.Integer;
public class Integer_1 {

	public static void main(String[] args) {
		
		        //b
		        System.out.println("Bytes used to represent an int: " + Integer.BYTES);

		        // c
		        System.out.println("Minimum int value: " + Integer.MIN_VALUE);
		        System.out.println("Maximum int value: " + Integer.MAX_VALUE);

		        //d
		        int number = 123;
		        String numberAsString = Integer.toString(number);
		        System.out.println("Integer as String: " + numberAsString);

		        //e
		        String strNumber = "456";
		        int parsedNumber = Integer.parseInt(strNumber);
		        System.out.println("Parsed int from String: " + parsedNumber);

		        //f
		        try {
		            String invalidStrNumber = "Ab12Cd3";
		            int invalidNumber = Integer.parseInt(invalidStrNumber);
		            System.out.println("Parsed invalid int: " + invalidNumber); // This line will not be executed
		        } catch (NumberFormatException e) {
		            System.out.println("Error: " + e.getMessage());
		        }

		        //g
		        Integer wrapperInt = Integer.valueOf(number);
		        System.out.println("Wrapper class Integer: " + wrapperInt);

		        //h
		        Integer wrapperIntFromString = Integer.valueOf(strNumber);
		        System.out.println("Wrapper class Integer from String: " + wrapperIntFromString);

		        //i
		        int num1 = 10;
		        int num2 = 20;
		        int sum = Integer.sum(num1, num2);
		        System.out.println("Sum of 10 and 20: " + sum);

		        //j
		        int min = Integer.min(num1, num2);
		        int max = Integer.max(num1, num2);
		        System.out.println("Minimum of 10 and 20: " + min);
		        System.out.println("Maximum of 10 and 20: " + max);

		        //k
		        int value = 7;
		        String binaryString = Integer.toBinaryString(value);
		        String octalString = Integer.toOctalString(value);
		        String hexString = Integer.toHexString(value);
		        System.out.println("Binary representation of 7: " + binaryString);
		        System.out.println("Octal representation of 7: " + octalString);
		        System.out.println("Hexadecimal representation of 7: " + hexString);

		        //l
		        double doubleValue = (double) number;
		        float floatValue = (float) number;
		        long longValue = (long) number;
		        byte byteValue = (byte) number;
		        short shortValue = (short) number;
		        System.out.println("Converted to double: " + doubleValue);
		        System.out.println("Converted to float: " + floatValue);
		        System.out.println("Converted to long: " + longValue);
		        System.out.println("Converted to byte: " + byteValue);
		        System.out.println("Converted to short: " + shortValue);
		    
		


	}

}
