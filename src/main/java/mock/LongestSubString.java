package mock;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {
		LongestSubString.getLongestSubString("abcabcd");
	}

	private static void getLongestSubString(String pat ) {
		int start = 0 ; 
		int maxlen = 0 ;
		Set<Character> pattern = new HashSet<>();

		for(int end = 0 ; end <pat.length();end++ ) {
			while(!pattern.add(pat.charAt(end))) {
				pattern.remove(pat.charAt(start));
				start++;
			}
			if(end-start+1 > maxlen) {
				System.out.println("Max String : "+pat.substring(start , end+1));
//				printArrays(null, start, end);
			}
			maxlen = Math.max(maxlen, end-start+1);
			System.out.println("max len : "+maxlen);
			
		}
		System.out.println("Max Len : "+maxlen);


	}
//	private static void printArrays(String pat , int start , int end) {
//		for(int i = start ; i<=end ; i++) {
//			System.out.print(arr[i]);
//		}
//
//	}
}
