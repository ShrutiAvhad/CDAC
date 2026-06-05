package classwork.Queue;

import java.util.*;

public class QueueDemo {
	public static void main(String[] args) {
		
		PriorityQueue <Integer> q =  new PriorityQueue <Integer>();
	//	Queue <Integer> q = new LinkedList <Integer>();
		System.out.println(q.size());
		for(int i = 1; i<=10; i++)
		{
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		q.offer(10);
		System.out.println(q);
	}
}
