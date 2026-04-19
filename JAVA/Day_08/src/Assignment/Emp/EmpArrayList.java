package Assignment.Emp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpArrayList {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<Employee> e = new ArrayList <Employee> ();
		 
		int ch;
		
		do {
			System.out.println("* Enter Employee Info *");
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Display Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Search Employee");
			System.out.println("6. Sort Employee");
			System.out.println("7. Exit");
			System.out.println("Enter your choice : ");
			
			ch = s.nextInt();
			
			switch(ch) {
			
			case 1 : 
				System.out.println("Enter Id : ");
				int id = s.nextInt();
				
				System.out.println("Enter Name : ");
				String name = s.next();
				
				System.out.println("Enter Salary : ");
				double salary = s.nextDouble();
				
				e.add(new Employee(id, name, salary));
				
				break;
				
			case 2 : 
				System.out.println("Enter Id : ");
				int uid = s.nextInt();
				
				boolean updated = false;
				for(Employee emp : e) 
				{
					if(emp.getId()==uid)
					{
						System.out.println("Enter new Name : ");
						emp.setName(s.next());
						
						System.out.println("Enter new Salary : ");
						emp.setSalary(s.nextDouble());
					}
				}
				if(!updated)
					System.out.println("Employee not found");
				
				break;
				
			case 3 :
				
				if(e.isEmpty())
				{
					System.out.println("No Employees");
				}
				else
				{
					for(Employee emp : e)
					{
						System.out.println(emp);
					}
				}
				
				break;
				
			case 4 : 
				
				System.out.println("Enter Id to delete : ");
                int did = s.nextInt();

                boolean deleted = e.removeIf(emp -> emp.getId() == did);

                if (deleted)
                {
                    System.out.println("Employee deleted");
                }
                else
                {
                    System.out.println("Employee not found");
                }
                
                break;

			case 5: 
				
                System.out.println("Enter Id to search : ");
                int sid = s.nextInt();

                boolean found = false;

                for (Employee emp : e) {
                    if (emp.getId() == sid)
                    {
                        System.out.println(emp);
                        found = true;
                        
                        break;
                    }
                }

                if (!found)
                    System.out.println("Employee not found");
                
                break;
                
			case 6:
				
				System.out.println("Enter : ");
				
			}
		
		}while(ch != 5);
	}
}	
		
		
		
		

