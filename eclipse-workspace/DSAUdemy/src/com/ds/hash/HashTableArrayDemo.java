package com.ds.hash;

public class HashTableArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTableArray<String> hm=new HashTableArray<String>(10);
		hm.put(11, "Kunal");
		hm.put(12, "Divya");
		hm.put(14, "Harsh");
		hm.put(21, "Anil");
		System.out.println(hm.get(14));
	}

}
