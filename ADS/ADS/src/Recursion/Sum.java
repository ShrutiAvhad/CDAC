
package Recursion;

public class Sum {
	
	static int sum(int[] arr, int i) {
		
		if(i > 9)
			return 0;
		
		System.out.println(arr[i]);
		return arr[i] + sum(arr, i + 1);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Sum = "+ sum(arr,0));
	}

}
