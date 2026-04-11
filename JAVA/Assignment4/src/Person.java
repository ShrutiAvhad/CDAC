import java.util.Scanner;
public class Person extends Object{
	
	private String firstname;
	private String lastname;
	private int age;
	Scanner s = new Scanner(System.in);
	
	public Person(){}
	
	public Person (String firstname, String lastname, int age)
	{
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		
		System.out.println("Enter your firstname & lastname : ");
		firstname = s.next();
		lastname = s.next();
		
		System.out.println("Enter age : ");
		age = s.nextInt();
	}
	
//	public void getData()
//	{
//		System.out.println("Enter your firstname & lastname : ");
//		firstname = s.next();
//		lastname = s.next();
//		
//		System.out.println("Enter age : ");
//		age = s.nextInt();
//	}
	
	
	
	@Override
	public String toString() {
		return "Person firstname=" + firstname + ", lastname=" + lastname + ", age=" + age;
	}

//	public void display()
//	{
//		System.out.println("My name is "+firstname+" "+lastname+" and my age is "+age);
//	}
	
	
//	public static void main(String[] args) {
//	    Person p = new Person();
//	    p.getData();
//	    p.display();
//	}
	
}
