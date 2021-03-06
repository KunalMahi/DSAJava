package com.ds;

public class StackArray <T>{
Object[] ArrayStack;
int size;
int top;
	public StackArray(int size) {
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
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}
		ArrayStack[++top]=newItem;
	}
	public T pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		}
		return (T)ArrayStack[top--];
	}

}
