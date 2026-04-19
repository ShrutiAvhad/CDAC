package classwork1;

public final class Student {
	
	private final int rollNo;
	private final String name;
	
	//public Student( ) {}                         //default constructor
	
	public Student(int rollNo, String name) 	//parameterized constructor
	{
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {					//getter
		return rollNo;
	}

	public String getName() {
		return name;
	}
	
}
