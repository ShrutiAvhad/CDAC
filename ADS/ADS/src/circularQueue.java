import java.util.Scanner;

class circularQueue {

	private int arr[];
	private int front, rear;

	public circularQueue() {
		arr = new int[10];
		front = rear = -1;
	}

	public circularQueue(int s) {
		arr = new int[s];
		front = rear = -1;
	}

	public boolean isFull() {
		if (((front == 0) && (rear == arr.length - 1)) || (front == rear + 1)) {
			return true;
		} else {
			return false;
		}
	}

	public void insertCircularQueue(int d) {
		if (isFull()) 
		{
			System.out.println("Overflow");
			return;
		}
		if (front == -1)
		{
			front = rear = 0;
		}
		if (rear == arr.length - 1)
		{
			rear = 0;
		} 
		else 
		{
			rear++;
		}
		arr[rear] = d;
	}

	public boolean isEmpty() {
		if (front == -1) {
			return true;
		} else {
			return false;
		}
	}

	public int delQ() {
		int d = -999;
		if (isEmpty()) {
			System.out.println("Underflow");
			return d;
		} else {
			d = arr[front];
			if (front == rear) {
				front = rear = -1;
			} else if (front == arr.length - 1) {
				front = 0;
			} else {
				front++;
			}
		}
		return d;
	}

	public int peek() {
		int d = -999;

		if (isEmpty()) {
			System.out.println("Empty");
			return d;
		} else {
			d = arr[front];
			return d;
		}
	}

	 class Que {
		public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			circularQueue c = new circularQueue(4);

			int ch;
			int n;

			do {
				System.out.println("\n1.Insert");
				System.out.println("2.Delete");
				System.out.println("3.Peek");
				System.out.println("4.Exit");

				System.out.println("Enter your choice : ");
				ch = s.nextInt();

				switch (ch) {

				case 1:

					System.out.println("\nEnter number : ");

					n = s.nextInt();
					c.insertCircularQueue(n);
					break;

				case 2:

					n = c.delQ();
					if (n != -999) {
						System.out.println("\nDeleted number is " + n + "\n");
					}

					break;

				case 3:

					n = c.peek();
					if (n != -999)

						System.out.println("\nPeeked number is " + n + "\n");

					break;

				case 4:

					System.out.println("\nExiting...");

					break;

				default:

					System.out.println("\nInvalid choice...");

				}

			} while (ch != 4);
		}

	}
}
