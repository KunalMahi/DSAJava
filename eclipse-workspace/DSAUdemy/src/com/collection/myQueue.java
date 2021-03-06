package com.collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
public class myQueue {
	
	public static void main(String[] args) {
	Queue<Integer> q=new LinkedList<Integer>();
	q.add(12);
	q.add(13);
	q.add(11);
	q.add(14);
	System.out.println(q.poll());

	PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
	pq.add(12);
	pq.add(13);
	pq.add(11);
	pq.add(14);
	System.out.println(pq.poll());
	

	PriorityQueue<Student> ps=new PriorityQueue<Student>();
	ps.add(new Student("Anil",56));
	ps.add(new Student("Divya",25));
	ps.add(new Student("Kunal",21));
	ps.add(new Student("Harsh",54));
	System.out.println(ps.poll().name);
	System.out.println(ps.poll().name);
	
	}
	
 
}
