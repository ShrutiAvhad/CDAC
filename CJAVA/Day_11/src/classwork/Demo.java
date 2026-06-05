package classwork;
import java.util.regex.Pattern;

public class Demo {
	
	public static void main(String[] args) {
		
		String str = "Learning Java Programming Language ";
		String s[] = str.split("\\s");
		
		for(String i : s)
		{
			System.out.println(i);
		}
		
		System.out.println("-----------------");
		String s1 = "10,20,30";
		String st[] = s1.split(",");
		
		for(String i : st)
		{
			System.out.println(i);
		}
		
		System.out.println(Pattern.matches(".ava", "java"));
		System.out.println(Pattern.matches(".....age", "language"));
		System.out.println(Pattern.matches("..ava", "guava"));
		System.out.println(Pattern.matches("[A-Za-z]+[0-9]+", "Shruti123"));

	}
}
