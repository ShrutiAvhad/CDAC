package Classwork.Wrapper;

//public class A<T extends Number>

public class A<T> {
	
	T t ;
	
	public void add(T t)
	{
		this.t = t;
	}
	
	public T getT()
	{
		return t;
	}
	
	public static void main(String[] args) {
		
		A <Integer> a = new A <Integer>();
		A <Object> a1 = new A <Object>();	
		System.out.println(a);
		System.out.println(a1.getT());
	}
	
}
