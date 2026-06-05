package classwork4;
import java.util.*;

public class AssertDemo {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Age : ");
		int age = s.nextInt();
		assert age > 18 : "You are eligible for voting";
		System.out.println("Welcome : " + age);
		
	}
}
