package com.collection;
import java.util.ArrayList;
import java.util.Collections;
class Person implements Comparable<Person>{
	String name;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	
}
public class SortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person>  listOfNames=new ArrayList<>();
		listOfNames.add(new Person("Divya",25));
		listOfNames.add(new Person("Kunal",21));
		listOfNames.add(new Person("Anil",56));
		listOfNames.add(new Person("Harsh",54));
		print(listOfNames);
		Collections.sort(listOfNames);
		print(listOfNames);
	}
	public static void print(ArrayList<Person> a) {
		for(Person p:a) {
			System.out.println("Name:"+p.name);
			System.out.println("Age:"+p.age);
		}
	}

}
