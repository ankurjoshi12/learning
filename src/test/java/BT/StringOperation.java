package BT;

import java.util.Arrays;

public class StringOperation {
/**
 * String = "Saket Saurav        is an Autom   ation Engine      er";
	Output ="Saket Saurav is an Automation Engineer";
 * @param pattern
 */
	private static void sampleOperation(String pattern) {
		
		int len = pattern.length();
		int index = 0 ; 
		String result = null ;
		
		String [] withoutSpaces = pattern.split("\\s+");
		String [] ninWhiteSpaceCharacter = pattern.split("a[]");
		System.out.println("String without spaces : "+ Arrays.toString(withoutSpaces));
		System.out.println("char array  : "+ Arrays.toString(ninWhiteSpaceCharacter));
//		String delimitedString = String.join(" ", withoutSpaces);
//		System.out.println("Result : "+delimitedString); 
//		for(String word : withoutSpaces) {
//			for(char c : pattern.toCharArray()) {
//				if(Character.isWhitespace(c)) {
//					String intial = word.substring(0, word.indexOf(c)).concat(word.substring(word.indexOf(c)));
//					result = result + intial ;
//				}
//			}
		while(index<len-1 && Character.isWhitespace(pattern.charAt(index))) {
			if(Character.isWhitespace(pattern.charAt(index+1)))	{
				index++;
			}
			
		}
		while(index<len-1 && Character.isAlphabetic(pattern.charAt(index))) {
			if(result==null) {
				result = result + pattern.charAt(index) ; 
			}
			result = result +" "+pattern.charAt(index) ; 
		}	
			System.out.println("Result : "+result);
		}
		
//	}
	
	public static void main(String[] args) {
//		StringOperation.sampleOperation("saket saurav      is autom ation");
		StringOperation.sampleOperation("aaaa bbbb a b");
	}
}
