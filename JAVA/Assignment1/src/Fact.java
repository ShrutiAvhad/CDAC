import java.util.Scanner;

public class Fact {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int n;
		System.out.println("Enter number : ");
		
		n = s.nextInt();
		int fact = 1;
		
		for(int i=1; i<=n; i++)
		{
			fact *= i;
		}
		System.out.println("Factorial :"+fact);
		
		s.close();
	}
	
}

