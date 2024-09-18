package mock;

public class LongestSubArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,4,3};
		LongestSubArray.findLongestSubArray(arr, 6);
	}
	
	private static void findLongestSubArray(int [] arr , int sumNumber) {
		int start = 0 ; 
		int end = 0 ;
		int maxlen = 0 ; 
		int sum = 0 ; 
		
		while(end<arr.length) {
			sum = sum +arr[end];
			System.out.println("Intial sum : "+sum);
			if(sum<=sumNumber) {
				maxlen = Math.max(maxlen, end-start+1);
				System.out.println("Max len : "+maxlen);
			}
			if(sum>sumNumber) {
				sum = sum-arr[start];
				start++;
			}
			end++;
		}

	}
}
