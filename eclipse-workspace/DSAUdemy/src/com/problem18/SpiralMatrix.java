package com.problem18;

import java.util.ArrayList;

public class SpiralMatrix {

	public SpiralMatrix() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		ArrayList<Integer> result=new SpiralMatrix().printSpiral(array);
		System.out.println(result);
	}
	ArrayList<Integer> printSpiral(int[][] array){
		ArrayList<Integer> result=new ArrayList<Integer>();
		int firstRow=0;
		int lastRow=array.length-1;
		int firstCol=0;
		int lastCol=array[0].length-1;
		while(firstRow<lastRow && firstCol<lastCol) {
		for(int i=firstCol;i<=lastCol;i++) {
			result.add(array[firstRow][i]);
		}
		firstRow++;
		for(int i=firstRow;i<=lastRow;i++) {
			result.add(array[i][lastCol]);
		}
		lastCol--;
		for(int i=lastCol;i>=firstCol;i--) {
			result.add(array[lastRow][i]);
		}
		lastRow--;
		for(int i=lastRow;i>=firstRow;i--) {
			result.add(array[i][firstCol]);
		}
		firstCol++;
		}
		return result;
	}
}
