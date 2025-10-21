package TIER2.task4;

import java.util.Stack;

public class ValidPharentesiesChecker {

    public static boolean check(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if (!isMatch(open, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatch(char open, char close) {
        return
            (open == '(' && close == ')') ||
            (open == '{' && close == '}') ||
            (open == '[' && close == ']');

    }
}
