package classwork;

import java.util.Scanner;

public class Demo5 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = s.next();
		
		System.out.println("Enter age : ");
		int age = s.nextInt();
		
		System.out.println("Enter Subject : ");
		String sub = s.next();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(sub);
		
	}
}
