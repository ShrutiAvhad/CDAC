import java.util.Scanner;

public class UserStringStack {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringStack str = new StringStack();

		int ch;
		String n;

		do {
			System.out.println("\n1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Exit");

			System.out.println("Enter your choice : ");
			ch = s.nextInt();

			switch (ch) {

			case 1:

				System.out.println("\nEnter String : ");

				n = s.next();
				str.push(n);
				break;

			case 2:

				n = str.pop();
				if (n != null) {
					System.out.println("\nPopped string is " + n +"\n");
				}

				break;

			case 3:

				n = str.peek();
				if (n != null)

					System.out.println("\nPeeked string is " + n+"\n");

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
