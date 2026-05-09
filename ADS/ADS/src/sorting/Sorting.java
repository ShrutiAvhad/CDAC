package sorting;

public class Sorting {

	private static void BubbleSort(int arr[]) {
		
		int i, j, t, flag;
		
		for(i = arr.length-1; i > 0; i--)
		{
			flag = 0;
			
			for(j = 0; j < i; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] =t;
					flag = 1;
				}
			}
			if(flag == 0)
				break;
		}
	}
	
	private static void SelectionSort(int[] arr) {
		
		int i, j, min, t;
		for(i = 0; i < arr.length; i++)
		{
			min = i;
			
			for(j = i + 1; j < arr.length;j++)
			{
				if(arr[j] < arr[min])
					min = j;
			}
			
			if(min != i)
			{
				t = arr[i];
				arr[i] = arr[min];
				arr[min] = t;
			}
		}
		
	}
	
	private static void InsertionSort(int arr[]) {
		
		int i, j, k;
		
		for(i = 1; i < arr.length; i++)
		{
			k = arr[i];
			
			for(j = i-1; j >= 0 && k < arr[j]; j--)
			{
				arr[j + 1] = arr[j];
			}
			
			arr[j + 1] = k;
		}
		
	}

	public static void main(String[] args) {
		

		int arr[] = {5, 2, 9, 1, 3};
		
		
		//System.out.println("\nBubble Sort : ");

		//BubbleSort(arr);	

		System.out.println("Selection Sort : ");
		SelectionSort(arr);
		
//		System.out.println("Insertion Sort : ");
//		InsertionSort(arr2);

		for (int no : arr)
		{
			System.out.print(" "+no);
		}

	}	
}
