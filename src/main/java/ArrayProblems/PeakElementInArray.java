package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class PeakElementInArray {

	/**
	 * A peak element is an element that is greater than or equal to its neighbours. 
	 * For example, in the array [1, 3, 20, 4, 1],[1,1,1,2,1,1,3] the element 20 is a 
	 * peak because it is greater than its neighbours 3 and 4.
	 */
	private static List<Integer> findPeak(int arr[] ) {
		List<Integer> indexes = new ArrayList<>();
		
		int n = arr.length;
		
		if(n==0) {
			return null;
		}
		
		if(arr[0]>=arr[1]) {
			indexes.add(arr[0]);
		}
		if(arr[n-1]>=arr[n-2]) {
			indexes.add(arr[n-1]);
		}
		for(int i=1 ; i <n-2;i++) {
			if(arr[i]>=arr[i-1]&&arr[i]>=arr[i+1]) {
				indexes.add(arr[i]);
			}
		}
		System.out.println("Index list : "+indexes.toString());
		return indexes;

	}
	public static void main(String[] args) {
//        int[] arr = {4, 3, 5,5,5,7,8,20, 4, 1};  // Example array
//		int[] arr = {1, 1 , 2,1,1,1};  // Example array
		int[] arr = {};
        System.out.println("Peak Indexes : "+ findPeak(arr));

//        if (peak != -1) {
//            System.out.println("Peak Element: " + peak);
//        } else {
//            System.out.println("No Peak Element found.");
//        }
    }
}
