package campus.data;

public class Person {
	protected String name;
	protected int age;
	protected String address;
	
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
	    return "Name: " + name +", Age: " + age +", Address: " + address;
	}
	
}
