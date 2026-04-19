package classwork;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.METHOD, ElementType.CONSTRUCTOR,ElementType.TYPE,ElementType.FIELD})
	@Documented
		
	public @interface MyAnnotation {
	
		String info();
	}
	
	
