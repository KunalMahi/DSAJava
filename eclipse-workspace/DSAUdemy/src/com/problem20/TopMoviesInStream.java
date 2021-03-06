package com.problem20;
import java.util.Collections;
import java.util.PriorityQueue;
public class TopMoviesInStream {
	public static void main(String[] args) {
		int[] streamRating= {3,4,5,2,4,5,1,1,2};
		int k=3;
		KthtopRating(streamRating,k);
		}
	static void KthtopRating(int[] streamRating,int k) {
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();
		for(int i=0;i<streamRating.length;i++) {
			q.add(streamRating[i]);
			if(q.size()>3) {
				q.poll();
			}
			System.out.println(q.toString());
		}
		System.out.println(q.toString());
		
	}
}
