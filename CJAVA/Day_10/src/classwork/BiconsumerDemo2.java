package classwork;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class BiconsumerDemo2 {

	public static void main(String[] args) {

		List<Instructor> list = InstructorDetails.getAll();
		
		Predicate<Instructor> p1 = (i) -> i.isOnlineCourse();

		BiConsumer<String, List <String>> p2 = (x, y) -> System.out.println(x + " " + y);

//		list.forEach(System.out::println);
		list.forEach(x -> {
			if (p1.test(x)) {
				p2.accept(x.getName(), x.getCourses());
				
			}
		});
	}
}
