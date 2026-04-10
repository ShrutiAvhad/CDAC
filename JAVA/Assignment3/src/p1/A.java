package p1;

public class A {
	//protected int n;
	public static int n;
	
	public A()
	{
		n = 10;
	}
	
	public int getA()
	{
		return n;
	}
	
	public static void main(String [] args) 
	{
		A a = new A();
		System.out.println(a.getA());
	}
	
}
