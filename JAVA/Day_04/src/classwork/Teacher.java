package classwork;

public class Teacher extends Person {
	
	private String Subject;
	
	public Teacher(){}
	
	public Teacher(String fname, String lname, int age, String Subject)
	{
		super(fname,lname,age);
		this.Subject = Subject;
		System.out.println("Enter Subject : ");
		Subject = s.next();
	}
	
//	public void getData()
//	{
//		super.getData();
//		System.out.println("Enter Subject : ");
//		Subject = s.next();
//	}
	
	@Override
	public String toString() {
		return super.toString()+"\nTeacher Subject= " + Subject;
	}

//	public void display() 
//	{
//		super.display();
//		System.out.println(Subject);
//	}
	
}
