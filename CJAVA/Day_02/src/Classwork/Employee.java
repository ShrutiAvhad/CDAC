package Classwork;

public class Employee 
{
	private int empId;
	private String empName;
	private float empSal;
	
	public Employee()
	{
		System.out.println("Default Constructor");
		empId = 111;
		empName = "A";
		empSal = 876543.2f;
	}
	
	public Employee(int id, String nm, float sal)
	{
		System.out.println("Parameterized Constructor");
		empId = id;
		empName = nm;
		empSal = sal;
	}
	
	public String toString()
	{
		return "Employee = [" +empId+ "," +empName+ "," +empSal+ "]";
	}
	
	public static void main(String args[])
	{
		Employee e = new Employee();
		System.out.println(e);
		
		System.out.println();

		Employee e1 = new Employee(222, "S" ,12345f);
		System.out.println(e1);
	}
}
