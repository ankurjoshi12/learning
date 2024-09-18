package String;

public class LongestSubArray {

	// Two pointer approach
	//Find the max length of array which has sum less than test amount 
	private static void getLongestSubArrayUsingBetterApproach(int[] testArray , int TestAmount) {
		int maxLen = 0 ; 
		int sum = 0 ; 
		int validSum = 0;
		int start = 0 ;
		int end = 0;
		int validStart = 0 ;
		int validEnd = 0 ;
		while(end<testArray.length) {
//			System.out.println("Start : "+start+" , End : "+end);
			sum = sum + testArray[end];
//			System.out.println("Computed Sum "+sum+" , max length : "+maxLen);
			
			if(sum>TestAmount) {
				
//				LongestSubArray(start, end, testArray);
//				System.out.println("Reduce Sliding window by 1");
//				System.out.println("Invalid case : Sum "+sum+" , max length : "+maxLen+" , start index : "+start);
				sum = sum - testArray[start];
				
				start++;
			}
			if(sum<=TestAmount) {
				if(maxLen < end-start+1) {
					validStart = start ;
					validEnd = end ;
					validSum = sum;
					
				}
				maxLen= Math.max(maxLen, end-start+1);
//				System.out.println("Valid case : Sum "+sum+" , max length : "+maxLen);
				
			}
			end++ ;
			
			
		}
		LongestSubArray(validStart, validEnd, testArray);
//		LongestSubArray(validStart, validEnd, testArray);
		System.out.println("Sum "+validSum+" , max length : "+maxLen);
		
	}
	
	public static void LongestSubArray(int start1 , int end1 ,int[] testArray) {
		while(start1<=end1) {
//			System.out.println("Valid Longest array is : "+testArray[start1]);
			System.out.print(testArray[start1]);
			
			start1++ ;
		}
	}


	// Brute force Way 

	private void getLongestSubArrayUsingBruteForce(int[] testArray , int TestAmount) {
		int maxLen = 0 ; 
		int sum = 0 ; 
		int start = 0;
		int end=0 ;

		for(int i=0;i<testArray.length;i++) {
			System.out.println("Iteration : "+i);
			for(int j=0;i<testArray.length;j++) {
				//				System.out.println("Lenth of sub array  "+ (j-1+1));
				//				sum = Math.max(sum, testArray[j]);
				sum = sum+testArray[j];
				System.out.println("Sum "+sum+" , max length : "+maxLen);
				if(sum<=TestAmount) {
					System.out.println("Sum < TestAmount");
					maxLen= Math.max(maxLen, j-i+1);
					start = i ;
					end = j ;
					System.out.println("Sum "+sum+" , max length : "+maxLen);
					System.out.println("*******");
				}
				else {
					System.out.println("**** Break ****");
					break;
				}

			}
		}
		System.out.println("Max Length "+maxLen);
		while(start<=end) {
			System.out.print(testArray[start]);
			start++ ;
		}

	}
	public static void main(String[] args) {
		LongestSubArray sa = new LongestSubArray();
		int [] arr = {1,2,3,4,3,2,1,1};
		//		sa.getLongestSubArrayUsingBruteForce(arr, 6);
		sa.getLongestSubArrayUsingBetterApproach(arr, 7);
	}
}
