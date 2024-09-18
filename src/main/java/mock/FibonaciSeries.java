package mock;

import java.util.Arrays;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonaciSeries.getFibonaciSeries(5);

	}
	
	private static int getFibonaciSeries(int number ) {
		int arr [] = new int[number+1];
		arr[0]=0;
		arr[1]=1;
		
		if(arr[number]!=0) {
			return arr[number] ;
		}
		
		if(number==0) return 0 ;
		if(number==1) return 1 ;
		
		for(int i = 2; i<=number ; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.println("Value is : "+Arrays.toString(arr));
		return arr[number];

	}

}
