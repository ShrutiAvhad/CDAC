//
import java.util.Scanner;
//
//class intNode {
//    private int data;
//    private intNode next;
//
//    
//    public intNode(int d) {
//        data = d;
//        next = null;
//    }
//
//    public int getData() {
//        return data;
//    }
//
//    public void setData(int d) {
//        data = d;
//    }
//
//    public intNode getNext() {
//        return next;
//    }
//
//    public void setNext(intNode n) {
//        next = n;
//    }
//}


class LinkedList {
    private intNode head;

   
    public LinkedList() {
        head = null;
    }

  
    public void insertFirst(int d) {
        intNode newNode = new intNode(d);

        newNode.setNext(head);
        head = newNode;
    }

   
    public void insertLast(int d) {
        intNode newNode = new intNode(d);

        if (head == null) {
            head = newNode;
            return;
        }

        intNode itr = head;
        while (itr.getNext() != null) {
            itr = itr.getNext();
        }

        itr.setNext(newNode);
    }

    
    public void display() {
        intNode itr = head;

        while (itr != null) {
            System.out.print(itr.getData() + " -> ");
            itr = itr.getNext();
        }

        System.out.println("null");
    }

   
    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -999;
        }

        int data = head.getData();
        head = head.getNext();
        return data;
    }
    
    
}

public class MyLinkedList {
    public static void main(String[] args) {
     
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);

        int choice, value;

        do {
            System.out.println("\n--- Linked List Menu ---");
            System.out.println("1. Insert First");
            System.out.println("2. Insert Last");
            System.out.println("3. Delete First");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    list.insertFirst(value);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    list.insertLast(value);
                    break;

                case 3:
                    int deleted = list.deleteFirst();
                    if (deleted != -999)
                        System.out.println("Deleted: " + deleted);
                    break;

                case 4:
                    list.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}