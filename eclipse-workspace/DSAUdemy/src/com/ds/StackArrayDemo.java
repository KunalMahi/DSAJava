package com.ds;

public class StackArrayDemo {

	public static void main(String[] args) {

		StackArray<Integer> st=new StackArray<Integer>(5);
		st.push(10);
		st.push(12);
		st.push(14);
		st.push(16);
		st.push(18);
		st.push(20);
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		st.pop();
	}

}
