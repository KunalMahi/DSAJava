package com.problem4;
import java.util.LinkedList;

import com.tree.BST;
import com.tree.Node;
public class SimilarTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST b=new BST();
		b.add(b.root,b.NodeCreate(4));
		b.add(b.root,b.NodeCreate(3));
		b.add(b.root,b.NodeCreate(6));
		LinkedList<Integer> l1=new LinkedList<Integer>();
		explore(b.root,l1);
		BST b2=new BST();
		b2.add(b2.root,b2.NodeCreate(8));
		b2.add(b2.root,b2.NodeCreate(3));
		b2.add(b2.root,b2.NodeCreate(4));
		LinkedList<Integer> l2=new LinkedList<Integer>();
		explore(b2.root,l2);
		if(l1.equals(l2)) {
			System.out.println("Trees are similar");
		}
		else {
			System.out.println("Trees are not similar");
		}
		System.out.println(l1);
		System.out.println(l2);
	}
	public static void explore(Node CurrentNode,LinkedList<Integer> listOfNodes) {
		
		if(CurrentNode==null) {
			return;
		}
		explore(CurrentNode.left,listOfNodes);
		listOfNodes.add(CurrentNode.value);
		explore(CurrentNode.right,listOfNodes);
	}

}
