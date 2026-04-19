package classwork;

import java.util.*;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		System.out.println(v.capacity());
		
		for(int i=0; i<10; i++)
		{
			v.addElement(i);
		}
		
		System.out.println(v);
		v.add(11);
		v.add(25);
		v.add(53);
		v.add(12);
		v.add(11);
		v.add(543);
		v.add(33);
		v.add(9);
		v.add(0);
		v.add(null);
		v.add(13);

		System.out.println(v);
		System.out.println(v.capacity());
		
		System.out.println(v.size());
		Enumeration<Integer>e = v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
