import java.util.*;
public class Swap {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter Numbers: ");
		a = s.nextInt();
		b = s.nextInt();
		
		System.out.println("Before: "+a +" "+b);

		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After: "+a +" "+b);
		
		s.close();
	}
}
