
public class OneBHK {
	protected double roomArea;
	protected double hallArea;
	protected double price;
	
	public OneBHK() {}
	
	public OneBHK(double ra, double ha, double p) {
		
		this.roomArea = ra;
		this.hallArea = ha;
		this.price = p;
	}
	
	public void show() {
		System.out.println("1BHK : Room = "+roomArea+"Hall = "+hallArea+"Price = "+price);
	}
	
	public double getPrice()
	{
		return price;
	}
	
}
