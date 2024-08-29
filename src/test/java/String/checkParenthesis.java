package String;

import java.util.Stack;

public class checkParenthesis {

	private boolean isParenthesis(String s) {
		System.out.println("given pattern - "+s);
		Stack<Character> stac = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c == '[' || c == '{' || c == '(') {
				System.out.println("Pushing char - "+c);
				stac.push(c);
			}
			else {
				if (stac.isEmpty()) {
                    return false;
                }
				char peek = stac.peek();
				System.out.println("Peak char - "+peek);
				if (c == ']' && peek =='[' || c == '}'&& peek =='{' || c == ')'&& peek =='(') {
					System.out.println("Pop operation - ");
					stac.pop();

				}
				else {
					return false ; 
				}
			}

		}
		return stac.isEmpty();
	}
	
	public LongestPallandrome checkafunctionality() {
		if(true) {
			return new LongestPallandrome();
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		checkParenthesis cp = new checkParenthesis();
		System.out.println("Result -"+cp.isParenthesis("{[()]}"));
	}
	
}
