package String;

public class StringToInteger {

	private static Integer convertStringToInteger(String text) {
		
		int index = 0 ;
		int sign = 1 ;
		int digit ; 
		int len = text.length();
		int result = 0;
		System.out.println("Index is "+index);
				
		while(index<len && Character.isWhitespace(text.charAt(index))) {
			index++;
		}
		
		if(index<len && (text.charAt(index)=='-' || text.charAt(index)=='+')) {
			sign = text.charAt(index) == '-' ? -1:1;
			index++;
		}
		
		while(index<len && Character.isDigit(text.charAt(index))) {
			digit = text.charAt(index) - '0';
			System.out.println("Digit is "+digit);
			
			if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
			result = result * 10 + digit ;
			index++;
		}
		return sign*result ;

	}
	private static String reverseString(String test) {
		String result = null ;
		if(test.equals("null")|| test.length()<0) {
			return null ;
		}
		for(int i = test.length()-1;i>=0;i--) {
			result = result+test.charAt(i);
		}
		System.out.println("Revered String "+result);
		return result;
		
	}
	private static  Integer reverseInteger(int test) {
		System.out.println("Test : "+test);
		int result = 0 ;
		int sign = (test < 0) ? -1 : 1 ;
		System.out.println("Sign is : "+sign);
		test = Math.abs(test);
		System.out.println("Test abs : "+test);
		while(test!=0) {
			int lastInt = test%10 ;
			if (result > (Integer.MAX_VALUE - lastInt) / 10) {
                throw new ArithmeticException("Reversed integer overflow");
            }
			result = result*10+lastInt ; 
			test/=10 ;
		}
		System.out.println("Reversed Integer : "+result*sign);
		return result*sign ;
		
	}
	
	public static void main(String[] args) {
//		System.out.println("Converted String To integer "+StringToInteger.convertStringToInteger("2147483647"));
//		System.out.println("Converted String To integer "+StringToInteger.reverseString("i love india's ")); 
//		StringToInteger.reverseString("i love india's ");
		StringToInteger.reverseInteger(-1234);
	}
}
