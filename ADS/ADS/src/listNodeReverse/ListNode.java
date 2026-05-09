package listNodeReverse;

public class ListNode {

    int data;
    ListNode next;
    static ListNode head;   // shared head

    public ListNode(int d) {
        data = d;
        next = null;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode n) {
        next = n;
    }

    // allow calling getHead() from object
    public ListNode getHead() {
        return head;
    }

    public static void setHead(ListNode h) {
        head = h;
    }

    // reverse
    public static ListNode reverse(ListNode head) {
        if (head == null || head.getNext() == null)
            return head;

        ListNode temp = reverse(head.getNext());

        head.getNext().setNext(head);
        head.setNext(null);

        return temp;
    }

    // print
    public static void print(ListNode h) {
        ListNode t = h;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // create list
        ListNode list = new ListNode(1);
        list.setNext(new ListNode(2));
        list.getNext().setNext(new ListNode(3));
        list.getNext().getNext().setNext(new ListNode(4));

        setHead(list); // store head

        System.out.print("Original: ");
        print(head);

        // ✅ YOUR LINE (fixed syntax only)
        list = reverse(list.getHead());

        System.out.print("Reversed: ");
        print(list);
    }
}