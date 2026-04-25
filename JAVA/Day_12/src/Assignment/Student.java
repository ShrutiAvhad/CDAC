package Assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Result {
	
	private int id;
	private String name;
	private String department;
	private double marks;
	
	public Result() {}
	
	public Result(int id, String name, String dept, double marks )
	{
		this.id = id;
		this.name = name;
		this.department = dept;
		this.marks = marks;
	}
	
	public String toString()
	{
		return "\nStudent : Id = "+id+", Name = "+name+", Department = "+department+", Marks = "+marks;
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
	
	public String getDept()
	{
		return department;
	}
	
	public void setDept(String department)
	{
		this.department = department;
	}
	
	public double getMarks()
	{
		return marks;
	}
	
	public void setMarks(double marks)
	{
		this.marks = marks;
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		//Student[] st = new Student[5];
        ArrayList<Result> l = new ArrayList<Result>();

		
		System.out.println("=========== Enter Student Details ==========");
		
		for(int i=0; i<3 ;i++)
		{
			System.out.println("Enter Id : ");
			int id = s.nextInt();
			
			System.out.println("Enter name : ");
			String name = s.next();
			s.nextLine();
			
			System.out.println("Enter Dept : ");
			String department = s.nextLine();
			
			System.out.println("Enter Marks : ");
			double marks = s.nextDouble();
			
			l.add(new Result(id, name, department, marks));
			
		}
		
		//Display
		System.out.println("----------------- Display -----------------");
		for(Result r: l)
		{
			System.out.println(r);
		}
		System.out.println( );
		
		//Condition
		System.out.println("---------------- Greater than 60 -----------------");
		l.stream().filter(i -> i.getMarks() > 60).forEach(System.out::println);
		System.out.println( );
		
		//Descending order
		System.out.println("---------------- Descending order ----------------");
		l.stream().sorted(Comparator.comparing(Result::getMarks).reversed()).forEach(System.out::println);
		
		//map
		System.out.println("---------------------- Map ---------------------");
		Map <String,List<Result>> m = l.stream().collect(Collectors.groupingBy(Result::getDept));
		System.out.println(m);
 	}
}
