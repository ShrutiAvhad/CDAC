package Classwork;

public class Player {
	private String playerName;
	private String playerCountry;
	
	public Player()
	{
		playerCountry = "India";
	}
	
	public Player(String playerName)
	{
		this();
		this.playerName = playerName;
	}
	
	
	public String toString()
	{
		return "[Playername = "+playerName+ "PlayerCountry = "+playerCountry+"]";
	}
	
	public static void main(String args[])
	{
		Player p = new Player("Adi ,");
		System.out.println(p);
		
	}
}
