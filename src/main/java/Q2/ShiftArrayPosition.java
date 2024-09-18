package Q2;

import java.util.Arrays;

public class ShiftArrayPosition {
	
	private void shiftPosition(int [] arr , int shift) {
		int len = arr.length;
		System.out.println("Intial Array : "+Arrays.toString(arr));
		System.out.println("Step 1 : Reversing the complete array around shift value ");
		reverse(arr, 0, len-1);
		System.out.println("Arrays after first iteration : "+Arrays.toString(arr));
		
	}
	
	private void reverse(int [] arr , int start , int end ) {
		while(start<end) {
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start]=temp;
			start++;
			end--;
			System.out.println("Current Array: " + Arrays.toString(arr));
		}

	}
	public static void main(String[] args) {
		int [] samplearr = {1,2,3,4,5};
		ShiftArrayPosition s = new ShiftArrayPosition();
		s.shiftPosition(samplearr, 2);
	}
}
