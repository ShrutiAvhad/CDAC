import java.util.Scanner;

public class PositiveNegative {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int a;
		
		System.out.println("Enter numbers : ");
		
		a = s.nextInt();
		
		if(a > 0)
		{
			System.out.println(a +" Is Positive");
		}
		else
		{
			System.out.println(a +" Is Negative");
		}
		s.close();
	}
}
