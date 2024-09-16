package Wrapper_Class;

public class Long_1 {

	public static void main(String[] args) {
		
		        // b. 
		        System.out.println("Bytes used by long: " + Long.BYTES);

		        // c. 
		        System.out.println("Minimum value of long: " + Long.MIN_VALUE);
		        System.out.println("Maximum value of long: " + Long.MAX_VALUE);

		        // d. 
		        long number = 123235235223L;
		        String numberString = Long.toString(number);
		        System.out.println("Long to String: " + numberString);

		        // e.
		        String strNumber = "977652323";
		        long parsedNumber = Long.parseLong(strNumber);
		        System.out.println("String to long: " + parsedNumber);

		        // f.
		        String invalidStrNumber = "Ab12Cd3";
		        try {
		            long invalidParsedNumber = Long.parseLong(invalidStrNumber);
		            System.out.println("Parsed invalid string to long: " + invalidParsedNumber);
		        } catch (NumberFormatException e) {
		            System.out.println("NumberFormatException for input \"" + invalidStrNumber + "\": " + e.getMessage());
		        }

		        // g.
		        long wrapperNumber = 54321L;
		        Long wrapperLong = Long.valueOf(wrapperNumber);
		        System.out.println("Wrapper Long from long: " + wrapperLong);

		        // h. 
		        String strWrapperNumber = "123456";
		        Long wrapperLongFromString = Long.valueOf(strWrapperNumber);
		        System.out.println("Wrapper Long from String: " + wrapperLongFromString);

		        // i. 
		        long num1 = 1123L;
		        long num2 = 9845L;
		        long sum = Long.sum(num1, num2);
		        System.out.println("Sum of " + num1 + " and " + num2 + ": " + sum);

		        // j.
		        long num3 = 1122L;
		        long num4 = 5566L;
		        long min = Long.min(num3, num4);
		        long max = Long.max(num3, num4);
		        System.out.println("Minimum of " + num3 + " and " + num4 + ": " + min);
		        System.out.println("Maximum of " + num3 + " and " + num4 + ": " + max);

		        // k.
		        long value = 7L;
		        String binaryString = Long.toBinaryString(value);
		        String octalString = Long.toOctalString(value);
		        String hexString = Long.toHexString(value);
		        System.out.println("Binary representation of " + value + ": " + binaryString);
		        System.out.println("Octal representation of " + value + ": " + octalString);
		        System.out.println("Hexadecimal representation of " + value + ": " + hexString);

		        // l.
		        int intValue = (int) number;
		        float floatValue = (float) number;
		        double doubleValue = (double) number;
		        short shortValue = (short) number;
		        System.out.println("Long to int: " + intValue);
		        System.out.println("Long to float: " + floatValue);
		        System.out.println("Long to double: " + doubleValue);
		        System.out.println("Long to short: " + shortValue);
		


	}

}
