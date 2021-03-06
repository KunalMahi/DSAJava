package com.graph;

import java.util.*;

public class BFSGraph {

	int size;
	adjList[] array;
		public BFSGraph(int size) {
			this.size=size;
			array=new adjList[this.size];
			for(int i=0;i<size;i++) {
				array[i]=new adjList();
				array[i].head=null;
			}
			// TODO Auto-generated constructor stub
		}
		public void add(int src,int dest) {
			Node n=new Node(dest,null);
			n.next=array[src].head;
			array[src].head=n;
		}
		public void BFSExplore(int startVertex){
			Boolean[] visited=new Boolean[size];
			for(int i=0;i<size;i++)
				visited[i]=false;
			Queue<Integer> q=new LinkedList<Integer>();
			q.add(startVertex);
			while(!q.isEmpty()) {
				int n=q.poll();
				System.out.println("Visited Node : "+n);
				
				visited[n]=true;
				Node head=array[n].head;
				while(head!=null) {
					if(visited[head.value]==false) {
						q.add(head.value);
						visited[head.value]=true;
					}
					else {
						head=head.next;
					}
				}
			}
		}

}
