package classwork;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
			
		Class MyCls = Class.forName("classwork.EmpDoc");
		System.out.println("Class = "+ MyCls);
		
		Class SuperCls = MyCls.getSuperclass();
		System.out.println("Parent = "+SuperCls);
		
		Method method[] = MyCls.getMethods();
		System.out.println("Methods are : ");
		
		for(Method m : method)
		{
			System.out.println(m);
		}
		
		Constructor Construct[] = MyCls.getConstructors();
		System.out.println("\nConstructors are : ");
		
		for(Constructor c : Construct)
		{
			System.out.println(c);
		}
		
		Field field[] = MyCls.getFields();
		System.out.println("\n Fields are : ");
		
		for(Field f : field)
		{
			System.out.println(f);
		}
	}
}
