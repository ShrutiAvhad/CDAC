package Assignment3;
import java.util.Scanner;
public class JaggedArray {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int arr[][] = new int[2][];
		
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
		
		System.out.println("Array elements : ");
		for(int i[]:arr)
		{
			for(int j:i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
