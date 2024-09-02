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

	private boolean checkIfParanthesisAreInOrder(String pattern) {
		//		{ [ ( ) ] }
		System.out.println("Given Pattern "+pattern);
		Stack<Character> stac = new Stack<>();
		char[] symbols = pattern.toCharArray();
		for(char ch : symbols) {
			System.out.println("character in Iteration "+ch);
			if(ch=='{' || ch == '[' || ch=='(') {
				System.out.println("pushed character : "+ch);
				stac.push(ch);
			}
			else {
				if(stac.empty()) {
					return false ;
				}
				char stacPeek = stac.peek();
				if(ch==')' && stacPeek=='(' || ch=='}' && stacPeek=='{' || ch==']' && stacPeek=='[') {
					System.out.println("pop operation in process - popping : "+ch);
					stac.pop();
				}
				else {
					System.out.println("character : "+ch+" is unbalanced ");
					return false;
				}
			}
		}
		return stac.isEmpty();

	}

	public static void main(String[] args) {
		checkParenthesis cp = new checkParenthesis();
		//		System.out.println("Result -"+cp.isParenthesis("{[()]}"));
		System.out.println("Is Balanced : "+cp.checkIfParanthesisAreInOrder("(){{}[]"));
	}

}
