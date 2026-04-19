package classwork;

/**
 * The Emp class represents an Employee entity.
 * 
 * <p>This class contains basic employee details such as:
 * <ul>
 *   <li>Employee ID</li>
 *   <li>Employee Name</li>
 *   <li>Employee Salary</li>
 * </ul>
 * 
 * <p>This class implements the Comparable interface to allow
 * sorting of Employee objects based on their employee ID.
 * 
 * <p>Natural ordering is defined by empId in ascending order.
 * 
 * @author Shruti
 * @version 1.0
 */
public class Emp implements Comparable<Emp> {

    /**
     * Unique identifier for each employee.
     */
    private int empId;

    /**
     * Name of the employee.
     */
    private String empName;

    /**
     * Salary of the employee.
     */
    private float empSal;

    /**
     * Default constructor.
     * Initializes an empty Emp object.
     */
    public Emp() {}

    /**
     * Parameterized constructor to initialize employee details.
     * 
     * @param empId   unique employee ID
     * @param empName name of the employee
     * @param empSal  salary of the employee
     */
    public Emp(int empId, String empName, float empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }

    /**
     * Retrieves employee ID.
     * 
     * @return empId
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * Sets employee ID.
     * 
     * @param empId new employee ID
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /**
     * Retrieves employee name.
     * 
     * @return empName
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * Sets employee name.
     * 
     * @param empName new name of employee
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * Retrieves employee salary.
     * 
     * @return empSal
     */
    public float getEmpSal() {
        return empSal;
    }

    /**
     * Sets employee salary.
     * 
     * @param empSal new salary
     */
    public void setEmpSal(float empSal) {
        this.empSal = empSal;
    }

    /**
     * Returns a string representation of the employee object.
     * This method is automatically called when the object is printed.
     * 
     * @return formatted string containing employee details
     */
    @Override
    public String toString() {
        return "\nEmp : empId=" + empId +
               ", empName=" + empName +
               ", empSal=" + empSal;
    }

    /**
     * Compares this employee object with another employee object
     * based on employee ID.
     * 
     * <p>This method is used for sorting collections such as:
     * <ul>
     *   <li>TreeSet</li>
     *   <li>Collections.sort()</li>
     * </ul>
     * 
     * @param e the employee object to be compared
     * @return a negative integer, zero, or a positive integer as this object
     *         is less than, equal to, or greater than the specified object
     */
    @Override
    public int compareTo(Emp e) {
        if (this.empId > e.empId)
            return 1;
        else if (this.empId < e.empId)
            return -1;
        else
            return 0;
    }
}