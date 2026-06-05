package classwork;

public class EnumerateDemo {
	
	public static void main(String[] args) {
			
		ThreadGroup Parent = Thread.currentThread().getThreadGroup().getParent();
		System.out.println(Parent);
		
		System.out.println("Count = "+Parent.activeCount());
		Thread t[] = new Thread[Parent.activeCount()];
		Parent.enumerate(t);
		
		for(Thread t1 : t)
		{
			System.out.println(t1.getName());
		}
	}
}
