package com.problemCombine2Lists;

import java.util.LinkedList;
import java.util.Stack;

class Combine2Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(12);
		list1.add(1);
		list1.add(5);
		list1.add(13);
		System.out.println(list1);
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(4);
		list2.add(7);
		list2.add(11);
		list2.add(8);
		System.out.println(list2);
		Stack<Integer> stk=new Stack<>();
		while(!list2.isEmpty()) {
			stk.push(list2.pop());
		}
		System.out.println(stk);
		LinkedList<Integer> list3=new LinkedList<Integer>();
		while(!list1.isEmpty()) {
			list3.add(list1.pop());
			list3.add(stk.pop());
		}
		System.out.println(list3);
	}

}
