
public class EnumD {
	public enum Coffee{SMALL(60), MEDIUM(80), LARGE(100);
	private int price;
	
	private Coffee(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;	
	}
	}
	public static void main(String[] args)
	{
		Coffee c = Coffee.MEDIUM;
		System.out.println(c+" Size of coffee costs = "+" Rs."+c.getPrice());
	}
	
}
