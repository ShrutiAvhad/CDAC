package campus;
import java.util.Scanner;
import campus.academics.Faculty;


public class CampusApp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Faculty [] f = new Faculty [5];
		
		System.out.println("Enter faculty info : ");
		
		for(int i = 0; i<5; i++)
		{
			System.out.println("\nFaculty "+(i + 1)+":");
			
			System.out.println("FacultyId : ");
			int facultyId = s.nextInt();
			
			System.out.println("Name : ");
			String name = s.next();
			
			System.out.println("Age : ");
			int age = s.nextInt();
			
			System.out.println("Address : ");
			String address = s.next();
			
			System.out.println("Salary : ");
			int salary = s.nextInt();
			
			System.out.println("Branch : ");
			String branch = s.next();
			
            f[i] = new Faculty(name, age, address, facultyId, salary, branch);
		}
		
		System.out.println("Faculty Details : ");
		
		for(int i = 0; i<5; i++)
		{
			System.out.println(f[i]);
		}
		
		double total = 0;
		for(Faculty x : f)
		{
			total += x.getSalary();
		}
		System.out.println("Total salary : "+total);
		
		s.close();
	}
}
