package classwork.Account;

public class TestAc {
	
	public static void main(String[] args) throws InterruptedException {
	
		Account a = new Account();
		
		MyThread1 t1 = new MyThread1(a);
		MyThread2 t2 = new MyThread2(a);
		
		t1.start();
		t2.start();
		
		Thread.sleep(5000);
		System.out.println("Balance = "+a.getBalance());
		
	}
}
