package classwork2.Exception;

public class Demo4 {
	public static void main(String[] args) {
		A a = new A();
		double d;
		
		try {
			d = a.div(2,5);
			if(d<1);
			{
				throw new MyException();
			}	
			
		}catch(MyException e){
			System.out.println(e);
		}
	}
}
