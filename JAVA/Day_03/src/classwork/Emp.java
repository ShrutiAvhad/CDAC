package classwork;

public class Emp {
	
	private int empNo;
	private int sal;
	
	private static int Tsal = 0;
	private static int count = 0;
	
	public Emp(int s)
	{
		System.out.println("Parameterized constructor..");
		
		count++;
		empNo = count;
		
		sal = s;
		
		Tsal += s;
	}
	
	public void display()
	{
		System.out.println("EmpNo : "+empNo+" Salary : "+sal);
	}
	
	public static void showDetails()
	{
		System.out.println("Total Employees : "+count);
		System.out.println("Total Salary : "+Tsal);
	}
	
	public static void main(String[] args)
	{
		Emp e = new Emp(10000);
		Emp e1 = new Emp(20000);
		Emp e2 = new Emp(30000);
		
		System.out.println( );
		
		e.display();
		e1.display();
		e2.display();
		
		System.out.println( );

		Emp.showDetails();
		
		
	}
}
