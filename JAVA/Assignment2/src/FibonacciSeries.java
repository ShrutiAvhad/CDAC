import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = s.nextInt();
		
		int a = 0;
		int b = 1;
		
		System.out.println("Fibonacci Series : ");
		
		for(int i=1; i<=n; i++)
		{
			System.out.println(" "+a);
			int next = a + b;
			a = b;
			b = next;	
		}
		s.close();
		
	}
}
