package Q2;

public class TestFunctionality2 {
	
	private static boolean IsindexAction(String pat1  , String pat2) {
		
		boolean isAnan = true ; 
		if(pat1.length()!= pat2.length()) {
			return false ; 
		}
		
		for(int i=0 ; i<pat1.length();i++) {
			int j = 0 ;
			while(j<pat2.length()) {
				System.out.println("comaparing : "+pat1.charAt(i) +" "+pat2.charAt(j));
				if(pat1.charAt(i)!=pat2.charAt(j)) {
					System.out.println("Not eqauls ");
					isAnan=false;
					j++ ; 
				}
				else if(pat1.charAt(i)==pat2.charAt(j)){
					isAnan = true ;
					break;
				}
				else{
					isAnan=false;
				}
			}
		}
		return isAnan ; 

	}
	public static void main(String[] args) {
		boolean isAnangram = TestFunctionality2.IsindexAction("race", "card");
		System.out.println("Is nanagram : "+isAnangram);
	}
	
}
