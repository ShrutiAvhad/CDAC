package Assignment1;
import java.util.Scanner;
public class Addition {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		 
		int a;
		int b;
		int sum = 0;
		
		System.out.println("Enter numbers: ");
		
		a = s.nextInt();
		b = s.nextInt();
		
		sum = a + b ;
		System.out.println("Sum = "+sum);
			
		s.close();

	}
}
