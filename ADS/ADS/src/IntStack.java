
public class IntStack {

	private int arr[];
	private int top;

	public IntStack() {
		top = -1;
		arr = new int[4];
	}

	public IntStack(int s) {
		top = -1;
		arr = new int[s];
	}

	public Boolean isFull() {
		if (top == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void push(int n) {
		if (isFull()) {
			System.out.println("Overflow");
			return;
		}
		else
		{
			top++;
			arr[top] = n;
			return;
		}
	}

	public int peek() {
		int d = -999;
		if (!(isEmpty())) {
			return arr[top];
		} else {
			return d;
		}
	}

	private boolean isEmpty() {
		if (top == -1) {
			return true;
		} 
		else 
		{
			return false;
		}
	}

	public int pop() {
		int d = -999;
		if (isEmpty()) {
			System.out.println("\nEmpty Stack");

			return d;
		} 
		else 
		{
			d = arr[top];
			top--;
			System.out.println("\nPopped value is " + d);
			return d;
		}
	}

}
