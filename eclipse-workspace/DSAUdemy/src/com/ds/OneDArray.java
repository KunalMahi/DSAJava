package com.ds;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[5];
		num[0]=20;
		num[1]=5;
		num[2]=10;
		num[3]=6;
		num[4]=11;
		for(int i=0;i<num.length;i++)
			System.out.println(num[i]);
		Stud[] students=new Stud[4];
		students[0]=new Stud("Kunal",21);
		students[1]=new Stud("Anil",56);
		students[2]=new Stud("Harsh",54);
		students[3]=new Stud("Divya",24);
		for(int i=0;i<students.length;i++) {
			System.out.println("Name : "+students[i].name+" Age : "+students[i].age);
		}
		for (Stud stud : students) {
			System.out.println("Name : "+stud.name+" Age : "+stud.age);
		}
	}

}
