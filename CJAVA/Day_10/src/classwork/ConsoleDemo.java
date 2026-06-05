package classwork;

import java.io.Console;

public class ConsoleDemo {
	
	public static void main(String[] args) 
	{
		Console console = System.console();
		
		if (console == null) {
            System.out.println("Console not available. Run from command prompt.");
            return;
        }

		System.out.println("Enter Username : ");
		String user =  console.readLine();
		
		System.out.println("Enter Password : ");
		char ch[] = console.readPassword();
		
		String pwd =  String.valueOf(ch);
		
		System.out.println("Username = " + user);
		System.out.println("Password = "+pwd);
		
	}
}
