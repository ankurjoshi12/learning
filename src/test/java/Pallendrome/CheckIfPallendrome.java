package Pallendrome;

public class CheckIfPallendrome {


	private void isPallendrome(String test) {
		//		String[] separated =  test.split("\\s+");//doubt
		String[] separated =  test.split(" ");
		int maxLenth = 0 ; 
		for(String check : separated) {
			System.out.println("splited text : "+check);
			if(checkPallendrome(check) && maxLenth<check.length()) {
				maxLenth = check.length();
			}	
		}
		System.out.println("Max Length Pallendrome "+maxLenth);

	}
	private boolean checkPallendrome(String test) {
		System.out.println("Given Sample String : "+test);
		int start = 0; 
		int end = test.length()-1;
		while(start<end) {
			System.out.println("Start : "+start+" End :"+end);
			if(test.charAt(start)!=test.charAt(end)) {
				return false;
			}
			start++ ;
			end-- ;
		}
		System.out.println("Given String is a pallendrome "+test);
		return true;


	}
	public static void main(String[] args) {
		CheckIfPallendrome cp = new CheckIfPallendrome();
		String testString = "madam speaks malayalam"; 
		cp.isPallendrome(testString);

	}
}
