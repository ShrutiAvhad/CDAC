import java.util.Scanner;

public class UserCharStack {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CharStack c = new CharStack(4);

		int ch;
		char n;

		do {
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Exit");

			System.out.println("Enter your choice : ");
			ch = s.nextInt();

			switch (ch) {

			case 1:

				System.out.println("\nEnter Character : ");

				n = s.next().charAt(0);
				c.push(n);
				break;

			case 2:

				n = c.pop();
				if (n != -999) {
					System.out.println("\nPopped character is " + n);
				}

				break;

			case 3:

				n = c.peek();
				if (n != -999)

					System.out.println("\nPeeked character is " + n);

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
