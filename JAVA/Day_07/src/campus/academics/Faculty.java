package campus.academics;
import campus.data.Person;

public class Faculty extends Person{
	private int facultyId;
	private int salary;
	private String branch;
	
	public Faculty(String name, int age, String address, int facultyId, int salary, String branch) {
		super(name, age, address);
		this.facultyId = facultyId;
		this.salary = salary;
		this.branch = branch;
	}

	@Override
	public String toString() {
	    return "FacultyId: " + facultyId + ", Name : "+name + ", Age : "+age +", Address : "+address+", Branch: " + branch +", Salary: " + salary;
	}
	
	public int getFacultyId() {
		return facultyId;
	}

	public int getSalary() {
		return salary;
	}

	public String getBranch() {
		return branch;
	}	
	
}
