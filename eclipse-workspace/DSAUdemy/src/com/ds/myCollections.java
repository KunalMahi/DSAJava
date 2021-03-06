package com.ds;
import java.util.ArrayList;
public class myCollections {

	public static void main(String[] args) {
		ArrayList<String> st=new ArrayList<String>();
		st.add("Kunal");
		st.add("Anil");
		st.add("Divya");
		st.add("Harsh");
		st.remove(1);
		System.out.println(st.get(1));
		System.out.println(st.toString());
		
		ArrayList<employee> e=new ArrayList<employee>();
		e.add(new employee("Kunal",21));
		e.add(new employee("Anil",56));
		e.add(new employee("Harsh",54));
		e.add(new employee("Divya",25));
		for(employee emp:e) {
			System.out.println(emp.name+" "+emp.age);
		}
	}
	static class employee{
		String name;
		int age;
		public employee(String name,int age) {
			this.name=name;
			this.age=age;
		}
	}
}
