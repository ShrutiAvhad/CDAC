package classwork;
import java.util.Scanner;
public class AvgArray {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int arr[] = new int[10];
				
		System.out.println("Enter numbers : ");
		
		for(int i=0; i<10; i++) 
		{
			arr[i]=s.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<10;i++)
		{
			sum += arr[i];
		}
		
		double Avg = (double)sum/10;
		
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+Avg);
		s.close();
	}
}
