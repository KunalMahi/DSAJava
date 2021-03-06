package com.interviews;
import java.util.ArrayList;
import java.util.HashMap;
public class KeyPhrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="Suppose we have a set of English document and wish to rank whih document is most relevant to the query, the brown cow . A simple way to start out is by eliminating documents that do not contain all three words the brown , and cow , but this still leaves many documents .";
		ArrayList<String> wordsToExclude=new ArrayList<>();
		wordsToExclude.add("the");
		wordsToExclude.add("a");
		wordsToExclude.add("by");
		wordsToExclude.add("to");
		wordsToExclude.add("and");
		wordsToExclude.add("of");
		wordsToExclude.add(",");
		wordsToExclude.add(".");
		wordsToExclude.add("is");
		
		HashMap<String,Integer> wordFreq=new HashMap<>();
		System.out.println(text);
		int maxFreq=0;
		String[] textSp=text.split(" ");
		for (String string : textSp) {
			if((wordsToExclude.contains(string)) || (string.trim().length()==0)) {
				continue;
			}
			String key=string.trim().toLowerCase();
			if(wordFreq.get(key)==null) {
				wordFreq.put(key,1);
			}
			else {
				int freq=wordFreq.get(key);
				wordFreq.put(key,freq+1);
			}
			if(maxFreq<wordFreq.get(key)) {
				maxFreq=wordFreq.get(key);
			}
		}
		for(String key: wordFreq.keySet()) {
			if(wordFreq.get(key)==maxFreq) {
				System.out.println(key+" : "+wordFreq.get(key));
			}
		}
	}

}
