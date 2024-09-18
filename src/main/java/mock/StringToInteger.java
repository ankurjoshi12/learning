package mock;

public class StringToInteger {

	public static void main(String[] args) {
		StringToInteger.getIntergerOfString("123");
	}
	
	private static int getIntergerOfString(String pat) {
		int start = 0 ;
		int end = pat.length();
		int digit ; 
		int result = 0 ; 
		
		while(start<end && Character.isWhitespace(pat.charAt(start))) {
			start++ ; 
		}
		while(start<end && Character.isDigit(pat.charAt(start))) {
			digit = pat.charAt(start) - '0';
			if(result>(Integer.MAX_VALUE-digit)/10){
				return Integer.MAX_VALUE ;
			}
			result = result*10 + digit ;
			start++;
		}
		System.out.println("String to Integer : "+result);
		return result;

	}
}
