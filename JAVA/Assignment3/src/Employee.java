
public class Employee {
	private int empId;
	private String empName;
	private Date dt_of_joining;
	
	public Employee() 
	{
		System.out.println("Default Constructor..");
	}
	
	public Employee(int id, String nm,Date dt)
	{
		System.out.println("Parameterized constructor..");
		empId = id;
		empName = nm;
		dt_of_joining = dt;
	}
	
	public String toString()
	{
		return "Employee = [Id = "+empId+" ,Name = "+empName+" ,Joining Date = "+dt_of_joining;
	}
	
	public static void main(String[] args) {
				
		Employee e = new Employee();
		System.out.println(e);
		
		Employee e1 = new Employee(1," A",new Date(9,4,2026));
		System.out.println(e1);
	}
}
