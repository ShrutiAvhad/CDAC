import java.util.Scanner;
public class Floor {

	private int length;
	private int width;
	
	public Floor() {}

	public Floor(int len, int wid)
	{
		this.length = len;
		this.width = wid;
	}
	
	public double totalTiles(Tile t)
	{
		int floorArea = length*width;
		int tileArea = t.getEdge()*t.getEdge();
		
		return floorArea / tileArea;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter length and width : ");
		int len = s.nextInt();
		int wid = s.nextInt();
		
		System.out.println("Enter tile Edge : ");
		int edge = s.nextInt();
		
		Floor f = new Floor(len, wid);
		Tile t = new Tile(edge);
		
		double total = f.totalTiles(t);
		System.out.println("Total tiles required : "+total);
		
		s.close();
		
	}
}
