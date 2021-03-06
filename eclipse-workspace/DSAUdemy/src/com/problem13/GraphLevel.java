package com.problem13;
import com.tree.Node;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class GraphLevel {

	public static void main(String[] args) {
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
		ArrayList<ArrayList<Integer>> listOfLevels=new GraphLevel().getLevels(n1);
		for (ArrayList<Integer> a:listOfLevels) {
			System.out.println(a);
		}
	}
	
	ArrayList<ArrayList<Integer>> getLevels(Node node){
		ArrayList<ArrayList<Integer>> listOflevels=new ArrayList<ArrayList<Integer>>();
		
		Queue<Node> nodeQueue=new LinkedList<Node>();
		nodeQueue.add(node);
		int preLevel=1;
		int currentlevel=0;
		ArrayList<Integer> level=new ArrayList<Integer>();
		
		while(!nodeQueue.isEmpty()) {
			Node newNode=nodeQueue.poll();
			level.add(newNode.value);
			if(newNode.left!=null) {
				nodeQueue.add(newNode.left);
				currentlevel++;
			}
			if(newNode.right!=null) {
				nodeQueue.add(newNode.right);
				currentlevel++;
			}
			preLevel--;
			if(preLevel==0) {
				listOflevels.add(level);
				preLevel=currentlevel;
				currentlevel=0;
				level=new ArrayList<Integer>();
			}
		}
		return listOflevels;
	}

}
