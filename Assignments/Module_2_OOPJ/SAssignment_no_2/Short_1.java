package Wrapper_Class;
import java.lang.Short;
public class Short_1 {

	public static void main(String[] args) {
		//b
		Short sh=Short.BYTES;
		System.out.println("byte are use to represent short: "+sh);
		
		//c
        Short min=Short.MIN_VALUE;
        Short max=Short.MAX_VALUE;
        System.out.println("min value is: "+min);
        System.out.println("min value is: "+max);
        
        //d
        Short a=4;
        String st=Short.toString(a);
        System.out.println("String is: "+st);
        
        //e
        String strNum="abc";
        Short nl=Short.parseShort(strNum);
        System.out.println("Short value is: "+nl);
        
        //f
        String strNumber = "Ab12Cd3";
        short number = Short.parseShort(strNumber);
        System.out.println("Converted number: " + number);
        
        //g
        Short numb = 123;
        Short wrapperNumber = Short.valueOf(numb);
        System.out.println("Wrapper class Short: " + wrapperNumber);
        
        
        
        
	}

}
