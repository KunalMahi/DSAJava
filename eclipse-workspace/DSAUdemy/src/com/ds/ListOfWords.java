package com.ds;
import java.util.*;
public class ListOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="COLO";
		char[] arr= {'A','B','C','O','L','M','O','L','F'};
		int[][] a=new int[s.length()][arr.length];
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			if(h.containsKey(s.charAt(i))) {
				h.put(s.charAt(i), h.get(s.charAt(i))+1);
			}
			else {
				h.put(s.charAt(i), 1);
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(h.containsKey(arr[i]) && h.get(arr[i])>0) {
				h.put(arr[i], h.get(arr[i])-1);
			}
		}
		int sum=0;
		for(char c:h.keySet()) {
			sum+=h.get(c);
		//	System.out.println("");
		}
		if(sum==0) {
			System.out.println("FOUND");
		}
		else {
			System.out.println("NOT FOUND "+sum);
		}
	}

}
