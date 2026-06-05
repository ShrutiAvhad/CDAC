package classwork;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TestEmp {
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee(111, "Shinchan", 70000);
		Employee e2 = new Employee(222, "Himavari", 60000);
		Employee e3 = new Employee(333, "Hiroshi", 90000);
		Employee e4 = new Employee(444, "Mitsi", 80000);
		Employee e5 = new Employee(555, "Shiro", 5000);
		
		//Stores all employees in a list
		List<Employee>list = Arrays.asList(e1,e2,e3,e4,e5);
		long count = list.stream().count();
		System.out.println("Count = "+count);
		
		//selects employees with salary > 50000 & stores result into list
		List<Employee> l1 = list.stream().filter(i -> i.getEmpSal() > 50000).collect(Collectors.toList());
		System.out.println(l1);
		
		
		System.out.println("------------------");
		list.stream().filter(i -> i.getEmpSal() > 60000).collect(Collectors.toList()).forEach(System.out::println);
		
		//map() → converts Employee → String (name)
		System.out.println("-------------------");
		list.stream().filter(i -> i.getEmpSal() > 50000).map(Employee::getEmpName).collect(Collectors.toList()).forEach(System.out::println);
		
		//Converts names into Set & Removes duplicates automatically
		System.out.println("-------------------");
		Set<String> s = list.stream().map(Employee::getEmpName).collect(Collectors.toSet());
		s.forEach(System.out::println);
		
		//Sorts based on salary (low → high)
		System.out.println("---------------------");
		list.stream().sorted(Comparator.comparing(Employee::getEmpSal)).forEach(System.out::println);
		
		//Reverses sorting (high → low)
		System.out.println("---------------------");
		list.stream().sorted(Comparator.comparing(Employee::getEmpSal).reversed()).forEach(System.out::println);
		
		//Sorts names in alphabetical order
		System.out.println("-------------------");
		s.stream().sorted().forEach(System.out::println);
		
		System.out.println("------------------");
		
		//Finds employee with lowest salary & Returns Optional (safe container)
		Optional <Employee> o = list.stream().min(Comparator.comparing(Employee::getEmpSal));
		System.out.println(o.get());
		
		//Converts to double stream & add all salaries
		System.out.println("--------------------");
		long salsum = list.stream().map(Employee::getEmpSal).reduce( 0l, Long::sum);
		System.out.println(salsum);
		
		
		System.out.println("--------------------");
		Map<Integer,String> m = list.stream().collect(Collectors.toMap(Employee::getEmpId,Employee::getEmpName));
		System.out.println(m);
		
	}
}




//+-----------------------------------+
//| Method       | Purpose            |
//| ------------ | ------------------ |
//| `stream()`   | Convert collection |
//| `filter()`   | Apply condition    |
//| `map()`      | Transform data     |
//| `sorted()`   | Sorting            |
//| `forEach()`  | Print              |
//| `collect()`  | Store result       |
//| `Optional`   | Safe result        |
//| `Comparator` | Custom sorting     |
//+-----------------------------------+
