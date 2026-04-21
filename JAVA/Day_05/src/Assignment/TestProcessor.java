package Assignment;

import java.util.Scanner;

public class TestProcessor {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		 System.out.println(" Enter your choice :  ");
		 System.out.println("1.Factorial :  ");
		 System.out.println("2.Circle  :  ");

		 int ch = s.nextInt();
		 
		 System.out.println("Enter value : ");
		 int val = s.nextInt();
		 
		 Processor p = null;
		 
		 switch(ch)
		 {
			 
			 case 1 : 
				 p = new Factorial(val);
				 break;
				 
			 case 2:
				 p = new Circle(val);
				 break;
				 
			 case 3:
				 System.out.println("Exit");
				 System.exit(0);
				 
			default:
				System.out.println("Invalid choice");
				return;
		}
		 
		 p.showData();
		 p.Process();
	}
}
