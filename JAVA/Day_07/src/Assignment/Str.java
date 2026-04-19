package Assignment;

import java.util.Scanner;

public class Str {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String name;
		
		int count = 0;
		
		System.out.println("Enter yous name : ");
		name = s.next();
		
		name = name.toLowerCase();
		
		for(int i=0; i<name.length(); i++)
		{
			char ch = name.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				count ++;
			}
		}
		System.out.println(count);
		s.close();
	}
}
