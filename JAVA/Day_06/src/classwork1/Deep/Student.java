package classwork1.Deep;

public class Student implements Cloneable{
	private int rollNo;
	private String name;
	private Subject subject;
	
	public Student(int rollNo, String name, Subject subject) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		Student s = (Student)super.clone();
		s.subject = (Subject)subject.clone();
		return s;
	}
	
	
}
