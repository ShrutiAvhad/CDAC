package classwork;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamDemo {

	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(10,20,30,43,11,99);
		list.stream().forEach(System.out::println);
		int sum = IntStream.of(1,2,3,4,5).sum();
		System.out.println("Sum = "+sum);
		
		int t = IntStream.rangeClosed(1, 10).sum();
		System.out.println("Total = "+t);
		
		int total = list.stream().filter(i -> i%2 == 0).map(a -> a*2).reduce(0, Integer::sum);
		System.out.println("Total = "+total);
		
		System.out.println("-------------");
		list.stream().forEach(System.out::println);
		
	}
}
