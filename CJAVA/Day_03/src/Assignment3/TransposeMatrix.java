package Assignment3;
import java.util.Scanner;
public class TransposeMatrix {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		int arr[][] = new int[3][3];
		
		System.out.println("Enter matrix elements : ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Matrix : ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println( );
		}
		
		
		System.out.println("Transpose Matrix : ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr[j][i] + " ");
			}
			System.out.println( );
		}
		
	}
	
}
