package Wrapper_Class;

public class Double_1 {

	public static void main(String[] args) {
	
		        // b
		        System.out.println("Bytes used by double: " + Double.BYTES);

		        // c
		        System.out.println("Minimum value of double: " + Double.MIN_VALUE);
		        System.out.println("Maximum value of double: " + Double.MAX_VALUE);

		        // d
		        double number = 123.456;
		        String numberString = Double.toString(number);
		        System.out.println("Double to String: " + numberString);

		        // e
		        String strNumber = "987.654";
		        double parsedNumber = Double.parseDouble(strNumber);
		        System.out.println("String to double: " + parsedNumber);

		        // f
		        String invalidStrNumber = "Ab12Cd3";
		        try {
		            double invalidParsedNumber = Double.parseDouble(invalidStrNumber);
		            System.out.println("Parsed invalid string to double: " + invalidParsedNumber);
		        } catch (NumberFormatException e) {
		            System.out.println("NumberFormatException for input \"" + invalidStrNumber + "\": " + e.getMessage());
		        }

		        // g
		        double wrapperNumber = 543.21;
		        Double wrapperDouble = Double.valueOf(wrapperNumber);
		        System.out.println("Wrapper Double from double: " + wrapperDouble);

		        // h
		        String strWrapperNumber = "123.456";
		        Double wrapperDoubleFromString = Double.valueOf(strWrapperNumber);
		        System.out.println("Wrapper Double from String: " + wrapperDoubleFromString);

		        // i
		        double num1 = 112.3;
		        double num2 = 984.5;
		        double sum = Double.sum(num1, num2);
		        System.out.println("Sum of " + num1 + " and " + num2 + ": " + sum);

		        // j
		        double num3 = 112.2;
		        double num4 = 556.6;
		        double min = Double.min(num3, num4);
		        double max = Double.max(num3, num4);
		        System.out.println("Minimum of " + num3 + " and " + num4 + ": " + min);
		        System.out.println("Maximum of " + num3 + " and " + num4 + ": " + max);

		        // k
		        double negativeValue = -25.0;
		        double sqrtValue = Math.sqrt(negativeValue);
		        System.out.println("Square root of " + negativeValue + ": " + sqrtValue); // Expected NaN for negative numbers

		        // l
		        double zero1 = 0.0;
		        double zero2 = 0.0;
		        double divisionResult = zero1 / zero2;
		        System.out.println("0.0 divided by 0.0: " + divisionResult); // Should print NaN

		        // m
		        int intValue = (int) number;
		        float floatValue = (float) number;
		        long longValue = (long) number;
		        short shortValue = (short) number;
		        System.out.println("Double to int: " + intValue);
		        System.out.println("Double to float: " + floatValue);
		        System.out.println("Double to long: " + longValue);
		        System.out.println("Double to short: " + shortValue);
	

	}

}
