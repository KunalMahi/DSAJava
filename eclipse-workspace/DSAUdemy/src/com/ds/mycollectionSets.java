package com.ds;

import java.util.Iterator;
import java.util.HashSet;
import java.util.TreeSet;
public class mycollectionSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> ls=new HashSet<String>();
		ls.add("Kunal");
		ls.add("Anil");
		ls.add("Harsh");
		ls.add("Divya");
		ls.add("Kunal");
		Iterator<String> itr=ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		TreeSet<String> ls1=new TreeSet<String>();
		ls1.add("Kunal");
		ls1.add("Anil");
		ls1.add("Harsh");
		ls1.add("Divya");
		ls1.add("Kunal");
		Iterator<String> itr2=ls1.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
