package classwork;


public class Outer1 {
	private int n;
	
	public Outer1()
	{
		n = 111;
	}
	
	public void get()
	{
		int n = 1111;
		
		class Inner1
		{
			int n;
			
			public Inner1()
			{
				n = 11;
			}
			
			public int getN()
			{
				return n;
			}
		}
		
		Inner1 i = new Inner1();
		System.out.println("n = "+i.getN());
		
	}
	
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		o.get();
	}
}

