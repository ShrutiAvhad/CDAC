package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Product {

	private int pid;
	private String name;
	private double price;
	
	public Product() {}
	
	public Product(int pid, String name, double price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nProduct [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		
		Map<Integer, Product>m = new HashMap<Integer, Product>();
		
		m.put(1,new Product (1, "Lipstick", 4500));
		m.put(2,new Product (2, "Blush", 1100));
		m.put(3,new Product (3, "Eye Liner", 900));
		m.put(4,new Product (4, "Mascara", 700));
		m.put(5,new Product (5, "Setting Spray", 4000));

		System.out.println(m);
		
		List <Product> cart = new ArrayList<>();
		Stack <String> h = new Stack<>();
		System.out.println("\n=============== Add =================");
		
		char ch;
		do{
			System.out.println("Add product to cart : ");
			int id = s.nextInt();
			
			Product p = m.get(id);
			
			if(p != null)
			{
				cart.add(p);
				System.out.println("Added to cart : "+p);
			}
			else
			{
				System.out.println("Product not found");
			}
			
			System.out.println("Add more ? (Y/N)");
			ch = s.next().charAt(0);
			
		}while(ch == 'Y'|| ch =='y');
		
		System.out.println("\n================= Display ================");
		
		System.out.println(cart);
		double total = cart.stream().mapToDouble(Product::getPrice).sum();
		System.out.println("Total = "+total);
		
		System.out.println("\n================= Remove ================");
		
		char ch1;

		do 
		{
			System.out.println("Remove from cart : ");
			int r = s.nextInt();
			
			Product removep = null;

			for(Product p : cart)
			{
				if(p.getPid() == r)
				{
					removep = p;
				}
			}
			
			if(removep != null)
			{
				cart.remove(removep);
				System.out.println("Remove from cart : "+r);
			}
			else
			{
				System.out.println("Product not found");
			}
			
			System.out.println("Remove more ? (Y/N)");
			ch1 = s.next().charAt(0);
			
			cart.forEach(System.out::println);

		}while(ch1 == 'Y' || ch1 == 'y');
		
		System.out.println("===================== History ====================");
		
		for(int i = h.size() - 1; i >= 0; i--) {
		    System.out.println(h.get(i));
		}
	}
}






































