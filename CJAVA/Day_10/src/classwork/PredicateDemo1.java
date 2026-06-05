package classwork;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo1 {
	
	public static void main(String[] args) {
		
		List<Instructor> list = InstructorDetails.getAll();
//		Predicate<Instructor>p1=(i) -> i.isOnlineCourse() && i.getYearOfExp()>1;
//		list.forEach((x) -> {
//			if(p1.test(x))
//			{
//				System.out.println(x.getName());
//			}
//		});
		
		String a = "A";
		Predicate<Instructor>p1=(i) -> i.getName().startsWith(a) && i.getAge()>9;
		list.forEach((x) -> {
			if(p1.test(x))
			{
				System.out.println(x.getName());
			}
		});
	}
}
