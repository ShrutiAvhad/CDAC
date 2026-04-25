import java.util.Scanner;

public class UserIntStack {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		IntStack st = new IntStack(4);

		char ch;
		int n;

		do {
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Exit");

			System.out.println("Enter your choice : ");
			ch = s.next().charAt(0);

			switch (ch) {

			case '1':

				System.out.println("\nEnter number : ");

				n = s.nextInt();
				st.push(n);
				break;

			case '2':

				n = st.pop();
				if (n != -999) {
					System.out.println("\nPopped value is " + n);
				} else {
					System.out.println("isEmpty..");
				}
				break;

			case '3':

				n = st.peek();
				if (n != -999)

					System.out.println("\nPeeked value is " + n);

				break;

			case '4':

				System.out.println("\nExiting...");

				break;

			default:

				System.out.println("\nInvalid choice...");

			}

		} while (ch != '4');

	}
}
