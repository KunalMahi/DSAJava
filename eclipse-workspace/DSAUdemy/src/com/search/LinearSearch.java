package com.search;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSet data=new DataSet(1000000);
		int search=347281;
		boolean isFound=false;
		for(int i=0;i<data.getSize();i++) {
			data.NumberTry++;
			if(data.data[i]==search) {
				System.out.println("Number is found after "+data.NumberTry+" tries");
				isFound=true;
				break;
			}
		}
		if(isFound==false) {
			System.out.println("Number is not found");
		}

	}

}
