package Wrapper_Class;

public class Default_Val_Primitive {

	int intVar;
	double doubleVar;
	char charVar;
	boolean boolVar;
	float floatVar;
	long longVar;
	byte byteVar;
	short shortVar;

	static int staticIntVar;
	static double staticDoubleVar;
	static char staticCharVar;
	static boolean staticBoolVar;
	static float staticFloatVar;
	static long staticLongVar;
	static byte staticByteVar;
	static short staticShortVar;

	public static void main(String[] args) {

		Default_Val_Primitive obj = new Default_Val_Primitive();
		System.out.println("Default values of instance variables:");
		System.out.println("int: " + obj.intVar);
		System.out.println("double: " + obj.doubleVar);
		System.out.println("char: [" + obj.charVar + "] (empty char is displayed as a blank space)");
		System.out.println("boolean: " + obj.boolVar);
		System.out.println("float: " + obj.floatVar);
		System.out.println("long: " + obj.longVar);
		System.out.println("byte: " + obj.byteVar);
		System.out.println("short: " + obj.shortVar);

		System.out.println("Default values of static variables:");
		System.out.println("static int: " + staticIntVar);
		System.out.println("static double: " + staticDoubleVar);
		System.out.println("static char: [" + staticCharVar + "] (empty char is displayed as a blank space)");
		System.out.println("static boolean: " + staticBoolVar);
		System.out.println("static float: " + staticFloatVar);
		System.out.println("static long: " + staticLongVar);
		System.out.println("static byte: " + staticByteVar);
		System.out.println("static short: " + staticShortVar);

	}

}
