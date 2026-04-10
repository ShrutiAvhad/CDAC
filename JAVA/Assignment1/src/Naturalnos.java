import java.util.Scanner;
public class Naturalnos {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		int i = 1;
		int n;
		int sum = 0;
		System.out.println("Enter Number : ");
		
		n = s.nextInt();
		
		while( i <= n )
		{
			sum+=i;
			i++;
		}
		System.out.println("Sum : "+sum);
		
		s.close();

	}
}

