package classwork;

public class B extends A {
	
	@Override
	public void m1()
	{
		System.out.println("In m1 of B");
	}
	
	@SuppressWarnings("Unused")
	public void m2()
	{
		//@SuppressWarnings("Unused")
		int y;
	}
	
	@Deprecated
	public void m3()
	{
		//....
	}
}
