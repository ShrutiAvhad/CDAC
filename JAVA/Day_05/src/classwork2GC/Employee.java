package classwork2GC;

public class Employee extends Object{
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	public boolean equals(Object o)
	{
		Employee e = (Employee)o;
		if((this.empId == e.empId) && ((this.empName).equals(e.empName)))
			return true;
		else
			return false;
	}
	
	public int hashcode() 
	{
		return empId;
	}
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee(1,"Rahul");
		Employee e2 = new Employee(1,"Rahul");
		
//		if(e1 == e2)
//		{
//			System.out.println("Are Equal..");
//		}
//		else
//		{
//			System.out.println("Not Equal");
//		}
		
		if(e1.equals(e2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		System.out.println(e1.hashcode());
		System.out.println(e2.hashcode());
	}
	
}
