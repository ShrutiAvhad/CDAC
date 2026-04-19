package classwork3;

public class HelloWorldLambda {
	
	public static void main(String[] args) {
		
		HelloWorldInterface h = () -> {return "Hello";};
		//HelloWorldInterface h = () -> "Hello";
		
		System.out.println(h.sayHello());
		h.get();
		HelloWorldInterface.getNo();
	}
}
