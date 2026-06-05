package classwork;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		
		//Greater than 10
		Predicate<Integer>p = (x) -> x > 10;
		System.out.println(p.test(7));
		
		//Even no
		Predicate<Integer>e = (x) -> (x%2)==0;
		System.out.println(e.test(2));
		
		//Greater than 10 and even no
		System.out.println(p.and(e).test(20));
		
		//Greater than 10 or even
		System.out.println(p.or(e).test(4));
		
		//Greater than 10 and odd
		System.out.println(p.and(e.negate()).test(38));
		
	}
}
