package com.problem8;

import java.util.Stack;
import java.util.ArrayList;

public class StairCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int steps=4;
		Stack<Stair> stairStack=new Stack<Stair>();
		stairStack.add(new Stair(0,new ArrayList<Integer>()));
		int noOfWays=0;
		while(!stairStack.isEmpty()) {
			Stair currentStair=stairStack.pop();
			if(currentStair.number==steps) {
				System.out.println(currentStair.visited);
				noOfWays++;
				continue;
			}
			int oneStep=currentStair.number+1;
			if(oneStep<=steps) {
				stairStack.add(new Stair(oneStep,currentStair.visited));
		//		System.out.println("****"+currentStair.visited+currentStair.number);
			}
			int twoStep=currentStair.number+2;
			if(twoStep<=steps) {
				stairStack.add(new Stair(twoStep,currentStair.visited));
			//	System.out.println("****"+currentStair.visited);
			}
		}
		System.out.println(noOfWays);
	}

}
