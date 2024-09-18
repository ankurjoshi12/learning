package String;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {

	/**
	 * This program uses back tracking to find all the permutation for the given string 
	 * @param pattern : String for which pattern need to be generated 
	 * @param permutation :  String permutation so far 
	 * @param index size of string pattern
	 */
	private static void Permutation(String pattern , String permutation , List<String> perm ) {
		if(pattern.length()==0) {
			System.out.println(permutation);
			perm.add(permutation);
			return ;
		}
		
		for(int i = 0 ; i<pattern.length();i++) {
			System.out.println("******* Itertaion : "+i+" , pattern is : "+pattern);
			char currentChar = pattern.charAt(i);
			String nextPattern = pattern.substring(0, i)+pattern.substring(i+1);
			System.out.println("currentChar : "+currentChar+" , nextPattern : "+nextPattern+" , permutation+currentChar : "+permutation+currentChar);
			Permutation(nextPattern, permutation+currentChar , perm);
		}
	}
	public static void main(String[] args) {
		 List<String> perm = new ArrayList<>();
		PermutationOfString.Permutation("abc","",perm);
		System.out.println("All permutation : "+perm.toString());
	}
}
	