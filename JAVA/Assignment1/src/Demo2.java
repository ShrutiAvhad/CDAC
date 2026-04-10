import java.util.Scanner;
public class Demo2 {
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("Enter numbers: ");
		
		 a = s.nextInt();
		 b = s.nextInt();
		 c = s.nextInt();
		 		
//		if((a > b) && (a > c))
//		{
//			System.out.println(a+" is greater");
//		}
//		else if ((b > a) && (b > c))
//		{
//			System.out.println(b+" is greater");
//		}
//		else if ((c > a) && (c > b))
//		{
//			System.out.println(c+" is greater");
//		}
		 
		 int max = (a>b)? a:(b>c)? b: c;
		 System.out.println(max+" is max");
		 
		s.close();
	}
}
