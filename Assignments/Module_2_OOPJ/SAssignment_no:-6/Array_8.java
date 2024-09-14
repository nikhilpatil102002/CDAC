package Assignment_7;
import java.util.*;

class ArrayDemo1 {
	

	int arr[] = new int[5];

	public ArrayDemo1(int size) {
		arr = new int[size];
	}
	public void getArr(int index) {
		
		 if (index >= 0 && index < arr.length) {
	            System.out.println(arr[index]);
	        } else {
	            System.out.println("Index out of bounds");        
	        }
	}
	public void printRecord() {
		for(int arr:arr) {
			System.out.println(arr);
		}
		System.out.println();
	}
	public void setArr(int index, int value) {
		
		if (index  >= 0 && index< arr.length) {
            arr[index] = value;
        } else {
            System.out.println("Index out of bounds");
        }	
	}	
}

public class Array_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayDemo1 dt1=new ArrayDemo1(5);
		System.out.println("Enter the size of an array :");
		for (int i=0;i<5;i++) {
			System.out.println(i);
			int vlaue=sc.nextInt();
			dt1.setArr(i, vlaue);
		}
		
		dt1.printRecord();
	}

}
