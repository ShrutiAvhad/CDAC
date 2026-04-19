package Classwork.Linkedlist;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.RandomAccess;


public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList <Integer> l = new LinkedList <Integer>();
		l.add(10);
		l.add(20);
		l.add(28);
		l.add(85);
		l.add(19);
		l.add(74);
		l.add(38);
		//l.add("A");
		System.out.println(l);
		
		((LinkedList <Integer>)l).addFirst(56);
		l.add(null);
		System.out.println(l);
		
		//l.set(2, 100);  
		
		l.removeLast();
		System.out.println(l);
		
		l.remove();
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		Iterator itr = l.iterator();
		
		while(itr.hasNext())
		{
			int n = (Integer)itr.next();
			if((n%2)== 0)
				itr.remove();
		}
		
		System.out.println(l);
		
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);

	}
}
