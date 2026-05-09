package Recursion;

class Sum_Of_Digits {
	
	public static int cnt(int n) {
		if(n/10 == 0)
			return 1;
		
		return 1 + cnt(n/10);
	}
	
	public static int Sum_Of_Digits(int n) {
		
		if(n/10 == 0)
			return n;
		return n%10 + Sum_Of_Digits(n/10);
	}
	
	public static void main(String[] args) {
		
	    int num = 56432;

		System.out.println("Count = "+cnt(num));
		
		System.out.println("Sum = "+Sum_Of_Digits((num)));
	}
	
}
