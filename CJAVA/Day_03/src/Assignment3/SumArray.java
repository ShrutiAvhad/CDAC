package Assignment3;
import java.util.Scanner;
public class SumArray {
	public static void main(String[] args)
	{
Scanner s = new Scanner(System.in);
		
		int arr[][] = new int[5][];
		
		System.out.println("Enter Array Element : ");
		
		
		for(int i=0; i< arr.length; i++)
		{
			System.out.println("Enter columns for rows "+i+": ");
			int c = s.nextInt();
			arr[i] = new int [c];
			
			for(int j=0; j< arr[i].length; j++)
			{
				System.out.println("Enter "+(j+i)+" elements ");
				arr[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Sum of Array elements : ");
		int sum = 0;
		for(int i=0; i< arr.length; i++)
		{			
			for(int j=0; j< arr[i].length; j++)
			{
				 sum+=arr[i][j];
			}
		}
			
			System.out.println(sum);
		}
	}
