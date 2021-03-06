package com.ds;

public class LinkedListDDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListD<String> list=new LinkedListD<String>();
		list.add("Kunal");
		list.add("Divya");
		list.add("Harsh");
		list.add("Anil");
		System.out.println("Before deleting");
		list.display();
		System.out.println("After Deleting");
		list.delete();
		list.display();
	}

}
