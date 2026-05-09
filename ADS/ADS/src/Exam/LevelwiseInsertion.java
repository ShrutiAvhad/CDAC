package Exam;
import java.util.LinkedList;
import java.util.Queue;

class BTNode{
	private int data;
	private BTNode left, right;
	
	public BTNode() {
		data = 0;
		left = null;
		right = null;
	}

	public BTNode(int d) {
		this.data = d;
		this.left = null;
		this.right = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BTNode getLeft() {
		return left;
	}

	public void setLeft(BTNode left) {
		this.left = left;
	}

	public BTNode getRight() {
		return right;
	}

	public void setRight(BTNode right) {
		this.right = right;
	}
}
public class LevelwiseInsertion {

	private BTNode root;
	
	public LevelwiseInsertion() {
		root = null;
	}
	
	public void insertLevelWise(int d) {

		BTNode newNode = new BTNode(d);
		
		if(root == null)
		{
			root = newNode;
			return;
		}
		
		Queue<BTNode> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			
			BTNode temp = q.remove();
			
			if(temp.getLeft() == null)
			{
				temp.setLeft(newNode);
				return;
			}
			else
			{
				q.add(temp.getLeft());
			}
			
			if(temp.getRight() == null)
			{
				temp.setRight(newNode);
				return;
			}
			else
			{
				q.add(temp.getRight());
			}
		}
	    
	}
	
	public void display() {
		
		if(root == null)
		{
			return;
		}
		
		BTNode iter;
		
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			iter = q.remove();
			System.out.print(iter.getData()+" ");
			
			if(iter.getLeft() != null)
				q.add(iter.getLeft());
			
			if(iter.getRight() != null)
				q.add(iter.getRight());
		}
		
	}
	
	public static void main(String[] args) {
		
		LevelwiseInsertion l = new LevelwiseInsertion ();
		
		l.insertLevelWise(19);
		l.insertLevelWise(20);
		l.insertLevelWise(89);
		l.insertLevelWise(12);
		l.insertLevelWise(43);

		l.display();

	
	}
}
