package Assignment4;
import java.util.Scanner;
public class BHK {
	public static void main(String[] args) {
		 
		Scanner s =  new Scanner(System.in);
		TwoBHK flats[] = new TwoBHK[3];
		
		for(int i=0; i<3; i++) 
		{
			System.out.println("Enter room1 area, hall area, price, room2 area:");	
			double ra = s.nextDouble();
			double ha = s.nextDouble();
			double p = s.nextDouble();
			double r2a = s.nextDouble();
			
			flats[i] = new TwoBHK(ra,ha,p,r2a);
		}
		
		double total = 0;
		System.out.println("\nFlat Details : ");
		for(int i=0; i<3; i++)
		{
			flats[i].show();
			total += flats[i].getPrice();
		}
		System.out.println("\nTotal amount of all flats : "+total);
		
		s.close();
	}
}
