package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
	public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
        	System.out.println("Value i -"+right+" character at i "+s.charAt(right));
            while(!set.add(s.charAt(right))) {
            	System.out.println("*************************");
            	System.out.println("Value of left "+left);
            	System.out.println("Value i -"+right+" character at i "+s.charAt(right));
            	System.out.println("While loop is true , right value "+right);
            	System.out.println("SET before removal -"+Arrays.asList(set.toString()));
                set.remove(s.charAt(left++));
                System.out.println("SET after removal -"+Arrays.asList(set.toString()));
                System.out.println("*************************");
            }
            System.out.println("character set value -"+Arrays.asList(set.toString()));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
	public static void main(String[] args) {
		LongestSubString l = new LongestSubString();
		System.out.println("Longest String len -"+l.lengthOfLongestSubstring("abcbaca"));
	}
}
