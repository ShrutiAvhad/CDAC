package Assignment2;

public class Tables {
	public static void main(String[] args) {
		
		for(int n=2; n<=5; n++)
		{
			System.out.println("Table of "+ n);
			
			for(int i=1; i<=10; i++)
			{
				System.out.println(n +" x "+ i +" = "+(n*i));
			}
			System.out.println( );
		}
	}
}
