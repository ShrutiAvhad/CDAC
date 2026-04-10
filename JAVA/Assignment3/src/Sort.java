import java.util.Scanner;
public class Sort {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[10];
				
		System.out.println("Enter numbers : ");
		
		for(int i=0; i<10; i++) 
		{
			arr[i]=s.nextInt();
		}
		
		for(int i=0; i<arr.length - 1; i++)
		{
			for(int j = i + 1; j<arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Dedscending Order : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
}
