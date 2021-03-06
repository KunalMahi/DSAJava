package com.ds;
import java.util.LinkedList;
import java.util.Iterator;
public class myCollectionsLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls=new LinkedList<String>();
		ls.add("Kunal");
		ls.add("Anil");
		ls.add("Harsh");
		ls.add("Divya");
		ls.add("Kunal");
		Iterator<String> itr=ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
