package classwork2.Exception;

public class Demo {
	
	public static void msg() {
		int no = 10/0;
		System.out.println("no = "+no);
	}
	
	public static void getmsg() {
		msg();
	}
	
	public static void main(String[] args) {
		Demo.getmsg();
		System.out.println("End of the program !");
	}
}
