package classworkHash;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args)
	{
		Hashtable <Temp, String> h = new Hashtable <Temp, String>();
		
		h.put(new Temp (1)," A ");
		h.put(new Temp (24)," B ");
		h.put(new Temp (11)," C ");
		h.put(new Temp (6)," D ");
		h.put(new Temp (9)," A ");
		h.put(new Temp ( )," ");
		h.put(new Temp (9)," A ");
		//h.put(null, null);  		//NullPointerException

		System.out.println(h);
	}
}
