package Recursion;

public class PowerR {

	public static int power(int a, int p) {
		
		if(p == 0)
			return 1;
		
		return a * power(a,p-1);
		
	}
	public static void main(String[] args) {
		int P = power(2,2);
		System.out.println(P);
		return;
	}

}
