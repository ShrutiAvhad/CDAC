package classwork;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		t.add(10);
		//t.add(null);		//NullPointerException
		t.add(10.4f);
		//t.add(89);			//ClassCastException
		t.add(87);
		t.add(16);
		
		System.out.println(t);
	}
}
