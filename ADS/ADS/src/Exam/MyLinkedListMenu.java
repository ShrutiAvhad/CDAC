package Exam;

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
class LinkedList {

	private intNode head;
	
	public LinkedList() {
		head = null;
	}
	
	public void InsertFirst(int n) {
		
		intNode newNode = new intNode(n);
		
		newNode.setNext(head);
		head =  newNode;
	}

	public void InsertLast(int n) {
		
		intNode newNode = new intNode(n);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		intNode iter = head;
		
		while(iter.getNext() != null)
		{
			iter = iter.getNext();
		}
		
		iter.setNext(newNode);
	}

	public void Display() {
		
		intNode iter = head;
		
		while(iter != null)
		{
			System.out.print(iter.getData() + " -> ");
			iter = iter.getNext();
		}
		System.out.println("null");
	}

	public void InsertByPos(int n, int pos) {
		
		intNode newNode = new intNode(n);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		if(pos == 1)
		{
			InsertFirst(n);
			return;
		}
		
		intNode iter = head;
		for(int i = 1; i<pos-1 && iter.getNext() != null; i++)
		{
			iter = iter.getNext();
		}
		
		newNode.setNext(iter.getNext());
		iter.setNext(newNode);
	}

	public int DeleteFirst() {
		
		int d = -999;
		if(head == null)
		{
			System.out.println("Empty");
			return d;
		}
		
		intNode deletable = head;
		d = deletable.getData();
		head = head.getNext();
		
		deletable.setNext(null);
		deletable = null;
		
		return d;
	}

	public int DeleteLast() {
		
		intNode deletable;
		int d = -999;
		
		if(head == null)
		{
			return -999;
		}
		
		intNode iter = head;
		
		if(head.getNext() == null)
		{
			d = head.getData();
			head = null;
			return d;
		}
		
		while(iter.getNext().getNext() != null)
		{
			iter = iter.getNext();
		}
		
		deletable = iter.getNext();
		d = deletable.getData();
		deletable = null;
		iter.setNext(null);
		return d;
	}

	public int DeleteByPos(int pos) {
		int d = -999;
		if(head == null)
		{
			return d;
		}
		
		if(pos == 1)
		{
			d = DeleteFirst();
			return d;
		}
		
		intNode iter = head;
		
		for(int i = 1; i<pos-1 && iter.getNext() != null; i++)
		{
			iter = iter.getNext();
		}
		
		if(iter.getNext() != null)
		{
			intNode deletable = iter.getNext();
			iter.setNext(deletable.getNext());
			return deletable.getData();
		}
		else
		{
			System.out.println("Invalid position");
			return d;
		}	
	}

	public void InsertBefore(int n, int pos) {
		
		intNode newNode = new intNode(n);
		
		if(head == null)
		{
			System.out.println("Empty");
			return;
		}
		
		if(head.getData() == pos)
		{
			InsertFirst(n);
			return;
		}
		
		intNode iter = head;
		
		while(iter.getNext() != null && iter.getNext().getData() != pos)
		{
			iter = iter.getNext();
		}
		
		if(iter.getNext() != null)
		{
			newNode.setNext(iter.getNext());
			iter.setNext(newNode);
			return;
		}
		else
		{
			System.out.println("Invalid key");
			return;
		}
	}

	public void InsertSorted(int n) {
		
		intNode newNode = new intNode(n);
		
		if(head == null || n < head.getData())
		{
			InsertFirst(n);
			return;
		}
		
		intNode iter = head;
		
		while(iter.getNext() != null && iter.getNext().getData() < n)
		{
			iter = iter.getNext();
		}
		
		newNode.setNext(iter.getNext());
		iter.setNext(newNode);
		return;
	}

	public void AlternateNodes() {
		
		intNode iter = head;
		while(iter != null)
		{
			System.out.println(iter.getData() + " -> ");
			if(iter.getNext() == null)
				break;
			
			
				iter = iter.getNext().getNext();
		}
		System.out.println("null");	
	}	
}

public class MyLinkedListMenu {
	
 public static void main(String[] args) {
	
	 LinkedList l = new LinkedList();
	 Scanner s = new Scanner(System.in);
	 
	 int ch, n, pos;
	 
	 do 
	 {
		 System.out.println("\n================ LinkedList ===============");
		 System.out.println("1.Insert First");
		 System.out.println("2.Insert Last");
		 System.out.println("3.Insert By Position");
		 System.out.println("4.Display");
		 System.out.println("5.Delete First");
		 System.out.println("6.Delete Last");
		 System.out.println("7.Delete By Position");
		 System.out.println("8.Insert Before");
         System.out.println("9.Insert Sorted");
         System.out.println("10.Alternate Node");

		 
		 System.out.println("\nEnter choice : ");
		 ch = s.nextInt();
		 
		 switch(ch){
		 	case 1:
		 		System.out.println("Enter value : ");
		 		n = s.nextInt();
		 		l.InsertFirst(n);
		 		break;
		 		
		 	case 2:
		 		System.out.println("Enter value : ");
		 		n = s.nextInt();
		 		l.InsertLast(n);
		 		break;
		 		
		 	case 3:
		 		System.out.println("Enter Pos : ");
		 		pos = s.nextInt();
		 		
		 		System.out.println("Enter value : ");
		 		n = s.nextInt();
		 		
		 		l.InsertByPos(n, pos);
		 		break;
		 		
		 	case 4:
		 		l.Display();
		 		break;
		 		
		 	case 5:
		 		l.DeleteFirst();
		 		break;
		 		
		 	case 6:
		 		l.DeleteLast();
		 		break;
		 	
		 	case 7:
		 		System.out.println("Enter Pos : ");
		 		pos = s.nextInt();
		 		
		 		System.out.println("Enter value : ");
		 		n = s.nextInt();
		 		
		 		l.DeleteByPos(pos);
		 		break;
		 		
		 	case 8:
		 		System.out.println("Enter Pos");
		 		pos = s.nextInt();
		 		
		 		System.out.println("Enter value : ");
		 		n = s.nextInt();
		 		
		 		l.InsertBefore(n,pos);
		 		break;
		 		
		 	case 9:
		 		System.out.println("Enter value : ");
		 		n = s.nextInt();
		 		l.InsertSorted(n);
		 		break;
		 		
		 	case 10:
		 		l.AlternateNodes();
		 }
		 
	 }while(ch != 12);
	 
 }
}
