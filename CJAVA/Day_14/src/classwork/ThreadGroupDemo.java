package classwork;

public class ThreadGroupDemo extends Thread{
	
	public ThreadGroupDemo() {}
	
	public ThreadGroupDemo(ThreadGroup tg, String name)
	{
		super(tg, name);
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {

		ThreadGroup tg = new ThreadGroup("MyGroup");

        ThreadGroupDemo t1 = new ThreadGroupDemo(tg, "Thread-1");
        ThreadGroupDemo t2 = new ThreadGroupDemo(tg, "Thread-2");
        ThreadGroupDemo t3 = new ThreadGroupDemo(tg, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Thread Group Name: " + tg.getName());
        System.out.println("Active Threads: " + tg.activeCount());
    }

}
