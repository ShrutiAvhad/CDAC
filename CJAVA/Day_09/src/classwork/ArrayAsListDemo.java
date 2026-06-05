package classwork;

import java.lang.*;
import java.util.*;

public class ArrayAsListDemo {

	public static void main(String[] args) {
		
		Character ch[] = {'A','B','C','D','E'};
		
		List list = Arrays.asList(ch);
		list.add('N');
		//list.set(1, 'M');
		list.forEach(x -> {System.out.println(x);});
		
		list.set(0, "MNO");
		System.out.println(list);
		
	}
}
