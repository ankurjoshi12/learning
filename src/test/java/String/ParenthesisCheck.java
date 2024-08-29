package String;

import java.util.Stack;

public class ParenthesisCheck {
	char[] pat = null ;

	Stack<Character> stc = new Stack<>();
	char r_parenthisis = '{';
	char l_parenthisis = '}';
	char top ;

	public ParenthesisCheck(String pattern) {
		this.pat = pattern.toCharArray();
		createStack(pat);
	}

	public <E> void createStack(char[] p) {
		for(char a : p) {
			if(a==r_parenthisis) {
				System.out.println("is empty , pushing -"+a);
				stc.push(a);
			}
			if(a==l_parenthisis) {
				if(stc.isEmpty()) {
					stc.pop();
					System.out.println("POP-"+a);
				}
			}
			else {
				stc.push(a);
				System.out.println("PUSH -"+a);
			}
		}
		if(stc.isEmpty()) {
			System.out.println("Given sting is balanced ");
		}

	}

	public void pushInto(char charac) {
		stc.push(charac);
		System.out.println("pushed elements "+charac);

	}
	public void popFrom() {
		char c = stc.pop();
		System.out.println("poped element "+c);
	}
	public boolean checkValidation(Stack<String> st) {
		if(!(st.size()==0)) {
			return true ;
		}
		return false;

	}
	public static void main(String[] args) {	
		ParenthesisCheck check = new ParenthesisCheck("{{{}}}");
	}
}
