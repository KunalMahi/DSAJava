package com.problem7;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] set= {1,5,6,9,10}	;
		int mybasket=15;
		for(int i=0;i<(1<<set.length);i++) {
			String packet = "";
			int sum=0;
			for(int j=0;j<set.length;j++) {
				//System.out.println(i + " "+(1<<j)+" "+(i&(1<<j)));
				if((i & ( 1<<j )) > 0) {
					packet=packet+set[j]+" ";
					sum+=set[j];
				}

				//System.out.println(packet);
			}
			if(sum==mybasket) {
				System.out.println(i+" "+packet);
			}
		}

	}

}
