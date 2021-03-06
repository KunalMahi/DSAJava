package com.problem3;

import java.util.ArrayList;
public class BST {
	Node root;
	ArrayList<Integer> visitedNodes=new ArrayList<Integer>();
	int steps=0;
	public BST() {
		// TODO Auto-generated constructor stub
		root=null;
	}
	public void add(Node start,Node newNode) {
		if(root==null) {
			root=newNode;
			return;
		}
		if(newNode.value<=start.value) {
			if(start.left==null) {
				start.left=newNode;
				return;
			}
			add(start.left,newNode);
		}
		if(newNode.value>start.value) {
			if(start.right==null) {
				start.right=newNode;
				return;
			}
			add(start.right,newNode);
		}
	}
	public void findPath(int searchValue, Node CurrentNode) {
		//System.out.println(CurrentNode.value);
		if(!visitedNodes.contains(CurrentNode.value)) {
			visitedNodes.add(CurrentNode.value);
			steps++;
		}
		else {
			steps--;
		}
		if(CurrentNode.value==searchValue) {
			return;
		}
		if(CurrentNode.value>searchValue) {
			findPath(searchValue,CurrentNode.left);
		}
		if(CurrentNode.value<searchValue) {
			findPath(searchValue,CurrentNode.right);
		}
	}
	public static void main(String[] args) {
		BST bst=new BST();
		bst.add(bst.root, new Node(8,null,null));
		bst.add(bst.root, new Node(5,null,null));
		bst.add(bst.root, new Node(10,null,null));
		bst.add(bst.root, new Node(4,null,null));
		bst.add(bst.root, new Node(6,null,null));
		bst.add(bst.root, new Node(9,null,null));
		bst.add(bst.root, new Node(12,null,null));
		bst.findPath(4, bst.root);
		bst.findPath(12, bst.root);
		System.out.println(bst.visitedNodes);
		System.out.println(bst.steps);
	}
}
