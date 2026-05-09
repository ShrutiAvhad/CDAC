package Recursion;

public class RecursionDemo1 {
	
	private static void display(int[] arr, int i) {
		
		if(i > 9)
			return;
		display(arr, i + 1);
		System.out.println(arr[i]);
	}
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		display(arr,0);
	}

	
}
