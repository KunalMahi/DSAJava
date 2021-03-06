package com.ds;

public class QueueDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueDArray<Integer> q=new QueueDArray<Integer>(2);
		q.Queue(11);
		q.Queue(11);
		System.out.println(q.getSize());
		q.Queue(12);
		System.out.println(q.getSize());
		

	}

}
