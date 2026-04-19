package Assignment2;
import java.util.*;
public class LeapYear {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year;
		System.out.println("Enter Year to check Leap Year");
		year = s.nextInt();
		
		
		if((year%4 == 0)&& (year%100!=0) || (year%400 == 0)) 
		{
			System.out.println(year+" is a Leap Year!");
		}
		else
		{	
			System.out.println(year+" is a Not a Leap Year!");
		}
}}