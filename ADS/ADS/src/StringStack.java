
public class StringStack {

	private String[] arr;
	private int top;

	public StringStack() {
		top = -1;
		arr = new String[2];
	}

	public StringStack(int s) {
		top = -1;
		arr = new String[s];
	}

	public Boolean isFull() {
		if (top == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void push(String n) {
		if (isFull()) {
			System.out.println("Overflow");
			return;
		}
		top++;
		arr[top] = n;
		return;
	}

	public String peek() {
		String d = "null";
		if (!(isEmpty())) {
			return arr[top];
		} else {
			return d;
		}
	}

	private boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public String pop() {
		String d = "null";
		if (isEmpty()) {
			System.out.println("\nEmpty Stack");

			return d;
		} else {

			d = arr[top];
			top--;
			return d;
		}
	}

}
