package com.problem12;
import com.tree.*;

public class Mirror {
	public static void main(String[] args) {
	new Mirror().buildTree();
}

	private void buildTree() {
		// TODO Auto-generated method stub
		Node n1=new Node(1,null,null);
		Node n2=new Node(2,null,null);
		Node n3=new Node(3,null,null);
		Node n4=new Node(4,null,null);
		Node n5=new Node(5,null,null);
		
		n1.left=n3;
		n1.right=n2;
		n2.left=n5;
		n2.right=n4;
		
		explore1(n1);

		System.out.println();
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		
		explore2(n1);
		
	}
	
	private void explore2(Node node) {
		// TODO Auto-generated method stub
		if(node==null)
			return;
		
		System.out.print(node.value+ " ");
		explore2(node.right);
		explore2(node.left);
		
	}

	private void explore1(Node node) {
		if(node==null)
			return;
		
		System.out.print(node.value+" ");
		explore1(node.left);
		explore1(node.right);
	}
}
