package classwork1;

public class Test {
	public static void main(String[] args)
	{
		Student s = new Student(1, "Rahul");
		s = new Student(1,"Priyanka");
		//s.rollNo = 3;
		
		System.out.println(s.getRollNo()+" "+s.getName());
		//final Student s1 = new Student(1, "Rahul");	
		
	}
}
