package Recursion;

public class rSeries {
	
	private static int rSeries(int n) {
		
		int sum;
		
		if(n == 0)
			return 0;
		
		sum = n + rSeries(n-1);
		
		System.out.print(" "+n);
		return sum;
	}
	public static void main(String[] args) {
		
		System.out.println(" Result = "+rSeries(6));
	}
	
}
