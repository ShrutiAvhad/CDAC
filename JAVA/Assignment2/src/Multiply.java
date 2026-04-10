public class Multiply {
	
	public int mul(int a, int b)
	{
		int s = a * b;
		System.out.println("Multiplication of int = "+s);
		return s;
	}
	
	public float mul(float a, float b, float c)
	{
		float s = a * b* c;
		System.out.println("Multiplication of Float = "+s);
		return s;
	}
	
	public int mul(int... a)
	{
		int s = 1;
		//System.out.println("Length = "+a.length);	
		
//		for(int i=0; i<a.length; i++)
//		{
//			sum += a[i];
//		}
		for(int i:a)
		{
			s *= i;
		}
		
		System.out.println("Multiplication of VarArg = "+s);

		return s;
	}
	
	public double mul(double a, int b)
	{
		double s = a * b;
		System.out.println("Multiplication of double & int = "+s);
		return s;
	}
	
	public static void main(String [] args)
	{
		Multiply m = new Multiply();
		m.mul(1,2);
		m.mul(10.2f,20.2f,30.2f);
		m.mul(new int[]{2,3,4});
		m.mul(5.5d, 2);

	}
	
}
