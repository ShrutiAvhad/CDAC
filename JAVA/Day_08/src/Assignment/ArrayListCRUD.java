package Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCRUD {
	
	public static void main(String[] args) {
		
		ArrayList <String> a = new ArrayList <String>();
		
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		a.add("E");
		a.add("F");
		a.add("G");
		a.add("H");
		a.add("I");
		a.add("F");
		a.add("F");

		System.out.println(a);
	
		a.remove(2);
		a.remove(3);
		
		System.out.println(a);
		
		a.set(2, "Shruti");
		System.out.println(a);
		
		a.set(7, "Avhad");
		System.out.println(a);
		
		Iterator itr = a.iterator();
		
		while (itr.hasNext()) 
		{
            System.out.println(itr.next());
		}
		System.out.println(a);
		
		
		
	}
}
