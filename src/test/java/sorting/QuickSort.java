package sorting;

import java.util.Arrays;

public class QuickSort {

	private static int quickSortMethord(int[] sampleList , int start , int end) {
		int pivot = sampleList[start];
		System.out.println("**************");
		System.out.println("on Start   : "+Arrays.toString(sampleList));
		System.out.println("Pivot value is "+pivot);
		while(start<=end) {
			System.out.println("Start : "+start+" , end : "+end);
			while(start<=end && sampleList[start]<=pivot) {
//				System.out.println("start incrementing  : "+start );
				start++;
				System.out.println("incremented start : "+start );
			}
			while(start<=end && sampleList[end]>pivot) {
//				System.out.println("end decrementing  : "+end );
				end-- ;
				System.out.println("decremented end : "+end );
			}
			if(start<=end) {
				System.out.println("swapping in process"); 
				int temp = sampleList[start] ; 
				sampleList[start] = sampleList[end];
				sampleList[end]=temp;
				System.out.println("start<end  : "+Arrays.toString(sampleList));
			}
		}
		int temp = sampleList[end]; 
		sampleList[end]=pivot;	
		sampleList[0]=temp ;
		System.out.println("swaping end > start : "+Arrays.toString(sampleList));

		return end ; 

	}
	
	private static void quickSortStart(int [] arr , int start , int end ) {
		if(start<=end) {
			int loc = quickSortMethord(arr, start, end);
			quickSortStart(arr, start, loc-1);
			quickSortStart(arr, loc+1, end);
		}
		

	}

	public static void main(String[] args) {
		int [] arr = {7,2,4,8,3,10,1};
		QuickSort.quickSortStart(arr, 0, arr.length-1);
	}
}
