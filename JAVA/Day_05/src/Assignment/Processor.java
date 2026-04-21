package Assignment;

public abstract class Processor {

	protected int data;
	
	public Processor() {}
	
	public Processor(int data)
	{
		this.data = data;
	}
	
	public void showData()
	{
		System.out.println("Data = "+data);
	}
	
	abstract void Process();
	
		
	
}


