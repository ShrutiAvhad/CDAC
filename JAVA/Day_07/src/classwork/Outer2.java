package classwork;

public class Outer2 {
	
	private int n1;
	private static int n2;
	
	public Outer2()
	{
		n1 = 10;
	}
	
	static
	{
		n2 = 100;
	}
	
	public static class Inner2
	{
		private int n = 1000;
		
		public void get()
		{
			System.out.println("n2 = "+n2);
			//System.out.println("n1 = "+n1);
		}
		
	}
	public static void main(String[] args) {
	    Outer2.Inner2 i = new Outer2.Inner2();
	    i.get();
	}
	
}
