package Assignment_7;
import java.util.*;
class ArrayDemo{
	int arr[]=new int [5];
	
	public ArrayDemo(int size) {
		arr=new int[size];
	}
	public void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<arr.length;i++) {
			System.out.println("Element "+i);
			arr[i]=sc.nextInt();
		}
	}
	
	public void printRecord() {
		System.out.println("Elements :");
		for (int i=0;i<arr.length;i++) {
			System.out.println("Element "+i+" :"+arr[i]);
		}
	}
}
public class Array_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		ArrayDemo ad=new ArrayDemo(size);
		ad.acceptRecord();
		ad.printRecord();
		}

}
