package com.ds;
import java.util.HashMap;
import java.util.Map;
public class mycollectionHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1, "Kunal");
		h.put(2,"Anil");
		h.put(555,"Harsh");
		System.out.println(h.get(1));
		for(Map.Entry m:h.entrySet()) {
			System.out.println("Key : "+m.getKey()+" Value : "+m.getValue());
		}
		h.put(1, "Kunal Maheshwari");
		System.out.println(h.get(1));
		h.remove(2);
		for(Map.Entry m:h.entrySet()) {
			System.out.println("Key : "+m.getKey()+" Value : "+m.getValue());
		}
	}

}
