package classwork.Account;

public class Account {
	
	private int balance;
	
	public Account() {
		balance = 5000;
	}
	
	public synchronized void deposit(int amt) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+" Started");
		int temp;
		temp = balance;
		temp += amt;
		System.out.println(" temp "+temp);
		Thread.currentThread().sleep(1000);
		balance = temp;
		System.out.println(Thread.currentThread().getName()+" comlpleted "+" "+balance);
	}
	
	public int getBalance() {
		return balance;
	}
}
