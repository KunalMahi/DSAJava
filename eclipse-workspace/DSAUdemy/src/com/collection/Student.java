package com.collection;

public class Student implements Comparable<Student> {
	
	String name;
	int age;
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.age==o.age)
		return 0;
		if(this.age>o.age)
			return 1;
		return -1;
	}

}
