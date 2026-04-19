package classwork1;

public class Test {
	
	public static void main(String[] args) {
		
		ArithCal a = new ArithCal() {
			@Override
			public void add(int a, int b)
			{
				System.out.println(a+b);
			}
		};
		a.add(10,20);
		System.out.println(a.getClass());
	}
}
