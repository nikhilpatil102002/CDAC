package Wrapper_Class;
import java.lang.Byte;
public class Example {
	 public static void main(String[] args) {
		        //d
		        byte num = 2;
		        String numString = Byte.toString(num);
		        System.out.println("The byte value of String is: "+numString);
		        
		        //e
		        String strNumber="10";
		        Byte num1=Byte.parseByte(strNumber);
		        System.out.println("The byte value is :"+num1);
		        
		 
		        
		        //g
		        byte num4 = 2;
		        Byte number = Byte.valueOf(num4);
		        System.out.println("The byte value of String is: "+number);
		        
		        //h
		        String strNum="2";
		        Byte string1=Byte.valueOf(strNum);
		        System.out.println("The byte value is :"+string1);
		        
		        //i
		       
		        byte byteValue = 10;
		        int intValue = byteValue;
		        System.out.println("Byte to int: " + intValue);
		            
		        //f
//		        String strNumber1="Ab12Cd3";
//		        Byte num2=Byte.parseByte(strNumber1);
//		        System.out.println("The byte value is :"+num2);
//		        
		        String str = new String("A1$b2#C3");
		        int num7 = Integer.parseInt( str );//UnBoxing: NumberFormatException
		        System.out.println( "Num1    :   "+num7);
		    }	    
	}
		



	
