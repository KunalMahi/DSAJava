package com.ds;

import java.util.Arrays;

public class QueueDArray <T>{

	Object[] ArrayQueue;
	int front;
	int rear;
	int size;
		public QueueDArray(int size) {
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
		public void ensureCapacity(int minCapacity) {
			int oldCapacity=getSize();
			if(oldCapacity<minCapacity) {
				int newCapacity=oldCapacity*2;
				if(newCapacity<minCapacity) {
					newCapacity=minCapacity;
				}
				ArrayQueue=Arrays.copyOf(ArrayQueue, newCapacity);
			}
		}
		public int getSize() {
			return ArrayQueue.length;
		}
		public void Queue(Object newItem) {
			ensureCapacity(rear+2);
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
