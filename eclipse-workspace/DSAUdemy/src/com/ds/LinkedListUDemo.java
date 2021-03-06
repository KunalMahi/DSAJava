package com.ds;

public class LinkedListUDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListU<String> list=new LinkedListU<String>();
		list.add("Kunal");
		list.add("Divya");
		list.add("Harsh");
		list.add("Anil");
		System.out.println("Before deleting");
		list.display();
		System.out.println("After Deleting");
		list.delete();
		list.display();
		list.add("Anil");
		list.head=deleteKthelement(list.head,1);
		System.out.println("After deleting Kth element");
		list.display();
	}
	
	static Node deleteKthelement(Node root, int k) {
		Node slowPtr=root;
		Node fastPtr=root;
		while(k>0) {
			fastPtr=fastPtr.next;
			k--;
		}
		if(fastPtr==null) {
			return root.next;
		}
		while(fastPtr.next!=null) {
			fastPtr=fastPtr.next;
			slowPtr=slowPtr.next;
		}
		slowPtr.next=slowPtr.next.next;
	return root;
	}
}
