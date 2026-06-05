package classworkHash;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap <Integer, String> h = new HashMap <Integer, String>();
		
		h.put(100, " Bunty");
		h.put(200, " Shruti");
		
		System.out.println(h.put(100, " Aditya"));
		//h.put(null, null);
		System.out.println(h);
	}
}
