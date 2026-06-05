import java.util.*;

public class Balancing extends CharStack {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Expression");
		String exp = s.nextLine();

		CharStack c = new CharStack(exp.length());
		char ch;

		for (int i = 0; i < exp.length(); i++) {

			char current = exp.charAt(i);

			if (current == '[' || current == '{' || current == '(') {
				c.push(current);
			}

			else if (current == ']' || current == '}' || current == ')') {

				if (c.isEmpty()) {
					System.out.println("Right parentheses are more");
					return;
				}

				ch = c.pop();

				if (!match(ch, current)) {
					System.out.println("Type mismatch");
					return;
				}
			}
		}

		
		if (c.isEmpty()) {
			System.out.println("Expression is Balanced");
		} else {
			System.out.println("Left parentheses are more");
		}
	}

	private static boolean match(char a, char b) {
		return (a == '[' && b == ']') || (a == '{' && b == '}') || (a == '(' && b == ')');
	}
}