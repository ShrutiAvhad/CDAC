package bst;

class BTNode{
	private int data;
	private BTNode left,right;
	
	public BTNode() {
		data = 0;
		left = null;
		right = null;
	}
	
	public BTNode(int d) {
		data = d;
		left = null;
		right = null;
	}
	
	public void setData(int d) {
		data = d;
		return;
	}
	
	public int getData() {
		return data;
	}
	
	public void setLeft(BTNode d) {
		left = d;
		return;
	}
	
	public BTNode getLeft() {
		return left;
	}
	
	public void setRight(BTNode d) {
		right = d;
		return;
	}
	
	public BTNode getRight() {
		return right;
	}
	
}
 public class UsingIterator {
		
	public BTNode root;

	public BTNode getRoot()
	{
		return root;
	}
	
	public UsingIterator() {
		root = null;
	}
	
	public void insert_nonrec(int d)
	{
		BTNode new_node = new BTNode(d);
		if(root == null)
		{
			root = new_node;
			return;
		}
		
		BTNode iter = root;
		BTNode par = null;
		
		while(iter != null)
		{
			par = iter;
			if(d < iter.getData())
			{
				iter =iter.getLeft();
			}
			else if(d > iter.getData())
			{	
				iter = iter.getRight();
			}
			else
			{
				System.out.println("Duplicate..");
				return;
			}
		}
		
		if(d < par.getData())
		{
			par.setLeft(new_node);
		}
		else 
		{
			par.setRight(new_node);
			return;
		}
	}
	
	public BTNode Search(int key)
	{
		if(root == null)
		{
			System.out.println("Empty");
			return null;
		}
		
		BTNode iter = root;
		
		while(iter != null)
		{
			if(key < iter.getData())
			{
				iter = iter.getLeft();
			}
			else if(key > iter.getData())
			{	
				iter = iter.getRight();
			}
			else if(key == iter.getData())
			{
				return iter;
			}
			else
			{
				System.out.println("Not found..");
			}
		}
		return null;
	}

	public BTNode min_Node()
	{
		BTNode min_Node = null;
		
		if(root == null)
		{
			System.out.println("Empty");
			return null;
		}
		
		BTNode iter = root;
		
		while(iter.getLeft() != null)
		{
			iter = iter.getLeft();
		}
		return iter;
	}
	
	public int findMin(BTNode root)
	{
	    if(root == null)
	        return Integer.MAX_VALUE;

	    int leftMin = findMin(root.getLeft());
	    int rightMin = findMin(root.getRight());

	    return Math.min(root.getData(), Math.min(leftMin, rightMin));
	}
	
	public BTNode max_Node()
	{
		BTNode max_Node = null;
		
		if(root == null)
		{
			System.out.println("Empty");
			return null;
		}
		
		BTNode iter = root;
		
		while(iter.getRight() != null)
		{
			iter = iter.getRight();
		}
		return iter;
	}
	
	
	public static void main(String[] args)
	{
		
		UsingIterator b = new UsingIterator();
		b.insert_nonrec(45);
		b.insert_nonrec(23);
		b.insert_nonrec(78);
		b.insert_nonrec(77);
		b.insert_nonrec(65);
		b.insert_nonrec(42);
		b.insert_nonrec(12);

		System.out.println("======================= Search ======================");
		
		BTNode result = b.Search(4);
		
		if(result != null )  
			System.out.println("Found");
		else
			System.out.println("Element not found");
		
		System.out.println("======================= Min-Node ======================");

		BTNode min = b.min_Node();
		
		if(min != null)
			System.out.println("Minimum for BST : "+ min.getData());
		
		System.out.print("Minimum for BT : ");
		System.out.println(b.findMin(b.getRoot()));
		
		System.out.println("======================= Max-Node ======================");

		BTNode max = b.max_Node();
		
		if(max != null)
			System.out.println("Maximium : "+ max.getData());
	}

	

 }

