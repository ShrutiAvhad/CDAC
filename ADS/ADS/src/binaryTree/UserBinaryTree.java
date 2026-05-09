package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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

class BinaryTree{
	
	private BTNode root;
	
	public BinaryTree() {
		root = null;
	}
	
	public void setRoot(BTNode r) {
		root = r;
	}
	
	public BTNode getRoot() {
		return root;
	}
	
	public BTNode createNode(int d) {
		BTNode new_node = new BTNode(d);
		return new_node;
	}

	public void visitPreOrder(BTNode r) {
	
		if(r == null)
			return;
		System.out.print(" " + r.getData());
		visitPreOrder(r.getLeft());
		visitPreOrder(r.getRight());
	}

	public void PreOrder() {
		
		visitPreOrder(root);
	}

	public void display_Levelwise() {
		
		if(root == null)
		{
			System.out.println("Empty..");
			return;
		}
		
		BTNode iter;
		
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			iter = q.remove();
			System.out.print(" " + iter.getData());
			
			if(iter.getLeft() != null)
				q.add(iter.getLeft());
			
			if(iter.getRight() != null)
				q.add(iter.getRight());
		}
	}

	public void display_LeafNode() {
		
		if(root == null)
		{
			System.out.println("Empty..");
			return;
		}
		
		Queue<BTNode>q = new LinkedList<BTNode>();
		
		BTNode iter;
		
		q.add(root);
		
		while(!q.isEmpty())
		{
			iter = q.remove();
			if((iter.getLeft() == null) && (iter.getRight() == null))
			{
				System.out.print(iter.getData()+ " ");
			}
			
			if(iter.getLeft() != null) 
				q.add(iter.getLeft());
			
			if(iter.getRight() != null)
				q.add(iter.getRight());
		}
	}

	public void display_NonLeafNode() {
		
		if(root == null)
		{
			System.out.println("Empty..");
			return;
		}
		
		Queue<BTNode>q = new LinkedList<BTNode>();
		
		BTNode iter;
		q.add(root);
		while(!q.isEmpty())
		{
			iter = q.remove();
			if((iter.getLeft() != null) || (iter.getRight() != null))
			{
			System.out.print(iter.getData()+" ");
			}
			if(iter.getLeft() != null) 
				q.add(iter.getLeft());
			
			if(iter.getRight() != null)
				q.add(iter.getRight());
		}
	}
	public void insertBTNodes(int n) {
		
		BTNode new_node = new BTNode(n);
		
		if(root == null)
		{
			root = new_node;
			return;
		}
		
		Queue<BTNode> q = new LinkedList<>();	
		
		q.add(root);
		
		BTNode iter;
		while(!q.isEmpty())
		{
			iter = q.remove();
			
			if(iter.getLeft() == null)
			{
				iter.setLeft(new_node);
				return;
			}
			else
			{
				q.add(iter.getLeft());
			}
			
			if(iter.getRight() == null)
			{
				
				iter.setRight(new_node);
				return;
			}
			else
			{
				q.add(iter.getRight());
			}
		}
	}
}
public class UserBinaryTree {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		BinaryTree bt = new BinaryTree();
		bt.setRoot(bt.createNode(50));
		bt.getRoot().setLeft(bt.createNode(17));
		bt.getRoot().setRight(bt.createNode(72));
		bt.getRoot().getLeft().setLeft(bt.createNode(12));
		bt.getRoot().getLeft().setRight(bt.createNode(23));
		bt.getRoot().getRight().setLeft(bt.createNode(54));
		bt.getRoot().getRight().setRight(bt.createNode(76));
		bt.getRoot().getLeft().getLeft().setLeft(bt.createNode(9));
		bt.getRoot().getLeft().getLeft().setRight(bt.createNode(14));
		bt.getRoot().getLeft().getRight().setLeft(bt.createNode(19));
		bt.getRoot().getRight().getLeft().setRight(bt.createNode(67));
		
		
		System.out.println("\n PreOrder : \n");
		bt.PreOrder();
		
		System.out.println("\n-----------------------------------------\n");
		
		System.out.println(" Level-wise : \n");
		bt.display_Levelwise();
		
		System.out.println("\n-----------------------------------------\n");
		
		System.out.println(" LeafNodes : \n");
		bt.display_LeafNode();
		
		System.out.println("\n-----------------------------------------\n");
		int n;
		System.out.println("Insert Nodes: ");
		n = s.nextInt();

		bt.insertBTNodes(n);
		
		System.out.println("\nAfter Insertion (Level-wise): \n");
		bt.display_Levelwise();
		
		System.out.println("\n-----------------------------------------\n");
		System.out.println(" Non-LeafNodes : \n");
		bt.display_NonLeafNode();
		
	}
}
