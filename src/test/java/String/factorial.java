package String;

import java.util.Arrays;
import java.util.Iterator;

public class factorial {

	private static int getFactorial(int number ) {
		int[] arr = new int[number+1];
		arr[0]= 1 ; 
		
		if(arr[number]!= 0) {
			return arr[number];
		}
		else {
			System.out.println("in Else");
			for(int i = 1 ; i<= number; i++) {
				System.out.println("in Iteration : "+i);
				arr[i] = arr[i-1]*i;
				System.out.println("result from for loop "+Arrays.toString(arr));
			}
		}
		System.out.println("Value is : "+Arrays.toString(arr));
		return arr[number] ;
		
	}
	public static int factorial(int n) {
        // Create an array to store the factorial values
        int[] dp = new int[n + 1];

        // Base case: factorial of 0 is 1
        dp[0] = 1;

        // Fill the array with factorial values
        for (int i = 1; i <= n; i++) {
            dp[i] = i * dp[i - 1];
        }

        // Return the factorial of n
        System.out.println("Factorail is "+dp[n]);
        return dp[n];
    }
	
	private static void printString(String test) {
		for (int j = 0; j < test.length(); j++) {
			System.out.println("String is ");
			System.out.println(test.substring(0));
			System.out.println(test.substring(0, j));
		}

	}
	private static void sumOfArrayElements(int[] list ,int index,  int sum) {
		if(index >=list.length) {
			System.out.println("Sum is : "+sum);
			return ;
		}
		sumOfArrayElements(list ,index+1, sum+list[index]);
	}
	
	private static void sumOfSingleInterger(int n , int sum) {
		if(n<1) {
			System.out.println("Sum is : "+sum);
			return ;
		}
		sumOfSingleInterger(n-1, sum+n);

	}
	
	
	public static void main(String[] args) {
//		factorial.getFactorial(4);
//		factorial.factorial(5);
//		factorial.printString("s");
		int [] arr = {1,2,3,4,5};
		factorial.sumOfArrayElements(arr,0,0);
		factorial.sumOfSingleInterger(3,0);
	}
}
