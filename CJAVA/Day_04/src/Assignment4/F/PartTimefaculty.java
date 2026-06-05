package Assignment4.F;

public class PartTimefaculty extends Faculty {
	
	private int hour;
	private int rate;
	
	public PartTimefaculty(int facultyid, int hour, int rate)
	{
		super(facultyid);
		this.hour = hour;
		this.rate = rate;
		this.sal = hour * rate;
	}

	@Override
	public String toString()
	{
		return "PartTimefaculty [hour=" + hour + ", rate=" + rate + "]";
	}

	public int getHour() 
	{
		return hour;
	}

	public int getRate() 
	{
		return rate;
	}
	
}
