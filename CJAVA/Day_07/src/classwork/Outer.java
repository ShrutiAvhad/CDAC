package classwork;

public class Outer {
	private int no;
	
	public Outer()
	{
		no = 100;
	}
	private class Inner
	{
		private int n;
		public Inner()
		{
			n = 10;
		}
		public void getN()
		{
			System.out.println("no = "+no);
			System.out.println("n = "+n);
		}
	}
	public static void main(String[] args) {
		Inner i = new Outer().new Inner();
		i.getN();
	}
}
