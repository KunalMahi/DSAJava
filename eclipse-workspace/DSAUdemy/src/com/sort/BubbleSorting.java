package com.sort;

public class BubbleSorting {
static void BubbleSort(int[] arr) {
	int n=arr.length;
	int temp=0;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,40,15,25,30,60};
		System.out.println("Before Sorting");
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
		BubbleSort(arr);
		System.out.println("\nAfter Sorting");
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");

	}

}
