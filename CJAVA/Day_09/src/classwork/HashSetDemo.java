package classwork;

import java.util.LinkedHashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		LinkedHashSet h =  new LinkedHashSet();
		//HashSet h = new HashSet();
		
		h.add(null);
		h.add('H');
		h.add(10);
		h.add(16.8f);
		System.out.println(h.add(10));
		h.add(null);					//Only one allowed
		System.out.println(h);
		
	}
}
