package com.tree;

public class BST {
public Node root;
	public BST() {
		// TODO Auto-generated constructor stub
		root=null;
	}
	int size=0;
	public void add(Node start,Node newNode) {
		if(root==null) {
			root=newNode;
			size++;
			return;
		}
		if(newNode.value<=start.value) {
			if(start.left==null) {
				start.left=newNode;
				size++;
				return;
			}
			add(start.left,newNode);
		}
		if(newNode.value>start.value) {
			if(start.right==null) {
				start.right=newNode;
				size++;
				return;
			}
			add(start.right,newNode);
		}
	}
	public Node NodeCreate(int value) {
		return new Node(value,null,null);
	}
	public void search(Node start,int value) {
		if(start==null) {
			System.out.println("Node is not found");
			return;
		}
		if(value==start.value) {
			System.out.println("Node is found");
			return;
		}
		
		if(value<start.value) {
			search(start.left,value);
		}
		if(value>start.value) {
			search(start.right,value);
		}
	}
	public Node delete(Node start,int key) {
		if(start==null)
			return start;
		if(key<start.value) {
			start.left=delete(start.left,key);
		}
		else if(key>start.value) {
			start.right=delete(start.right,key);
		}
		else {
			if(start.left==null) {
				return start.right;
			}
			else if(start.right==null) {
				return start.left;
			}
			start.value=minValue(start.right);
			start.right=delete(start.right,start.value);
		}
		return start;
	}
	public int minValue(Node start) {
		// TODO Auto-generated method stub
		int min=start.value;
		while(start.left!=null) {
			min=start.left.value;
			start=start.left;
		}
		return min;
	}

}
