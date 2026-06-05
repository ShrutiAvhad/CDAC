package classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		EmpDoc e1 = new EmpDoc(222, " Shruti", 98765.65f);
		EmpDoc e2 = new EmpDoc(111, " Shivani", 49856.65f);
		EmpDoc e3 = new EmpDoc(333, " Shravni", 9754.65f);
		EmpDoc e4 = new EmpDoc(666, " Aditya", 76543.65f);
		EmpDoc e5 = new EmpDoc(555, " Yash", 76540.65f);

	
	//TreeSet<Emp> t = new TreeSet<Emp>(new MyComparator());
	//TreeSet<Emp> t = new TreeSet<Emp>();
	ArrayList <EmpDoc> t = new ArrayList<EmpDoc>();
	
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
	

