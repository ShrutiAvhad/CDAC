import java.util.Scanner;
public class Salary {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int Bsal, Hra, Da, Gsal;
		System.out.println("Enter your Salary : ");
		Bsal = s.nextInt();
	
		if(Bsal< 1500)
		{
			Hra = (10*Bsal)/100;
			Da = (90*Bsal)/100;
			System.out.println("HRA = "+Hra+" , Da = "+Da);
		}
		else
		{
			Hra = 500;
			Da = (Bsal * 98)/100;
			
		}
		Gsal = (Bsal+Da+Hra);
		System.out.println("Gsal = "+Gsal);
	}
}
