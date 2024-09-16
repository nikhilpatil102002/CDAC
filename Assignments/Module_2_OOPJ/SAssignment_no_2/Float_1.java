package Wrapper_Class;
import java.lang.Float;
public class Float_1 {

	public static void main(String[] args) {
		
		        // b
		        System.out.println("Bytes used by float: " + Float.BYTES);

		        // c
		        System.out.println("Minimum value of float: " + Float.MIN_VALUE);
		        System.out.println("Maximum value of float: " + Float.MAX_VALUE);

		        // d
		        float number = 123.45f;
		        String numberString = Float.toString(number);
		        System.out.println("Float to String: " + numberString);

		        // e
		        String strNumber = "987.65";
		        float parsedNumber = Float.parseFloat(strNumber);
		        System.out.println("String to float: " + parsedNumber);

		        // f
		        String invalidStrNumber = "Ab12Cd3";
		        try {
		            float invalidParsedNumber = Float.parseFloat(invalidStrNumber);
		            System.out.println("Parsed invalid string to float: " + invalidParsedNumber);
		        } catch (NumberFormatException e) {
		            System.out.println("NumberFormatException for input \"" + invalidStrNumber + "\": " + e.getMessage());
		        }

		        // g
		        float wrapperNumber = 323.23f;
		        Float wrapperFloat = Float.valueOf(wrapperNumber);
		        System.out.println("Wrapper Float from float: " + wrapperFloat);

		        // h
		        String strWrapperNumber = "782.55";
		        Float wrapperFloatFromString = Float.valueOf(strWrapperNumber);
		        System.out.println("Wrapper Float from String: " + wrapperFloatFromString);

		        // i
		        float num1 = 452.3f;
		        float num2 = 144.5f;
		        float sum = Float.sum(num1, num2);
		        System.out.println("Sum of "+num1+" and " +num2+ ": "+sum);

		        // j
		        float num3 = 112.2f;
		        float num4 = 556.6f;
		        float min = Float.min(num3, num4);
		        float max = Float.max(num3, num4);
		        System.out.println("Minimum of "+num3+" and " +num4+": " +min);
		        System.out.println("Maximum of "+num3+" and " +num4+": " +max);

		        // k
		        float negativeValue = -23.0f;
		        double sqrtValue = Math.sqrt(negativeValue);
		        System.out.println("Square root of " + negativeValue + ": " + sqrtValue);

		        // l
		        float zero1 = 0.0f;
		        float zero2 = 0.0f;
		        float divisionResult = zero1 / zero2;
		        System.out.println("0.0f divided by 0.0f: " + divisionResult);

		        // m
		        int intValue = (int) number;
		        long longValue = (long) number;
		        double doubleValue = (double) number;
		        short shortValue = (short) number;
		        System.out.println("Float to int: " + intValue);
		        System.out.println("Float to long: " + longValue);
		        System.out.println("Float to double: " + doubleValue);
		        System.out.println("Float to short: " + shortValue);
		

	}

}
