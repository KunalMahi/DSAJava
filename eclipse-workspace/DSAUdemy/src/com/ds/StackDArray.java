package com.ds;

import java.util.Arrays;

public class StackDArray <T>{
	Object[] ArrayStack;
	int size;
	int top;
		public StackDArray(int size) {
			// TODO Auto-generated constructor stub
			this.size=size;
			ArrayStack=new Object[this.size];
			this.top=-1;
		}
		public boolean isFull() {
			return top==size-1;
		}
		public boolean isEmpty() {
			return top==-1;
		}
		public void push(Object newItem) {
			ensureCapacity(top+2);
			ArrayStack[++top]=newItem;
		}
		public T pop() {
			if(isEmpty()) {
				System.out.println("Stack is Empty");
				return null;
			}
			return (T)ArrayStack[top--];
		}
		public void ensureCapacity(int minCapacity) {
			int oldCapacity=getSize();
			if(oldCapacity<minCapacity) {
				int newCapacity=oldCapacity*2;
				if(newCapacity<minCapacity) {
					newCapacity=minCapacity;
				}
				ArrayStack=Arrays.copyOf(ArrayStack, newCapacity);
			}
		}
		public int getSize() {
			// TODO Auto-generated method stub
			return ArrayStack.length;
		}


}
