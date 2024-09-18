package ArrayProblems;

import java.util.Arrays;

public class RotateArrayElement {

	private static void rotateGivenArray(int [] arr , int index , int Start , int end ) {
		
//		int len = arr.length;
//		int  i = Start ;
		if(index==0) {
			return ;
		}
		System.out.println("Arrays before Rotation : "+Arrays.toString(arr));
		while(Start<index) {
			System.out.println("Runn : "+Start);
			int temp = arr[Start];
			arr[Start]=arr[end];
			arr[end]=temp;
			System.out.println("Arrays After Rotation : "+Arrays.toString(arr));
			Start++ ;
			end--;
		}
		rotateGivenArray(arr, index-1,0, index-1);
//		rotateGivenArray(arr, 0, index-1, end);
		
	}
	
	private static void rotateArrNewFunction(int arr [] , int shiftPosition) {
		int len = arr.length;
		System.out.println("lenth of arr : "+len);
		
		int [] arrRotated = new int[len];
		
		for(int i=0 ; i<len-shiftPosition ; i++) {
			System.out.println("Index arr : "+i);
			arrRotated[i]=arr[shiftPosition+i];
		}
		for(int j=0 ; j<shiftPosition ; j++) {
			System.out.println("Index arr j : "+j);
			arrRotated[len-shiftPosition+j] = arr[j];
		}
		System.out.println("Arr Rotated : "+Arrays.toString(arrRotated));
	}
	
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
//		RotateArrayElement.rotateGivenArray(arr, 2, 0, arr.length-1);
		RotateArrayElement.rotateArrNewFunction(arr, 3);
	}
}
