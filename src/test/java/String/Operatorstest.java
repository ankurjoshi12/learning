package String;

import java.time.LocalDateTime;

public class Operatorstest {
	public static void main(String[] args) {
		System.out.println("Divide -"+5/2);
		System.out.println("Divide -"+ (int)5/2);
		System.out.println("Divide -"+ (int)5%2);
		System.out.println("Divide -"+ 5%2);
		System.out.println("Time -"+ LocalDateTime.now());
		String ankur = "ANKUR joshi";
		int diff = ankur.charAt(0)-'0' ;
		System.out.println("char at i "+ankur.charAt(0) + " diff "+diff);
		System.out.println("is digit "+Character.isDigit(ankur.charAt(0)));
		
	}
}
