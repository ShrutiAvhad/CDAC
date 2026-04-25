import java.util.Scanner;

class intQueue {

	private int arr[];
	private int front, rear;

	public intQueue() {
		arr = new int[10];
		front = rear = -1;
	}

	public intQueue(int s) {
		arr = new int[s];
		front = rear = -1;
	}

	public boolean isFull() {
		if (rear == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void insertQ(int d) {
		if (isFull()) {
			System.out.println("Overflow");
			return;
		}
		if (front == -1) {
			front = 0;
		} else {
			rear = rear + 1;
			arr[rear] = d;
			return;
		}
	}

	public boolean isEmpty() {
		if ((front == -1) || (front == rear + 1)) {
			return true;
		} else {
			return false;
		}
	}

	public int delQ() {
		int d = -999;
		if (isEmpty()) {
			return d;
		} else {
			d = arr[front];
			front++;
			return d;
		}
	}

	public int peek() {
		int d = -999;
		if (isEmpty()) {
			return d;
		} else {
			d = arr[front];
			return d;
		}
	}

	public class Main {

		public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			intQueue q = new intQueue(4);

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

					System.out.println("\nEnter String : ");

					n = s.nextInt();
					q.insertQ(n);
					break;

				case 2:

					n = q.delQ();
					if (n != -999) {
						System.out.println("\nDeleted number is " + n + "\n");
					}

					break;

				case 3:

					n = q.peek();
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
