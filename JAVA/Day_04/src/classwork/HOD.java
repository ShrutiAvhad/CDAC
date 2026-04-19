package classwork;

public class HOD extends Teacher {

	private String Department;

	public HOD() {
	}

	public HOD(String fname, String lname, int age, String Subject, String Department) {
		super(fname, lname, age, Subject);
		this.Department = Department;
		System.out.println("Enter the Department name : ");
		Department = s.next();
	}

	@Override
	public String toString() {
		return super.toString() + "\nHOD Department= " + Department;
	}

}
