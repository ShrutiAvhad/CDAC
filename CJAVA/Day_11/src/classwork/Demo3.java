package classwork;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Demo3 {
	
	public static void main(String[] args) throws IOException
	{
		List <String> lines = Files.readAllLines(Path.of("abc.txt"));
		
		for(String line : lines)
		{
			System.out.println(line);
		}
		
	Path p = Files.write(Path.of("mno.txt"),Arrays.asList("List1","List2","List3","List4","List5"));
	System.out.println(p);
	System.out.println("Success");
	
	}
	
}
