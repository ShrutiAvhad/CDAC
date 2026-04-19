package Assignment;

//import java.util.Scanner;
import java.util.TreeSet;

import classwork.MyComparator;

public class TreeSetString {
	public static void main(String args[]) {
		
		//Scanner s = new Scanner(System.in);
	TreeSet<String>t = new TreeSet<String>(new MyComparator2());
		//TreeSet<String>t = new TreeSet<String>();

		t.add("Shruti");
		//t.add(null);		//NullPointerException
		//t.add(10.4f);		//ClassCastException
		t.add("Amaan");			
		t.add("Sid");
		t.add("Kachori");
		t.add("Digvijay");
		
		System.out.println(t);
	}
}
