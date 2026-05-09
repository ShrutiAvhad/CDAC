package Recursion;

public class DisplayR {
	
	private static void displayR(int n) {
		
		if(n/10 == 0)
		{
			System.out.println(n);
			return;
		}
		System.out.print(n%10);
		displayR(n/10);
		 
	}
	public static void main(String[] args) {
		
		displayR(675);
	}	
}
