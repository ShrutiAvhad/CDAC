import java.util.Scanner;
public class Even {	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num;
		System.out.println("Enter number :");
		num = s.nextInt();
		
		if( num%2 == 0 )
		{
			System.out.println(num +" is Even");
		}
		else
		{
			System.out.println(num +" is Odd");
		}
		s.close();
	}

}
