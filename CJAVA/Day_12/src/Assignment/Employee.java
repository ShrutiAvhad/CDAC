package Assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Employee {
	
	private int id;
	private String name;
	private String designation;
	private double salary;
	
	public Employee() {}
	
	public Employee(int id, String nm, String desi, double sal)
	{
		this.id = id;
		this.name = nm;
		this.designation = desi;
		this.salary = sal;
	}
	
	@Override
	public String toString()
	{
		return " Employee : Id = "+id+" Name = "+name+" Designation = "+designation+" Salary = "+salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getDesi()
	{
		return designation;
	}
	
	public void setDesi(String desi)
	{
		this.designation = desi;
	}
	
	public double getSal()
	{
		return salary;
	}
	
	public void setSal(double sal)
	{
		this.salary = sal;
	}
	
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		ArrayList <Employee> e = new ArrayList<Employee>();
		
		System.out.println("================= Enter Emp Details ===============");
		
		for(int i=0; i<2; i++)
		{
			System.out.println("Enter EmpId : ");
			int id = s.nextInt();
			
			System.out.println("Enter Empname : ");
			String name = s.next();
			s.nextLine();
			
			System.out.println("Enter Designation : ");
			String designation = s.nextLine();
			
			System.out.println("Enter Salary : ");
			double salary = s.nextDouble();
			
			e.add(new Employee(id, name, designation, salary));
		}
		
		System.out.println("\n===================== Display ====================");
		e.stream().filter(i -> i.getSal() > 50000).forEach(System.out::println);
		
		System.out.println("\n===================== Sort =====================");
		e.stream().sorted(Comparator.comparing(Employee::getDesi)).forEach(System.out::println);
		
		System.out.println("\n====================== Total sal ====================");

		Map<String, Double> m = e.stream().collect(Collectors.groupingBy(Employee::getDesi, Collectors.summingDouble(Employee::getSal)));
		System.out.println(m);
	}
}
