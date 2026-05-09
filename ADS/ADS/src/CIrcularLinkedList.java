import java.util.Scanner;

class CircularNode{
	
	private int data;
	private CircularNode next;
	
	public CircularNode()
	{
		data = 0;
	}
	
	public CircularNode(int d)
	{
		data = d;
		next = null;
	}
	
	public void setData(int d)
	{
		data = d;
	}
	
	public int getData()
	{
		return data;
	}
	
	public void setNext(CircularNode n)
	{
		next = n;
	}
	
	public CircularNode getNext()
	{
		return next;
	}
}

class CircularLL{
	
	private CircularNode last;
	
	public CircularLL()
	{
		last = null;
	}
	
	public void insertFirst(int n)
	{
		CircularNode new_node = new CircularNode(n);
		
		if(last == null)
		{
			last = new_node;
			last.setNext(last);
			return;
		}
		
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		return;
	}
	
	public void display()
	{
		if(last == null)
		{
			System.out.println("Empty..");
			return;
		}
		
		CircularNode iter = last.getNext();

		do
		{
			System.out.print(iter.getData()+" -> ");
			iter = iter.getNext();
			
		}while(iter != last.getNext());
	}
	
	public int DeleteFirst()
	{
		int d;
		if(last == null)
		{
			return -999;
		}
		
		CircularNode deletable = last.getNext();
		d = deletable.getData();
		
		if(last == deletable)
		{
			deletable.setNext(null);
			deletable = null;
			last = null;
			return d;
		}
		
		last.setNext(deletable.getNext());
		deletable.setNext(null);
		deletable = null;
		return d;
	}

	public void insertByPos(int n, int pos)
	{
		
		CircularNode new_node = new CircularNode(n);

		CircularNode iter = last.getNext();
		
		if(pos == 1)
		{
			insertFirst(n);
			return;
		}
		
		if(last == null)
		{
			System.out.println("Empty list");
			return;
		}
		
		int i=1;
		
		do
		{	
			if(i == pos - 1)
			{
				new_node.setNext(iter.getNext());
				iter.setNext(new_node);
				
				if(last == iter)
				{
					last = new_node;
				}
				return;
				
			}
			iter = iter.getNext();
			i = i + 1;
				
		}while(iter != last.getNext());
		
	}
	
}

public class CIrcularLinkedList {
	
	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	CircularLL c = new CircularLL();
	
	int ch, n, pos;

       do {
           System.out.println("\n--- Circular Linked List Menu ---\n");
           System.out.println("1. Insert First");
           System.out.println("2. Delete First");
           System.out.println("3. Insert By Pos");
           System.out.println("4. Display");
           System.out.println("5. Exit");	            

           System.out.print("Enter choice: ");
           ch = s.nextInt();
 
           switch (ch) {
               case 1:
                   System.out.print("Enter value: ");
                   n = s.nextInt();
                   c.insertFirst(n);
                   break;

               case 2:
            	   int deleted = c.DeleteFirst();
                   if (deleted != -999)
                       System.out.println("Deleted: " + deleted);
                   break;

               case 3:
            		System.out.println("Value : ");
                    n = s.nextInt();

                    System.out.println("Position : ");
                    pos = s.nextInt();
                    
                    c.insertByPos(n, pos);
                    break;
                  
               case 4:
            	   c.display();
            	   break;
      
               case 5: 
               		System.out.println("EXIT");
               	break;
               	
               
               default:
                   System.out.println("Invalid choice!");
           }

       } while (ch != 5);

       s.close();
   }
}

