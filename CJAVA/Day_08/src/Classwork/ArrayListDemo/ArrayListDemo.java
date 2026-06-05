package Classwork.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(10);
		a.add('A');
		a.add("ABC");
		a.add(10.2f);
		a.add(10);
		a.add(null);
		System.out.println(a);
		
		a.add(1,'B');
		System.out.println(a.get(5));
		
		System.out.println(a.isEmpty());
		
		ArrayList a1 = new ArrayList();
		a1.addAll(a);
		
		System.out.println(a1);
		
		int i = (Integer) a.get(4);
		
		for(Object o:a) {
			//Integer Obj = (Integer) o; //ClassCastException
			System.out.println(o);
		}

	}
}
