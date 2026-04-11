
public class TwoBHK extends OneBHK{
	
	private double room2Area;
	
	public TwoBHK() {}
	
	public TwoBHK(double ra, double ha, double p,double r2a)
	{
		super(ra,ha,p);
		this.room2Area = r2a;
	}
	
	public void show() {
		System.out.println("2BHK : Room1 = "+room2Area+" Room2 "+roomArea+" Hall = "+hallArea+" Price = "+price);
	}
	
	public double getPrice()
	{
		return price;
	}
	
}
