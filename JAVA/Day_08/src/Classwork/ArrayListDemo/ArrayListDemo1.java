package Classwork.ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		
		ArrayList <String> a = new ArrayList <String>();
		a.add(null);
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		a.add("E");

		System.out.println(a);
		
		for(String s : a)
		{
			System.out.println(s);
		}
		
		a.remove(null);
		Collections.sort(a);

		System.out.println(a);
		
		//Object s = a.get(3);
		String s = a.get(3);
		
		a.forEach((x) -> {System.out.println(x);});
		
		List <String> list = Collections.synchronizedList(a);
	}
}
