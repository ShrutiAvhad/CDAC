import java.util.Scanner;
public class Table {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		int n;
		int mul;
		System.out.println("Enter number : ");
		
		n = s.nextInt();
		
		for(int i=1; i <= 10; i++)
		{
			mul = n*i;
			System.out.println(mul);
		}
		
		s.close();
	}

}
