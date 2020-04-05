package stringSoln;

import java.util.Stack;
import java.util.Scanner;

public class InfixToPostfix{

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		System.out.println("Postfix Expression: " );
		String pf = reader.nextLine();
		pf = convertToPostfix(pf);
		System.out.println("Infix Expression: " + pf);
		reader.close();
		}
	
	public static String convertToPostfix(String infix) {
		Stack<Character> Stack = new Stack<Character>();
		StringBuilder postFix = new StringBuilder();
		int charCount = infix.length();
		char Operator;
		for(int i = 0; i < charCount; i++) {
			boolean done = false;
			char nextChar = infix.charAt(i);
			if (Variable (nextChar))
				postFix = postFix.append(nextChar);
			else
			{
				switch(nextChar) {
				case '^': 
					Stack.push(nextChar);
					break;
					
				case '+': case '-': case '*': case '/':
					while(!done && !Stack.isEmpty()) {
						Operator = Stack.peek();
						if (Precedence(nextChar) <= Precedence(Operator)) {
							postFix = postFix.append(Operator);
							Stack.pop();
						}
						else 
							done = true;
					} //end while
					
					Stack.push(nextChar);
					break;
					
				case'(':
					Stack.push(nextChar);
					break;
					
				case')': 
					Operator = Stack.pop();
					while (Operator != '(') {
						postFix = postFix.append (Operator);
						Operator = Stack.pop();
					} //end while
					break;
					
					default: break;
					
				}
			}
		}
		while (!Stack.isEmpty()) {
			Operator = Stack.pop();
			postFix = postFix.append(Operator);
		}
		
		return postFix.toString();
	}
	public static int Precedence(char op) {
		switch (op) {
		case '(': case ')': return 0;
		case '+': case '-': return 1;
		case '*': case '/': return 2;
		case '^':			return 3;
		}
		
	return -1;	
	}
	private static boolean Variable(char varie) {
		return Character.isLetter(varie);
	}
	
	public static double evaluatePostfix(String postfix){
		Stack<Double> StackValue = new Stack<Double>();
		int counter = postfix.length();
		for (int i = 0; i < counter; i++) {
			char nextChar = postfix.charAt(i);
			switch(nextChar)
			{
			case 'a': case 'b': case 'c': case 'd': case 'e': 
			StackValue.push(ValueOf(nextChar));
			break;
			
			case '+': case '-': case'*': case'/': case '^': 
				Double Two = StackValue.pop();
				Double One = StackValue.pop();
				Double result = compute (One, Two, nextChar);
				StackValue.push(result);
				break; 
				
				default: break;
			}
		}
		
		return (StackValue.peek()).doubleValue();	
	}
	private static double ValueOf(char letter) {
		switch (letter) {
		case 'a': return 2.0;
		case 'b': return 3.0;
		case 'c': return 4.0;
		case 'd': return 5.0;
		case 'e': return 6.0;
		}
		return 0;
	}
	private static Double compute(Double One, Double Two, char operator) {
		double result;
		switch(operator) {
		case'+': 
			result = One.doubleValue()+ Two.doubleValue();
			break;
			
		case'-': 
			result = One.doubleValue() - Two.doubleValue();
			break;
			
		case'*': 
			result = One.doubleValue() * Two.doubleValue();
			break; 
			
		case'/': 
			result = One.doubleValue() / Two.doubleValue();
			break;
			
		case'^': 
			result = Math.pow(One.doubleValue(), Two.doubleValue());
			break;
			
			default:
				result = 0;
				break;
		}
		return result;
	}
	
}
