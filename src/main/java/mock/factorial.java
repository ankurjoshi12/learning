package mock;

import java.util.Arrays;

public class factorial {

	public static void main(String[] args) {
		factorial.findFactorial(3);
		
	}
	
	private static int findFactorial(int number) {
		int arr [] = new int[number+1];
		
		arr[0]= 1;
		arr[1]=1;
		
		if(arr[number]!=0) {
			return arr[number] ;
		}
		if(number==0) return 1 ;
		if(number==1) return 1 ;
		
		for(int i = 2 ; i<=number ; i++) {
			arr[i]=i*arr[i-1];
		}
		System.out.println("Factorial Arr is : "+Arrays.toString(arr));
		return arr[number];
	}
}
