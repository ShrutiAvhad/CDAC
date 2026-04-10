
public class B extends A {
	@Override
	public void m1()
	{
		System.out.println("In m1() of B");
	}
	
	public void m2() {
		System.out.println("In m2() of B");
	}
	
	public static void main(String[] args) {
		
		A a = new B();
		a.m1();
		
		
		if(a instanceof B)
		{
			((B)a).m2();
		}
	}
}
