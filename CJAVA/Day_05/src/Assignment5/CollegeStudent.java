package Assignment5;

public class CollegeStudent extends Student {
	private int semester;
	
	public CollegeStudent() {}

	public CollegeStudent(int rn, double per, int semester) {
		super(rn, per);
		this.semester = semester;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("Semister : "+semester);
	}
	
	
}
