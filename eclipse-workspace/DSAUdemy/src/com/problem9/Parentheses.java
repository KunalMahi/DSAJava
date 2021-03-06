package com.problem9;
import java.util.Stack;
public class Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="((((()())))";
		Stack<Character> s1=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			s1.push(s.charAt(i));
		}
		Stack<Character> s2=new Stack<Character>();
		boolean isValid=true;
		while(!s1.isEmpty()) {
			char c=s1.pop();
			if(c==')') {
				s2.push(c);
			}
			else {
				if(s2.isEmpty()) {
					isValid=false;
					break;
				}
				else {
					s2.pop();
				}
			}
		}
		if(isValid && s1.isEmpty() && s2.isEmpty()) {
			System.out.println("Equation is valid");
		}
		else {
			System.out.println("Equation is not valid");
		}
	}

}
