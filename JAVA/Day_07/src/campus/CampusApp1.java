package campus;
import java.util.Date;
import java.util.Scanner;
import campus.academics.Student;
import campus.accounts.*;

public class CampusApp1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Student [] st = new Student [4]; 
		Fees [] f = new Fees [4];
		
		System.out.println("Enter Student info : ");
		
		for(int i = 0; i<4; i++)
		{
			System.out.println("\nStudent "+(i + 1)+":");
			
			System.out.println("RollNo : ");
			int rollNo = s.nextInt();
			
			System.out.println("Name : ");
			String name = s.next();
			
			System.out.println("Age : ");
			int age = s.nextInt();
			
			System.out.println("Address : ");
			String address = s.next();
			
			System.out.println("Semester : ");
			int semester = s.nextInt();
			
			System.out.println("Branch : ");
			String branch = s.next();
			
            st[i] = new Student (name, age, address, rollNo, branch, semester);
            
            System.out.println("Enter Fees amount : ");
            int amount = s.nextInt();
            
            f[i] = new Fees(st[i], amount,new Date());
		}
		
		System.out.println("Fees Details : ");
		
		int total = 0;
		for(int i = 0; i<4; i++)
		{
			System.out.println(f[i]);
			total += f[i].getAmount();
		}
	
		System.out.println("Total salary : "+total);
		
		s.close();
	}
}
