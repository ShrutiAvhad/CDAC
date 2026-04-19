package classwork3Abstraction;

public class Test {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println(b.getROI());
		
		//Bank bank = new Bank();	//cannot be instantiated
	}
}
