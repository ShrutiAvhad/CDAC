import java.util.Scanner;
public class Percentage {
	public static void main(String args[])
	{
	
		Scanner s = new Scanner(System.in);
		
		int A,B,C,D,E;
		
		System.out.println("Enter 5 numbers: ");
		
		 A = s.nextInt();
		 B = s.nextInt();
		 C = s.nextInt();
		 D = s.nextInt();
		 E = s.nextInt();
		
		int Add = A + B + C + D + E;
	
		
		double Per = ((double) Add/500)*100;
		System.out.println(Per);
	}
}
