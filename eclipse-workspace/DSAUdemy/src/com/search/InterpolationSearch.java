package com.search;

public class InterpolationSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSet data=new DataSet(1000000);
		int search=3472841;
		boolean isFound=false;
		int low=0;
		int high=data.getSize()-1;
		int mid=0;
		while(!isFound) {
			if(low>high) {
				System.out.println("Number Not found");
				break;
			}
			data.NumberTry++;
			mid=low+((high-low)/(data.data[high]-data.data[low])*(search-data.data[low]));
			if(mid>=data.getSize() || mid<0) {
				System.out.println("Number Not found");
				break;
			}
			if(data.data[mid]==search) {
				System.out.println("Number is Found after "+data.NumberTry+" tries.");
				isFound=true;
				return;
			}
			if(data.data[mid]>search) {
				high=mid-1;
			}
			if(data.data[mid]<search) {
				low=mid+1;
			}
			System.out.println(data.data[mid]);
		}


	}

}
