package com.ds;

public class QueueLinkedList<T> {
	NodeD Rear;
	NodeD Front;
	public QueueLinkedList() {
		Rear=null;
		Front=null;
		// TODO Auto-generated constructor stub
	}
	public void queue(Object value) {
		NodeD newNode=new NodeD(value,null,null);
		if(Rear==null) {
			Rear=newNode;
			Front=newNode;
		}
		else {
			newNode.next=null;
			Rear.next=newNode;
			newNode.previous=Rear;
			Rear=Rear.next;
		}
	}
	public T dequeue() {
		if(Rear==null || Front==null) {
			System.out.println("Queue is empty");
			return null;
		}
		T value=(T) Front.value;
		Front=Front.next;
		if(Front!=null)
		Front.previous=null;
		return value;
	}
	
}
