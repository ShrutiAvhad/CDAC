package Assignment;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class Book {
	
	private String isbn;
	private String title;
	private String Author;
	private int copies;
	
	
    private Queue<String> waitingList = new LinkedList<>();

	public Book() {}
	
	public Book(String isbn, String title, String author, int copies) {
		super();
		this.isbn = isbn;
		this.title = title;
		Author = author;
		this.copies = copies;
	}


	@Override
	public String toString() {
		return "\nBook [isbn = " + isbn + ", title = " + title + ", Author = " + Author + ", copies = " + copies + "]\n";
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return Author;
	}


	public void setAuthor(String author) {
		Author = author;
	}


	public int getCopies() {
		return copies;
	}


	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	public Queue<String> getWaitingList()
	{
		return waitingList;
	}
	
	public void borrow(String user)
	{
		if(copies > 0)
		{
			copies--;
			System.out.println(user+" Borrowd "+ title);
		}
		else
		{
			waitingList.add(user);
			System.out.println(" Copies not available "+ user + "added to list");
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("============== HashMap =============");
		Scanner s = new Scanner(System.in);
		HashMap <String, Book> h = new HashMap <String, Book>();
		
		h.put("101", new Book("101", "Java Programming", "James Gosling", 5));
		h.put("102", new Book("102", "Python Basics", "Guido van Rossum", 3));
		h.put("103", new Book("103", "Data Structures", "Mark Allen", 7));
		h.put("104", new Book("104", "Operating System", "Galvin", 4));	
		h.put("105", new Book("105", "Web Technologies", "Sir", 8));	
		h.put("106", new Book("106", "Meow", "Meow", 4));	

		System.out.println(h);
		
		System.out.println("============== Search =============");

		System.out.println("Enter ISBN : ");
		String id = s.next();
		
		h.values().stream().filter(i -> i.isbn.equals(id)).forEach(System.out::println);
	
		System.out.println("============== TreeSet Sort =============");

		TreeSet <Book> t = new TreeSet<Book>(Comparator.comparing(Book::getTitle));
		t.addAll(h.values());
		System.out.println(t);
		
		System.out.println("============== Borrow  =============");
		
		System.out.println("\nEnter ISBN to borrow : ");
		String bid = s.next();
		
		if(h.containsKey(bid)) {
			System.out.println("Enter name ; ");
			String user = s.next();
			h.get(bid).borrow(user);
		}
		else
		{
			System.out.println("Book not found");
		}
		
		System.out.println("=============== List ===============");
		for(Book b : h.values())
		{
			if(!b.getWaitingList().isEmpty())
			{
				System.out.println("Book : "+b.getTitle());
				System.out.println("Waitin Users : "+b.getWaitingList());
			}
		}
		s.close();
	}
	
}































