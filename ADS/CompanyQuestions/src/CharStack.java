
public class CharStack {

	private char arr[];
	private int top;

	public CharStack() {
		top = -1;
		arr = new char[4];
	}

	public CharStack(int s) {
		top = -1;
		arr = new char[s];
	}

	public Boolean isFull() {
		if (top == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void push(char n) {
		if (isFull()) {
			System.out.println("Overflow");
			return;
		}
		top++;
		arr[top] = n;
		return;
	}

	public char peek() {
		char d = 'a';
		if (!(isEmpty())) {
			return arr[top];
		} else {
			return d;
		}
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public char pop() {
		char d = 'a';
		if (isEmpty()) {
			System.out.println("\nEmpty Stack");

			return d;
		} else {

			d = arr[top];
			top--;
			System.out.println("\nPopped value is " + d);
			return d;
		}
	}

}
