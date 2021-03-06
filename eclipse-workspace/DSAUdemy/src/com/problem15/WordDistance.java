package com.problem15;
import java.util.Stack;
public class WordDistance {
	
	public static void main(String[] args) {
		String[] dic= {"hot","dot","dog","lot","log","cog"};
		String start="hot";
		String end="cog";
		boolean b=new WordDistance().isFound(dic, start, end);
		System.out.println("isFound: "+b);
	}
	public boolean isFound(String[] dic,String start, String end) {
		boolean isFound=false;
		boolean[] isVisited=new boolean[dic.length];
		Stack<String> st=new Stack<String>();
		st.push(start);
		while(!st.isEmpty()) {
			String word=st.pop();
			//System.out.println(word);
			if(distance(word,end)==0) {
				st.push(word);
				System.out.println(st);
				isFound=true;
				break;
			}
			for(int i=0;i<dic.length;i++) {
				if(isVisited[i]==true || distance(dic[i],start)==0) {
					continue;
				}
				int dist=distance(word,dic[i]);
				if(dist==1) {
					st.push(word);
				//	System.out.println("****"+dic[i]);
					st.push(dic[i]);
					isVisited[i]=true;
					//System.out.println(st);
					break;
				}
			}
		}
		return isFound;
	}
	public int distance(String word1, String word2) {
		int distance=word1.length();
		for(int i=0;i<word1.length();i++) {
			if(word1.charAt(i)==word2.charAt(i)) {
				distance--;
			}
		}
		
		return distance;
	}
}
