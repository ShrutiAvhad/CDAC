package classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Emp e1 = new Emp(222, " Shruti", 98765.65f);
		Emp e2 = new Emp(111, " Shivani", 49856.65f);
		Emp e3 = new Emp(333, " Shravni", 9754.65f);
		Emp e4 = new Emp(666, " Aditya", 76543.65f);
		Emp e5 = new Emp(555, " Yash", 76540.65f);

	
	//TreeSet<Emp> t = new TreeSet<Emp>(new MyComparator());
	//TreeSet<Emp> t = new TreeSet<Emp>();
	ArrayList <Emp> t = new ArrayList<Emp>();
	
	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	t.add(e5);
	System.out.println(t);
	
	Collections.sort(t);
	System.out.println(t);
	
	Collections.sort(t, new MyComparator());
	System.out.println(t);

	}

}
	

