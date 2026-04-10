import java.util.Scanner;
public class Marks {
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Marks :");
	
	int marks = s.nextInt();
	
	 if( marks >= 90 )
	 {
		 System.out.println("Distinction");
	 }
	 else if((marks < 90) && (marks > 80))
	 {
		 System.out.println("First Class");
	 }
	 else if((marks < 80) && (marks > 70))
	 {
		 System.out.println("Second Class");
	 }
	 else if((marks < 70) && (marks > 60))
	 {
		 System.out.println("Third Class");
	 }
	 else
	 {
		 System.out.println("Fail");
	 }
	 s.close();
	
	}
}
