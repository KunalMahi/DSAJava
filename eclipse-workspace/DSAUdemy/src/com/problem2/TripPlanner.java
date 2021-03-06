package com.problem2;
import java.util.*;
public class TripPlanner {
	public static void main(String[] args) {
		int[][] grid= {{1,1,1,1,0},{0,1,0,1,0},{0,0,1,1,0},{0,0,1,0,0},{0,0,0,1,1},{0,0,1,1,1}};
		print(grid);
		Queue<GCell> queue=new LinkedList<GCell>();
		move(grid,queue,0,0,null);
		while(!queue.isEmpty()) {
			GCell botcell=queue.poll();
			move(grid,queue,botcell.rowIndex+1,botcell.colIndex+1,botcell.listOfCities);
			move(grid,queue,botcell.rowIndex+1,botcell.colIndex,botcell.listOfCities);
		}
		System.out.println("No path found");
	}
	private static void print(int[][] grid) {
		// TODO Auto-generated method stub
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}
	static void move(int[][] grid,Queue<GCell> queue,int newRow,int newCol,ArrayList<Integer> listOfCities) {
		if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<=grid[0].length) {
			if(grid[newRow][newCol]==1 && newCol==grid[0].length-1) {
				listOfCities.add(newCol);
				System.out.println("Path is found, List of Cities: "+listOfCities);
				System.exit(0);
			}
			else if(grid[newRow][newCol]==1) {
				queue.add(new GCell(newRow,newCol,listOfCities));
//				grid[newRow][newCol]=-1;
			}
		}
	}
}
