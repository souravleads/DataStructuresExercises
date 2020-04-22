package DSForStack;

import java.util.ArrayList;

public class BalanceParentheses {

	/*
	 *Ex:	(A + B)		Correct Parentheses
	 *		{ (A + B) } Correct Parentheses
	 *		{ (A + B) ] Incorrect Parentheses
	 *		(A + B)} 	Incorrect Parentheses
	 *		)A + B( 	Incorrect Parentheses
	 *		[(A + B]) 	Incorrect Parentheses
	 */
	public static void main(String[] args) {
		
		String sample = "[[(A+B)*(A-B)]]";
		ArrayList<Character> parenthesesList;
		
		parenthesesList = generateParenthesesList(sample);
		
		
		if (parenthesesList.isEmpty() || parenthesesList.size()%2 == 1 || parenthesesList.get(0)==']' || parenthesesList.get(0)=='}' || parenthesesList.get(0)==')') {
			System.out.println(sample+" is not a Balanced Parentheses");
			return;
		}
		
		ArrayList<Character> temp = new ArrayList<>();
		temp.add(parenthesesList.get(0));
		
		for (int i = 1; i <parenthesesList.size() ; i++) {
			char c = parenthesesList.get(i);
			char c1 = checkClosingParentheses(c);
			if (c1 == parenthesesList.get(i-1)) {
				parenthesesList.remove(i);
				parenthesesList.remove(i-1);
				temp.remove(temp.size()-1);
				i = i-2;
			}
			else{
				temp.add(c);
			}
		}
			
		if (temp.isEmpty()) {
			System.out.println(sample+" is a balanced parentheses");
		}
		else{
			System.out.println(sample+" is not a Balanced Parentheses");
		}
		
				
	}

	private static ArrayList<Character> generateParenthesesList(String sample) {
		char[] chars = sample.toCharArray();
		ArrayList<Character> parenthesesList = new ArrayList<>();
		for (char c : chars) {
			if (c == '{' || c == '}' || c == '(' || c == ')' || c == '[' || c == ']') {
				parenthesesList.add(c);
			}
			//System.out.println(c);
		}
		return parenthesesList;
	}

	private static Character checkClosingParentheses(Character c) {
		
		if (c == ')') 
            return '('; 
        if (c == '}') 
            return '{'; 
        if (c == ']') 
            return '['; 
        return '\0'; //null
		
	}

}
