package Exam;

class Stud{
	
	private int rno;
	private String name;
	private int age;
	
	public Stud(int rno, String name, int age) {
		super();
		this.rno = rno;
		this.name = name;
		this.age = age;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Stud [rno=" + rno + ", name=" + name + ", age=" + age + "]";
	}
}

class StudNode{
	
	private Stud data;
	private StudNode next;
	
	public StudNode(Stud data) {
		super();
		this.data = data;
		this.next = null;
	}

	public Stud getData() {
		return data;
	}

	public void setData(Stud data) {
		this.data = data;
	}

	public StudNode getNext() {
		return next;
	}

	public void setNext(StudNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "StudNode [data=" + data + ", next=" + next + "]";
	}
}

class LinkedListStud{
	
	private StudNode head;

	public StudNode getHead() {
		return head;
	}

	public void setHead(StudNode head) {
		this.head = head;
	}

	public void InsertFirst(Stud d) 
	{
		
		StudNode newNode = new StudNode(d);
		
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		newNode.setNext(head);
		head = newNode;
		return;
	}
	
	public void InsertMid(Stud d)
	{
		StudNode newNode = new StudNode(d);
		
		if(head == null)
		{
			System.out.println("Empty");
			return;
		}
		
		StudNode slow, fast;
		slow = fast = head;
		
		while(fast != null && fast.getNext() != null)
		{
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		
		newNode.setNext(slow.getNext());
		slow.setNext(newNode);
		
	}
	
	public void InsertLast(Stud d)
	{
		StudNode newNode = new StudNode(d);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		StudNode iter = head;
		
		while(iter.getNext() != null)
		{
			iter = iter.getNext();
		}
		
		iter.setNext(newNode);
		return;
	}
	
	public void Display()
	{
		StudNode iter = head;
		
		while(iter != null)
		{
			System.out.println(iter.getData());
			iter = iter.getNext();
		}
		System.out.println("null");
	}
	
	public Stud DeleteFirst()
	{
		
		if(head == null)
		{
			return null;
		}
		
		StudNode deletable = head;
		Stud d = deletable.getData();
		head = head.getNext();
		
		deletable.setNext(null);
		deletable = null;
		
		return d;
	}
	
	
	public void DeleteMiddle() {
		
		StudNode deletable;
		Stud d = null;

		StudNode slow, fast, prev;
		slow = fast = head;
		prev = null;
		
		while(fast != null && fast.getNext() != null)
		{
			prev = slow;
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		
		prev.setNext(slow.getNext());
		slow.setNext(null);
		
		
	}

	
	
	public Stud DeleteLast()
	{
		StudNode deletable;
		Stud d = null;
		
		if(head == null)
		{
			return null;
		}
		
		StudNode iter = head;
		
		if(head.getNext() == null)
		{
			d = head.getData();
			head = null;
			return d;
		}
		
		while(iter.getNext().getNext() != null)
			iter = iter.getNext();
		
		deletable = iter.getNext();
		d = deletable.getData();
		iter.setNext(null);
		deletable = null;
		return d;
	}

	
	
}

public class StudLL {

	public static void main(String[] args) {
		LinkedListStud ll = new LinkedListStud();
		
		System.out.println("========== Insert First and Last =========\n");
		ll.InsertFirst(new Stud(10, " Shruti ", 24));
		ll.InsertLast(new Stud(20, " Adi ", 24));
		ll.InsertLast(new Stud(30, " Amman ", 23));
		ll.InsertLast(new Stud(40, " Shrirang ", 25));
		ll.InsertLast(new Stud(50, " Aditi ", 24));

		System.out.println("\n============ Display =============\n");
		ll.Display();
		
		System.out.println("\n=============== Delete First ===============\n");
		Stud deleted = ll.DeleteFirst();
		if(deleted != null)
			System.out.println("Deleted First : " + deleted);

		
		System.out.println("\n============== Delete Last ==============\n");
		Stud delete = ll.DeleteLast();
		if(delete != null)
			System.out.println("Deleted Last : " + delete);

		System.out.println("\n============ Insert Middle ============\n");
		ll.InsertMid(new Stud(20, " Shahrukh khan", 40));
		ll.Display();
		
		System.out.println("\n============ Delete Middle ============\n");
		ll.DeleteMiddle();
		ll.Display();

	}
}
