package classwork;

import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String[] args) {
		
		Function<Integer, Double> f = (a) -> Math.sqrt(a);
		System.out.println(f.apply(4));
		
		Function<String, String> s = (a) -> a.toLowerCase()+" "+a.toUpperCase();
		System.out.println(s.apply("Shruti"));
		
		Function<String, Integer> i = (a) -> a.length();
		System.out.println(i.apply("Aditya"));
	}
}
