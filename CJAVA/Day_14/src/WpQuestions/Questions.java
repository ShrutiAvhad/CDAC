package WpQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//1.	Find Even Number using Stream
//2.	Covert list of String to uppercase
//3.	Find maximum number 
//4.	Count strings with length greater than 3
//5.	Sort employees by name using comparator
//6.	Remove duplicate elements from the list of integer/String
//7.	Find sum of all elements
//8.	Find first element from the list of Integer/String

public class Questions {
	
	public static void main(String[] args) {
		
		 System.out.println("\n=========== 1.Even ===========");
		 IntStream.rangeClosed(1, 10).filter(i -> i%2 == 0).forEach(System.out::println);
		 
		 System.out.println("\n=========== 2.Uppercase ===========");
		 List<String> l1 = new ArrayList<String>();
		 l1.add("abcd");
		 l1.add("pqr");
		 l1.add("dfgh");
		 l1.add("iyty");
		 l1.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
		 
		 System.out.println("\n=========== 3.Max ===========");
		 OptionalInt max = IntStream.rangeClosed(1, 10).max();
		 System.out.println(max);
		 
		 System.out.println("\n=========== 4.String length ===========");
		 List<String> s = new ArrayList<String>();
		 s.add("Shruti");
		 s.add("Shru");
		 s.add("Shri");
		 s.add("moo");
		 s.add("Ha");

		 long count = s.stream().filter(str -> str.length() > 3).count();
		 System.out.println(count);
	}
	
}
