package Classwork.Wrapper;

public class WrapperDemo {
	public static void main(String[] args) {
		
		int no = 10;
		System.out.println("no = "+no);
		
		Integer i = new Integer(no);		//Boxing
		
		int n = i.intValue();				//Unboxing
		System.out.println("n = "+n);
		
		String str = "100";					//String to primitive
		System.out.println("str = "+str);

		int a = Integer.parseInt(str);
		System.out.println("a = "+a);

		Integer b = Integer.valueOf(str);	//String to wrapper
		System.out.println("b = "+b);

		int s = 11;							//Auto-Boxing
		System.out.println("s = "+s);

		Integer d = s;
		System.out.println("d = "+d);
		
		int m = d;							//Auto-Unboxing
		System.out.println("m = "+m);

		
	}
}
