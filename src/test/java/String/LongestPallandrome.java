package String;

import java.io.FileReader;

public class LongestPallandrome {
	public String longestPallendrome(String s ) {
//		abababc
		String maxString = null;
		if(s.length()<1) {
			return s; 
		}
		int maxlen = 1 ;
//		String check = "babad";
		
		for(int i = 0 ; i<s.length();i++) {
			System.out.println("############# Iteration "+i);
			System.out.println("Value of I -"+i +" Max Len -"+maxlen);
			for(int j = i+maxlen ; j <= s.length() ; j++) {
				System.out.println("Value of J ="+j + " , Max Len ="+maxlen+" , j-i="+(j-i));
				if(j-i>maxlen && IsPallendrome(s.substring(i,j))) {
					maxlen = j-i;
					System.out.println("New max lenth "+maxlen);
					maxString = s.substring(i , j);
					System.out.println("************************");
				}
			}
		}
		
		return maxString;

		
	}
	public boolean IsPallendrome(String checkPallendromeString) {
		System.out.println("GIven string for pallendromic check -"+checkPallendromeString);
		if(checkPallendromeString.length()<1) {
			return true;
		}
		int left = 0 ; 
		int right = checkPallendromeString.length()-1 ; 
		while(left<right) {
			if(checkPallendromeString.charAt(left)!=checkPallendromeString.charAt(right)) {
				return false ;
			}
			left++;
			right-- ; 
		}
		
		return true;
		

	}
	public static void main(String[] args) {
		System.out.println("Starting  -");
		String check = "abababc";
		LongestPallandrome longest = new LongestPallandrome();
		System.out.println("longest.longestPallendrome(check) "+longest.longestPallendrome(check));
	}
}
