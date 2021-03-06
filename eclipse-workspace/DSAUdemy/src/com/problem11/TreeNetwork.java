package com.problem11;
import com.tree.Node;
import java.util.ArrayList;

public class TreeNetwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1=new Node(1,null,null);
		Node node2=new Node(2,null,null);
		Node node3=new Node(3,null,null);
		Node node4=new Node(4,null,null);
		Node node5=new Node(5,null,null);
	
		node1.left=node3;
		node1.right=node2;
		node2.left=node5;
		node2.right=node4;
		
		TreeNetwork treeNetwork=new TreeNetwork();
		treeNetwork.serialize(node1);
		System.out.println(treeNetwork.serializelist);
		
		Node head=treeNetwork.deserialize();
		
		TreeNetwork treeNetwork2=new TreeNetwork();
		treeNetwork2.serialize(head);
		System.out.println(treeNetwork2.serializelist);
		
	}
	ArrayList<Integer> serializelist=new ArrayList<Integer>();
	public void serialize(Node node) {
		if(node==null) {
			serializelist.add(-1);
			return;
		}
		else {
			serializelist.add(node.value);
			serialize(node.left);
			serialize(node.right);
		}
	}
	int index=0;
	public Node deserialize() {
		if(index>serializelist.size()-1 || serializelist.get(index)==-1) {
			index++;
			return null;
		}
		Node newnode=new Node(serializelist.get(index++),null,null);
		newnode.left=deserialize();
		newnode.right=deserialize();
		return newnode;
	}

}
