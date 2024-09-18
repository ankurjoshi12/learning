package Searching;

import java.util.Arrays;

public class BinarySearch {

	private static void searchingBinarySearch(int [] arr , int low , int high , int element) {
		System.out.println("arr : "+Arrays.toString(arr)+" , low is : "+low+" , High : "+high );


		while(low<=high) {
			int mid =  low + (high - low) / 2 ;
			System.out.println("mid is : "+mid);

			if(arr[mid]==element) {
				System.out.println("Element found : "+arr[mid]);
				return ;
			}

			else if(element<arr[mid]) {
				high = mid-1;
			}
			if(element>arr[mid]) {
				System.out.println("element>arr[mid]");
				low= mid+1;
			}
		}
		System.out.println("Element not found");

	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		BinarySearch.searchingBinarySearch(arr, 0, arr.length-1, 1);
	}
}
