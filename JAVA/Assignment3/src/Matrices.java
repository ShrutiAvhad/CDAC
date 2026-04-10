import java.util.Scanner;

public class Matrices {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int A[][] = new int [3][3];
		int B[][] = new int [3][3];
		int C[][] = new int [3][3];
		
		System.out.println("Enter Elements for Matrix A : ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				A[i][j] =s.nextInt();
			}
		}
		
		System.out.println("Enter Elements for Matrix B : ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				B[i][j] =s.nextInt();
			}
		}
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				C[i][j]=0;
				for(int k=0; k<3; k++) 
				{ 
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		
		System.out.println("Result : ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
}
