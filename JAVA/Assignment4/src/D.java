
public class D extends C{
	
	public D() 
	{
		System.out.println("In default of D");
	}
	
	public D(int a)
	{
		System.out.println("In Parameterised of D");
	}
	
	public static void main(String args[])
	{
		D d = new D(10);
	}
}
