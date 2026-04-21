package classwork;

public class JoinDemo implements Runnable{

	@Override
	public void run() {
		
		for(int i = 1; i<=3; i++)
		{
			System.out.println(Thread.currentThread().getName() +" "+ i);
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
 
	public static void main(String[] args) throws InterruptedException {
		
		JoinDemo j1 = new JoinDemo();
		
		Thread t1 = new Thread(j1, "One");
		Thread t2 = new Thread(j1, "Two");
		Thread t3 = new Thread(j1, "Three");

		t1.start();
		System.out.println(t1.isAlive());
		t1.join();
		System.out.println(t1.isDaemon());
		System.out.println( );
		
		t2.start();
		t2.join();
		System.out.println(t2.isAlive());
		System.out.println(t2.isDaemon());
		System.out.println( );

		System.out.println(t3.isAlive());
		System.out.println(t3.isDaemon());
		t3.start();
		t3.join();
	}
}
