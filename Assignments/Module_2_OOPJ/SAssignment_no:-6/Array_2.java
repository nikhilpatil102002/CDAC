package Assignment_7;
import java.util.*;
public class Array_2 {
	public static void acceptRecord(int arr[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}	
	}
	public static void printRecord(int arr[] ){
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element Position: "+i+" =="+arr[i]);
		}
	}
	public static void main(String[] args) {
		int []arr=new int [5];
		acceptRecord(arr);
		 printRecord(arr); 
	
	}
}
