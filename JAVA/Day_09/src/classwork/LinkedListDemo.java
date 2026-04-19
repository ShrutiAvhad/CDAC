package classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

		public static void main(String[] args) {
			
			List <String> a = new ArrayList <>();

			
			//a.add(null);
			a.add("A");
			a.add("B");
			a.add("C");
			a.add("D");
			a.add("E");

			System.out.println(a);
			
			List <String> list = Collections.synchronizedList(a);
			ListIterator <String> itr = a.listIterator();
			

			while(itr.hasNext())
			{
				String str = itr.next();
				if(str.equals("A"))
				//itr.set("S");
				
				//itr.remove();					//removes all elements
				itr.add("F"); 				//adds element after every element
			}
			System.out.println(a);

			while(itr.hasPrevious())
			{
				String str = itr.previous();
				if(str.equals("A"))
				itr.add("G");
			}
			
			System.out.println(a);
		}
}


