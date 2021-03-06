package com.ds;

public class QueueArray <T>{
Object[] ArrayQueue;
int front;
int rear;
int size;
	public QueueArray(int size) {
		this.size=size;
		ArrayQueue=new Object[this.size];
		front=-1;
		rear=-1;
		// TODO Auto-generated constructor stub
	}
	public Boolean isFull() {
		return(rear==size-1);
	}
	public Boolean isEmpty() {
		return(rear==-1||front>rear);
	}
	public void Queue(Object newItem) {
		if(isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		ArrayQueue[++rear]=newItem;
		if(front==-1)
			front=0;
	}
	public T DeQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		T ObjectOut=(T)ArrayQueue[front++];
		return ObjectOut;
	}

}
