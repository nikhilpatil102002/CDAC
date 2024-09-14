package Assignment_7;

import java.util.*;

public class Array_1 {

	public static void main(String[] args) {

		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element inside arr  :" + i + " Default value :" + arr[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Updated value :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("element" + arr[i]);
		}
	}

}



