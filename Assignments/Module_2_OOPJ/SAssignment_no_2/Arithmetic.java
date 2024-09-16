package Wrapper_Class;
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the first integer: ");
		        int num1 = scanner.nextInt();
		        
		        System.out.print("Enter the second integer: ");
		        int num2 = scanner.nextInt();
		        
		        System.out.print("Enter an arithmetic operator (+, -, *, /): ");
		        char operator = scanner.next().charAt(0);
		        
		        int result = 0; 
		        
		        switch (operator) {
		            case '+':
		                result = num1 + num2;
		                break;
		            case '-':
		                result = num1 - num2;
		                break;
		            case '*':
		                result = num1 * num2;
		                break;
		            case '/':
		                if (num2 != 0) {
		                    result = num1 / num2;
		                } else {
		                    System.out.println("Error: Division by zero is not allowed.");
		                    return;
		                }
		                break;
		            default:
		                System.out.println("Error: Invalid operator.");
		                return;
		        }
		        
		        System.out.println("The result is: " + result);
		
	}

}
