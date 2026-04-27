import java.util.LinkedList;
import java.util.Scanner;

class intNode{
	private int data;
	private intNode next;
	
	public intNode(int d) {
		data = d;
		next = null;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int d) {
		data = d;
	}
	
	public intNode getNext() {
		return next;
	}
	
	public void setNext(intNode n) {
		next = n;
	}
}

class LinkedListm {
	private intNode head;
	
	public LinkedListm() {
		head = null;
	}
	
	public void insertFirst(int d) {
		intNode newNode = new intNode(d);
		
		newNode.setNext(head);
		head = newNode;
	}
	
	public void insertLast(int d) {
		intNode newNode = new intNode(d);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		intNode itr = head;
		while(itr.getNext() != null)
		{
			itr = itr.getNext();
		}
		itr.setNext(newNode);
	}
	
	public void display() 
	{
		intNode itr = head;
		
		while(itr != null)
		{
			System.out.print(itr.getData() + " -> ");
			itr = itr.getNext();
		}
		System.out.println("null");
	}
	
	public int deleteFirst()
	{
		int d = -999;
		if(head == null)
		{
			return d;
		}
		
			intNode deletable = head;
			d = deletable.getData();
			head = head.getNext();
			
			deletable.setNext(null);
			deletable = null;
			
			return d;
		
	}
	
	public void insert_byPos(int d, int pos)
	{
		intNode new_node = new intNode(d);
		
		if(head == null)
		{
			head = new_node;
			return;
		}
		
		if(pos == 1)
		{
			insertFirst(d);
			return;
		}
		
		intNode iter = head;
		
		for(int i = 1; i<pos-1 && iter.getNext() != null; i++)
		{
			iter = iter.getNext();
			return;
		}
		
		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
	}
	
	public int delete_byPos(int pos)
	{
		intNode deletable = null;
		int d = -999;
		
		if(head == null)
		{
			return d;
		}
		if(pos == 1)
		{
			d = deleteFirst();
			return d;
		}
		
		intNode iter = head;
		
		for(int i = 1; i<pos-1 && iter.getNext() != null; iter = iter.getNext(),i++)
		{
			deletable = iter.getNext();	
		}
		
			if(iter.getNext() != null)
			{
				iter.setNext(deletable.getNext());
				d = deletable.getData();
				deletable.setNext(null);
				return d;
			}
			else
			{
				System.out.println("Position Invalid..");
				return -999;
			}		
	}
	
	public int deleteLast()
	{
		intNode deletable = null;
		int d = -999;
		
		if(head == null)
		{
			return -999;
		}
		
		intNode iter = head;
		
		if(head.getNext() == null)
		{
			d =  head.getData();
			head = null;
			return d;
		}
		
		while(iter.getNext().getNext() != null)
			iter = iter.getNext();
		
		deletable = iter.getNext();
		d = deletable.getData();
		deletable = null;
		iter.setNext(null);
		return d;
	}
	
	public void insertBefore(int d, int pos)
	{
		intNode new_node = new intNode(d);
		
		if(head == null)
		{
			System.out.println("List is Empty..");
			return;
		}
		if(head.getData() == pos)
		{
			insertFirst(d);
			return;
		}
		
		intNode iter = head;
		while(iter.getNext() != null && iter.getNext().getData() != pos)
			iter = iter.getNext();
		if(iter.getNext() != null)
		{
			new_node.setNext(iter.getNext()); 
			iter.setNext(new_node);
			return;
		}
		else 
		{
			System.out.println("Invalid key..");
			return;
		}
	}
	
	public void insertSorted(int d)
	{
		intNode new_node = new intNode(d);
		
		if((head == null) || (d < head.getData()))
		{
			insertFirst(d);
			return;
		}
		
		intNode iter = head;
		while(iter.getNext() != null && iter.getNext().getData() < d)
		{
			iter = iter.getNext();
		}
		
		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		return;
	}
	
	public void  AlternateNodes()
	{
		intNode iter = head;
		
		while(iter != null)
		{
			System.out.println(iter.getData() +"->");
			if(iter.getNext() == null)
			{
				break;
			}
			else
			{
				iter.getNext().getNext();
			}
		}
	}
	
	public int findMiddle()
	{
		intNode slow, fast;
		slow = fast = head;
		while(fast != null && fast.getNext() != null)
		{
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow.getData();
	}
	
	public void ReverseNodes()
	{
		intNode prev = null;
	    intNode curr = head;
	    intNode next;
	    
		while(curr != null)
		{
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	public int Cnt()
	{
		int count = 0;
		intNode iter = head;
		
		while(iter != null)
		{
			count++;
			iter = iter.getNext();
		}
		return count;
	}
	
}
	public class MyLinkedListMenu {
	    public static void main(String[] args) {
	     
	    	LinkedListm l = new LinkedListm();
	        Scanner s = new Scanner(System.in);
	
	        int choice, n, pos;
	
	        do {
	            System.out.println("\n--- Linked List Menu ---\n");
	            System.out.println("1. Insert First");
	            System.out.println("2. Insert Last");
	            System.out.println("3. Display");
	            System.out.println("4. deleteFirst");
	            System.out.println("5. insert_byPos");
	            System.out.println("6. delete_byPos");
	            System.out.println("7. deletelast");
	            System.out.println("8. insertBefore");
	            System.out.println("9. insertSorted");
	            System.out.println("10. Alternate nodes");	
	            System.out.println("11. Find Middle");	
	            System.out.println("12. Reverse");	            
	            System.out.println("13. Exit");	            

	            System.out.print("Enter choice: ");
	            choice = s.nextInt();
	
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value: ");
	                    n = s.nextInt();
	                    l.insertFirst(n);
	                    break;
	
	                case 2:
	                    System.out.print("Enter value: ");
	                    n = s.nextInt();
	                    l.insertLast(n);
	                    break;
	
	                case 3:
	                	 l.display();
		                    break;
	                   
	                case 4:
	                	int deleted = l.deleteFirst();
	                    if (deleted != -999)
	                        System.out.println("Deleted: " + deleted);
	                    break;
	
	                case 5:
	                    System.out.println("Value : ");
	                    n = s.nextInt();

	                    System.out.println("Position : ");
	                    pos = s.nextInt();
	                    
	                    l.insert_byPos(n, pos);
	                    break;
	                    
	                case 6:

	                    System.out.println("Position : ");
	                    pos = s.nextInt();
	                    
	                    l.delete_byPos(pos);
	                    break;
	                 
	                case 7:
	                	l.deleteLast();
	                	
	                case 8: 
	                	System.out.println("Enter value : ");
	                	n = s.nextInt();
	                
	                	System.out.println("Enter Position");
	                	pos = s.nextInt();
	                	
	                	l.insertBefore(n, pos);
	                	
	                case 9:
	                	System.out.println("Enter value : ");
	                	n = s.nextInt();
	                	l.insertSorted(n);
	                	
	                case 10:
	                	l.AlternateNodes();
	                	
	                case 11:
	                	l.findMiddle();
	                	
	                case 12:
	                	l.ReverseNodes();
	                	
	                case 13:
	                	l.Cnt();
	                	
	                case 14: 
	                	System.out.println("EXIT");
	                	break;
	                	
	                
	                default:
	                    System.out.println("Invalid choice!");
	            }
	
	        } while (choice != 12);
	
	        s.close();
	    }
	
	
	}












