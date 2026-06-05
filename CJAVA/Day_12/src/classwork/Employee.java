package classwork;

/**
 * 
 */
public class Employee {
	
	private int empId;
	private String empName;
	private long empSal;
	
	public Employee() {}
	
	public Employee(int eId, String eName, long eSal)
	{
		this.empId = eId;
		this.empName = eName;
		this.empSal = eSal;
	}
	
	 @Override
	 public String toString()
	 {
		 return "\nEmployee : empId = "+empId+", empName = "+empName+", empSal = "+empSal;
	 }

	 public int getEmpId()
	 {
		 return empId;
	 }
	
	 public void setEmpId(int empId)
	 {
		 this.empId = empId;
	 }

	 public String getEmpName()
	 {
		 return empName;
	 }
	 
	 public void setEmpName(String empName)
	 {
		  this.empName = empName;
	 }
	 
	 public long getEmpSal()
	 {
		 return empSal;
	 }

	 public void setEmpSal(long empSal)
	 {
		 this.empSal = empSal;
	 }
	 
	
}
