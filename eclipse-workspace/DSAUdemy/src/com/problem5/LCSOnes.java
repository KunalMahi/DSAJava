package com.problem5;

import java.util.ArrayList;

public class LCSOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,1,1,1,0,1,1,0,1,1,1};
		ArrayList<Integer> list=new ArrayList<Integer>();
		int total=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				total++;
			}
			else {
				if(total>0) {
					list.add(total);
				}
				list.add(arr[i]);
				total=0;
			}
		}
		if(total>0)
		{
			list.add(total);
		}
		System.out.println(list);
		int max=0;
		int j=0;
		if(list.get(0)==0)
			j=1;
		for(int i=j;i<list.size()-2;i+=2) {
			int len=list.get(i)+list.get(i+1)+list.get(i+2);
			if(max<len) {
				max=len;
			}
		}
		System.out.println(max+1);
	}

}
