package classwork;

@MyAnnotation(info="Student is my undefined class")

public class Student {
	
	@MyAnnotation(info = "RollNo is an instance variable of type int")
	int rollNo;

	@MyAnnotation(info = "This is default constructor")
	public Student() {}

	@MyAnnotation(info = "This is method of student")
	public void get()
	{
		
	}

}
