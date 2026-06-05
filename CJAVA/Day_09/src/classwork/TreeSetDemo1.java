package classwork;

import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		
		TreeSet<Integer>t = new TreeSet<Integer>(new MyComparator());
		t.add(10);
		//t.add(null);		//NullPointerException
		//t.add(10.4f);		//ClassCastException
		t.add(89);			
		t.add(87);
		t.add(16);
		
		System.out.println(t);
	}
}
