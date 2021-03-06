package com.ds;

public class QueueArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray<Integer> q=new QueueArray<Integer>(5);
	//	System.out.println(q.DeQueue());
		q.Queue(5);
		q.Queue(2);
		q.Queue(3);
		q.Queue(6);
		q.Queue(8);
		q.Queue(8);
		System.out.println(q.DeQueue());

		System.out.println(q.DeQueue());
	}

}
