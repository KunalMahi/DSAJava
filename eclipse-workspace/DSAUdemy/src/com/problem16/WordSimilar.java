package com.problem16;

import java.util.Arrays;

public class WordSimilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w1="loop";
		String w2="poot";
		boolean b=new WordSimilar().isSimilar(w1, w2);
		System.out.println("Similar? "+b);
		
	}
	boolean isSimilar(String word1,String word2) {
		if(word1.length()!=word2.length())
			return false;
		char[] word1array=word1.toCharArray();
		char[] word2array=word2.toCharArray();
		Arrays.sort(word1array);
		Arrays.sort(word2array);
		for(int i=0;i<word1.length();i++) {
			if(word1array[i]!=word2array[i]) {
				return false;
			}
		}
		return true;
	}

}
