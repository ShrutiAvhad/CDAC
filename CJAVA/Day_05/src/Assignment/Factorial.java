package Assignment;

public class Factorial extends Processor
{

	public Factorial(int data)
	{
		super(data);
	}
	
	@Override
	public void Process() 
	{
		int fact = 1;
		
		for(int i=1; i<= data; i++)
		{
			fact *= i;
		}
		System.out.println("Factorial = "+fact);
	}
	
	
}
