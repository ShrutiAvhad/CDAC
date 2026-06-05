package Classwork;


public class Demo1 {
	public static void main (String [] args) {
		
	byte b = 127;
	int n = 257;
	b = (byte)n;
	System.out.println(b);
	n=b;
	
	byte b1 = 10;
	byte b2 = 30;
	int i = b1 * b2;
	
	float f = 10.2f;
	float Avg = (float) 5/2;
	System.out.println("Avg ="+ Avg);
	
	n = n +1;
	n++;
	n += 1;
	
	System.out.println(10/0);
	System.out.println(10/0.0);
	System.out.println(0.0/0.0);
	
	int a = 0b101;
	System.out.println(a);
	
	int c = 10;
	int d = c++;
	System.out.println(c+" "+d);
	
	int e = ++c;
	System.out.println(e+" "+d);
	
	double no = 10_00_000;
	
	}
}