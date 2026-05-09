import java.util.Scanner;

class DoublyNode{
	private int data;
	private DoublyNode prev,next;
	
	public DoublyNode()
	{
		data = 0;
		prev = next = null;
	}
	
	public DoublyNode(int d)
	{
		data = d;
		prev = next = null;
	}
	
	public void setData(int d)
	{
		data = d;
	}
	
	public int getData()
	{
		return data;
	}
	
	public void setPrev(DoublyNode d)
	{
		prev = d;
	}
	
	public DoublyNode getPrev()
	{
		return prev;
	}
	
	public void setNext(DoublyNode d)
	{
		next = d;
	}
	
	public DoublyNode getNext()
	{
		return next;
	}
}

class DoublyLL{
	
	private DoublyNode head;
	
	public DoublyLL()
	{
		head = null;
	}
	
	public void insertFirst(int d)
	{
		DoublyNode new_node = new DoublyNode(d);
		
		if(head == null)
		{
			head = new_node;
			return;
		}
		
		new_node.setNext(head);
		head.setPrev(new_node);
		head = new_node;
		return;
	}
	
	public void insertLast(int d)
	{
		DoublyNode new_node = new DoublyNode(d);
		
		if(head == null)
		{
			head = new_node;
			return;
		}
		
		DoublyNode iter = head;
		
		while(iter.getNext() != null)
			iter = iter.getNext();
		
		new_node.setPrev(iter);
		iter.setNext(new_node);
		return;
	}
	
	public void insertByPos(int n, int pos)
	{
		DoublyNode new_node = new DoublyNode(n);
			
		if(head == null)
		{
			head = new_node;
			return;
		}
		
		if(pos == 1)
		{
			insertFirst(n);
			return;
		}
		
		DoublyNode iter = head;
		for(int i = 1; i < pos-1 && iter.getNext() != null; i++)
		{
			iter = iter.getNext();
		}
		
		new_node.setNext(iter.getNext());
		new_node.setPrev(iter);
		
		if(iter.getNext() != null)
		{
			iter.getNext().setPrev(new_node);
		}
		
		iter.setNext(new_node);
		return;
		
	}
	
	public int DeleteFirst()
	{
		DoublyNode deletable;
		int d = -999;
		
		if(head == null)
		{
			return d;
		}
		
		deletable = head;
		d = deletable.getData();
		head = head.getNext();
		deletable.setNext(null);
		deletable = null;
		return d;
	}
	
	public int deleteLast()
	{
		if(head == null)
		{
			return -999;
		}
		
		int d;
		DoublyNode deletable, iter = head;
		
		while(iter.getNext().getNext() != null)
		{
			iter = iter.getNext();
		}
		
		deletable = iter.getNext();
		iter.setNext(null);
		d = deletable.getData();
		deletable.setPrev(null);
		deletable = null;
		return d;
	}
	
	public int deleteByPos(int pos)
	{
		if(head == null)
		{
			return -999;
		}
		
		if(pos == 1)
		{
			return DeleteFirst();
		}
		
		int d;
		DoublyNode deletable, iter = head;
		
		while(iter.getNext().getNext() != null)
		{
			iter = iter.getNext();
		}
		
		deletable = iter.getNext();
		iter.setNext(iter.getNext().getNext());
		deletable.getNext().setPrev(iter);
		d = deletable.getData();
		deletable.setPrev(null);
		return d;
	}
	
	public void display() 
	{
		DoublyNode iter = head;
		
		while(iter != null)
		{
			System.out.print(iter.getData() + " -> ");
			iter = iter.getNext();
		}
		System.out.println("null");
	}
}	
	public class DoublyLinkedList {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			DoublyLL dl = new DoublyLL();
			
			 int ch, n, pos;
				
		        do {
		            System.out.println("\n--- Doubly Linked List Menu ---\n");
		            System.out.println("1. Insert First");
		            System.out.println("2. Insert Last");
		            System.out.println("3. Delete First");
		            System.out.println("4. insert_byPos");
		            System.out.println("5. Delete Last");
		            System.out.println("6. Display");
		            System.out.println("7. Exit");	            

		            System.out.print("Enter choice: ");
		            ch = s.nextInt();
		
		            switch (ch) {
		                case 1:
		                    System.out.print("Enter value: ");
		                    n = s.nextInt();
		                    dl.insertFirst(n);
		                    break;
		
		                case 2:
		                    System.out.print("Enter value: ");
		                    n = s.nextInt();
		                    dl.insertLast(n);
		                    break;
		
		                case 3:
		                	int deleted = dl.DeleteFirst();
		                    if (deleted != -999)
		                        System.out.println("Deleted: " + deleted);
		                    break;
		                   
		                case 4:
		                	System.out.println("Value : ");
		                    n = s.nextInt();

		                    System.out.println("Position : ");
		                    pos = s.nextInt();
		                    
		                    dl.insertByPos(n, pos);
		                    break;
		                    
		                case 5:
		                	dl.deleteLast();
		       
		                case 6: 
		                	System.out.println("EXIT");
		                	break;
		                	
		                
		                default:
		                    System.out.println("Invalid choice!");
		            }
		
		        } while (ch != 6);
		
		        s.close();
		    }
		}












