package classwork;

import java.util.function.BiConsumer;

public class BiconsumerDemo {
	
	public static void main(String[] args) {
		BiConsumer <Integer,Integer> b = (x,y) ->{System.out.println(x+" "+y);};
		b.accept(10, 20);
		
		BiConsumer <String,String> b1 = (x,y) ->{System.out.println(x.concat(y));};
		b1.accept("Infoway", " Pune");
	}
}
