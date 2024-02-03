package algorithms.string;

import java.util.Stack;

public class BalancedExpression {
    public boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(')
                stack.push('(');
            if (ch == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
