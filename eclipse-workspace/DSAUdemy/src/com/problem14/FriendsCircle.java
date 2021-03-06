package com.problem14;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class FriendsCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] connections= {
				{1,0,0,0,0},
				{1,0,0,1,0},
				{0,0,1,0,0},
				{1,0,0,1,1},
				{0,0,0,1,1}
		};
		
		ArrayList<ArrayList<Integer>> listofCircles=new FriendsCircle().getConnections(connections);
		for(ArrayList<Integer> circle:listofCircles) {
			System.out.println(circle);
		}
	}
	
	public ArrayList<ArrayList<Integer>> getConnections(int[][] connections){
		ArrayList<ArrayList<Integer>> listOfCircles=new ArrayList<ArrayList<Integer>>();
		
		boolean[] visited=new boolean[connections.length];
		
		for(int row=0;row<connections.length;row++) {
			if(visited[row]==true) {
				continue;
			}
			visited[row]=true;
			ArrayList<Integer> listofFriends=new ArrayList<>();
			Queue<Integer> circleQueue=new LinkedList<Integer>();
			circleQueue.add(row);
			while(!circleQueue.isEmpty()) {
				int userId=circleQueue.poll();
				listofFriends.add(userId);
				for(int userFriends=0;userFriends<connections[0].length;userFriends++) {
					if(connections[userId][userFriends]==1 && visited[userFriends]!=true) {
						circleQueue.add(userFriends);
						visited[userFriends]=true;
					}
				}
				
			}
			listOfCircles.add(listofFriends);
		}
		
		return listOfCircles;
	}

}
