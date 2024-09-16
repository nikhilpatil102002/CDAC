package Wrapper_Class;
import java.util.*;
public class Boolean_1 {
	public static void main(String[] args) {
	  
	  //b	
	  boolean status=true;
	  String statusString=Boolean.toString(status);
      System.out.println("String is=="+statusString);
		
      //c
      String strStatus3="true";
	  boolean br=Boolean.parseBoolean(strStatus3);
	  System.out.println("The Boolean wrapper class==" +br);
	
	  //d
	  String strStatus1="1";
	  boolean status1=strStatus1.equals("1");
	  System.out.println("The boolean status is: "+status1);
	   
	  //e
	  boolean status2=true;
	  boolean statuswrapper=Boolean.valueOf(status2);
	  System.out.println("The Boolean wrapper class=="+statuswrapper);
	   
	  //f
	  String strStatus4="true";
	  boolean br1=Boolean.parseBoolean(strStatus3);
	  System.out.println("The Boolean wrapper class==" +br);
	   
	  
	}
}
