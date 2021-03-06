package com.ds;

public class StackLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinkedList<String> s=new StackLinkedList<String>();
		s.pop();
		s.push("Kunal");
		s.push("Divya");
		System.out.println(s.pop());
	}

}
