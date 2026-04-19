package classwork;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
		Stack<Comparable> s =  new Stack<Comparable>();
		
		s.push(10);
		s.push('A');
		s.push("ABC");
		s.push(47);
		s.push(null);
		s.push(10);
		
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s.search("ABC"));
		System.out.println(s.search("B"));
	}
}
