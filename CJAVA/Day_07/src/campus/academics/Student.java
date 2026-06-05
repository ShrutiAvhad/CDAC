package campus.academics;
import campus.data.Person;

public class Student extends Person{
	private int rollNo;
	private String branch;
	private int semester;
	
	
	public Student(String name, int age, String address, int rollNo, String branch, int semester) {
		super(name, age, address);
		this.rollNo = rollNo;
		this.branch = branch;
		this.semester = semester;
	}

	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", branch=" + branch + ", semester=" + semester + "]";
	}



	public int getRollNo() {
		return rollNo;
	}

	public String getBranch() {
		return branch;
	}

	public int getSemester() {
		return semester;
	}
	
	
}
