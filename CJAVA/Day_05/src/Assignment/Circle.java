package Assignment;

public class Circle extends Processor
{
	public Circle(int data)
	{
		super(data);
	}
	
	@Override
	public void Process() 
	{
		double area = Math.PI * data * data;
		System.out.println("Area of circle = "+area);	
	}

}
