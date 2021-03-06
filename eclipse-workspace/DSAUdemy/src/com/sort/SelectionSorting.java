package com.sort;

public class SelectionSorting {
	
	static void SelectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int index=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
			if(index!=i) {
				int temp=arr[index];
				arr[index]=arr[i];
				arr[i]=temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,40,15,25,30,60};
		System.out.println("Before Sorting");
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
		SelectionSort(arr);
		System.out.println("\nAfter Sorting");
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");


	}

}
