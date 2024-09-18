package mock;

import java.util.ArrayList;
import java.util.List;

public class PermuationOfString {

	public static void main(String[] args) {
		List<String> perm = new ArrayList<>();
		PermuationOfString.getPermutation("abc", "", perm);
		System.out.println("List of Permuation : "+perm.toString());
	}
	
	private static void getPermutation(String pat , String permuatatiom  , List<String> output) {
		System.out.println("Given String : "+pat);
		
		if(pat.length()==0) {
			output.add(permuatatiom);
			System.out.println("Permutation : "+permuatatiom);
		}
		
		for(int i = 0 ; i<pat.length();i++) {
			char intial = pat.charAt(i);
			String newString = pat.substring(0, i)+pat.substring(i+1);
			System.out.println("Intial : "+intial+" , newString : "+newString);
			getPermutation(newString , permuatatiom+intial ,output );
		}
	}
}
