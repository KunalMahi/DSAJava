package com.tree;

import java.util.HashSet;

public class TreeCompare {
	boolean isEqual=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TreeCompare().run();

	}

	private void run() {
		// TODO Auto-generated method stub

		BST tree1=new BST();
		tree1.add(tree1.root, tree1.NodeCreate(10));
		tree1.add(tree1.root, tree1.NodeCreate(12));
		tree1.add(tree1.root, tree1.NodeCreate(11));
		scanTree(tree1.root,true);
		BST tree2=new BST();
		tree2.add(tree2.root, tree2.NodeCreate(11));
		tree2.add(tree2.root, tree2.NodeCreate(14));
		tree2.add(tree2.root, tree2.NodeCreate(12));
		scanTree(tree2.root,false);
		
		if(tree1.size!=tree2.size  ) {
			isEqual=false;
		}
		if(isEqual==false) {
			System.out.println("Trees are not equal");
		}
		else {
			System.out.println("Trees are equal");
		}
	}
	HashSet<Integer> h=new HashSet<>();
	
	void scanTree(Node node,boolean isSaved) {
		if(node==null) {
			return;
		}
		if(isSaved==true) {
			h.add(node.value);
		}
		else {
			if(!h.contains(node.value)) {
				isEqual=false;
			}
		}
		scanTree(node.left,isSaved);
		scanTree(node.right,isSaved);
		
	}
}
