package ArrayProblems;

public class FindMissingNumber {

	private static int missingNumber(int arr[] , int factor) {
		int len = arr.length;
		int missingNumber=0;
		
		if(len==0) {
			return 0;
		}
		for(int i=0 ; i<len ; i++) {
			if((i+1) != arr[i]) {
				missingNumber=(i+1) ;
				System.out.println("miss matched "+(i+1) +" , "+ arr[i]);
			}
			else {
				System.out.println("matched "+(i+1) +" , "+ arr[i]);
			}
		}
		return missingNumber ;
	}
	
	public static void main(String[] args) {
//		int arr[] = {3,2,1,5};
		int arr[] = {1,2,3,4,5,6,7,9};
//		Arrays.sort(arr);
//		Collections.sort(Arrays.asList(arr));
//		System.out.println("Sorted array : "+Arrays.toString(arr));
//		System.out.println("Missing number : "+FindMissingNumber.missingNumber(arr , 5 ));
	}
}
