package sevenEleven;

import java.util.Arrays;

public class FibonacciSeries {

	public static void main(String[] args) {
		FibonacciSeries.getFibSeries(4);
	}
	
	private static int getFibSeries(int number) {
		
		int [] arr = new int[number+1];
		
		if(arr[number]!=0) {
			return arr[number];
		}
		
		arr[0]=0;
		arr[1]=1;
		
		if(number==0) return 0;
		if(number==0) return 2;
		
		for(int i=2;i<=number;i++) {
			arr[i]= arr[i-1]+arr[i-2];
		}
		System.out.println("Fib series : "+Arrays.toString(arr));
		return arr[number];
	}
}
