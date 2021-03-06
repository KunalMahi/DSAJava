package com.tree;

public class BSTDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST b=new BST();
		b.add(b.root, b.NodeCreate(10));
		b.add(b.root, b.NodeCreate(12));
		b.add(b.root, b.NodeCreate(11));		
		b.add(b.root, b.NodeCreate(13));
		b.add(b.root, b.NodeCreate(6));
		b.search(b.root, 10);
		b.delete(b.root, 10);
		b.search(b.root, 10);
	}

}
