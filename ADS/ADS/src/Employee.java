
import java.util.Scanner;

 class Employee {

    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

 class EmployeeStack {

    private Employee arr[];
    private int top;

    public EmployeeStack(int size) {
        arr = new Employee[size];
        top = -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Employee e) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        arr[++top] = e;
    }

    public Employee pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return null;
        }
        return arr[top--];
    }

    public Employee peek() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
            return null;
        }
        return arr[top];
    }

    public class Main {

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            EmployeeStack stack = new EmployeeStack(5);

            int ch;

            do {
                System.out.println("\n1.Push");
                System.out.println("2.Pop");
                System.out.println("3.Peek");
                System.out.println("4.Exit");

                System.out.print("Enter choice: ");
                ch = s.nextInt();

                switch (ch) {

                    case 1:
                        System.out.print("Enter ID: ");
                        int id = s.nextInt();

                        System.out.print("Enter Name: ");
                        String name = s.next();

                        System.out.print("Enter Salary: ");
                        int salary = s.nextInt();

                        stack.push(new Employee(id, name, salary));
                        break;

                    case 2:
                        Employee e1 = stack.pop();
                        if (e1 != null)
                            System.out.println("Popped: " + e1);
                        break;

                    case 3:
                        Employee e2 = stack.peek();
                        if (e2 != null)
                            System.out.println("Top: " + e2);
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (ch != 4);
        }
    }
}