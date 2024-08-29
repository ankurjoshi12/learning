package DynamicProgramming;

import java.util.List;

public class FibonacciSeries {

	/**
	 * This Approach uses Top down approach and dynamic programming to reduce to method 
	 * call Which are more in recursive programming 
	 * Recursive time complexity - O(n2)
	 * Dynamic programming - O(n)
	 */
	public static int findFibonacciSeriesValue(int value) {
		int[] arr = new int[value +1];
		arr[0]=0;
		arr[1]=1;
		System.out.println("array intially : "+arr[2]);
		System.out.println("array intially : "+List.of(arr));
		if(arr[value]!= 0) {
			return arr[value];
		}
		if(value==0) return 0 ;
		if(value==1) return 1 ;
		
		for(int i =2 ; i<=value ; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		System.out.println("Value is : "+ arr[value]);
		return arr[value];

	}
	public static void main(String[] args) {
		 FibonacciSeries.findFibonacciSeriesValue(5);
	}
}
