package Assignment_7;

public class Array_3 {

	public static void main(String[] args) {
		
		int arr[]= {4,5,6,7,1,9};
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
			
		}	
		System.out.println("Max :"+max);
		System.out.println("Max :"+min);
	}
}
