package NinjaCodingPractice;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        System.out.println(isValidParenthesis(s));
		String s1 = "[()]{}{[()()]()}";
        String s2 = "[[}[";

        System.out.println(isValidParenthesis(s1) ? "Balanced" : "Not Balanced");
        System.out.println(isValidParenthesis(s2) ? "Balanced" : "Not Balanced");
    }
    public static boolean isValidParenthesis(String s) {
        // Write your code here.
    	Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Step 1: Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Step 2: Handle closing brackets
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Step 3: Final check
        return stack.isEmpty();
    }
}
