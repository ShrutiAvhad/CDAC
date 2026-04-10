
public class Date {
	private int dd;
	private int mm;
	private int yy;
	
	public Date() {}
	
	public Date(int dd, int mm, int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public String toString()
	{
		return "Date ["+dd+"/"+mm+"/"+yy+"]";
	}
	
	public static void swapDates(Date d1, Date d2)
	{
		Date temp;
		temp = d1;
		d1 = d2;
		d2 = temp;
		
		System.out.println("d1 ="+d1);
		System.out.println("d2 ="+d2);
	}
	
	public static void main(String[] args) {
		Date d1 = new Date (9,4,2026);
		Date d2 = new Date (10,5,2027);
		
		System.out.println("Before swapping : ");
		System.out.println(d1);
		System.out.println(d2);
		
		
		System.out.println( );		
		
		System.out.println("After swapping : ");
		Date.swapDates(d1, d2);
		
	}
}
