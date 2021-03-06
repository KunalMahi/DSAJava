package com.sort;

public class MergeSort {
	int[] array;
	int[] TempArray;
	void prepareForSort(int[] arr) {
		this.array=arr;
		this.TempArray=new int[arr.length];
		doMergeSort(0,arr.length-1);
	}

	private void doMergeSort(int low, int high) {
		// TODO Auto-generated method stub
		if(low<high) {
			int mid=low+(high-low)/2;
			doMergeSort(low,mid);
			doMergeSort(mid+1,high);
			MergePart(low,mid,high);
		}
		
	}

	private void MergePart(int low, int mid, int high) {
		// TODO Auto-generated method stub
		for(int i=low;i<=high;i++) {
			TempArray[i]=array[i];
		}
		int i=low;
		int j=mid+1;
		int k=low;
		while(i<=mid && j<=high) {
			if(TempArray[i]<=TempArray[j]) {
				array[k++]=TempArray[i++];
			}
			else {
				array[k++]=TempArray[j++];
			}
		}
		while(i<=mid) {
			array[k++]=TempArray[i++];
		}
		while(j<=high) {
			array[k++]=TempArray[j++];
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,40,15,25,30,60};
		System.out.println("Before Sorting: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		new MergeSort().prepareForSort(arr);
		System.out.println("\nAfter Sorting: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
