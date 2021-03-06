package com.problem1;

import java.util.LinkedList;
import java.util.Queue;

public class FindPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid= {{1,1,1,1,0},{1,0,0,1,0},{1,0,1,1,0},{9,1,1,1,1}};
		print(grid);
		Queue<Cell> queue=new LinkedList<Cell>();
		move(grid,queue,0,0,0);
		while(!queue.isEmpty()) {
			Cell botcell =queue.poll();
			move(grid,queue,botcell.rowIndex-1,botcell.colIndex,botcell.distance+1);
			move(grid,queue,botcell.rowIndex+1,botcell.colIndex,botcell.distance+1);
			move(grid,queue,botcell.rowIndex,botcell.colIndex-1,botcell.distance+1);
			move(grid,queue,botcell.rowIndex,botcell.colIndex+1,botcell.distance+1);
			
		}
		
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
	
	static void move(int[][] grid,Queue<Cell> queue,int newRow,int newCol,int newdistance) {
		if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length) {
			if(grid[newRow][newCol]==1) {
				queue.add(new Cell(newRow,newCol,newdistance));
				grid[newRow][newCol]=-1;
			}
			else if(grid[newRow][newCol]==9) {
				System.out.println("Distance :" +newdistance);
				System.exit(0);
			}
		}
	}

	}


