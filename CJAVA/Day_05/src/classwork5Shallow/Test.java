package classwork5Shallow;

public class Test {
	public static void main(String[] args)throws CloneNotSupportedException
	{
		Subject subject = new Subject("Math","Chemistry","Physics");
		Student student = new Student(1,"Rahul",subject);
		
		System.out.println(student);
		
		Student studentcopy = (Student)student.clone();
		System.out.println(studentcopy);
		
		studentcopy.getSubject().setSub1("Java");
		System.out.println(studentcopy.getSubject().getSub1());
	}
}
