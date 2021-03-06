package com.ds;

public class QueueLinkedListDemo {
	public static void main(String[] args) {
		QueueLinkedList<String> q=new QueueLinkedList<String>();
		q.queue("Kunal");
		q.queue("Anil");
		q.queue("Harsh");
		q.queue("Divya");
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
	
}
