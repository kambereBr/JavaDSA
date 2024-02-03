package algorithms.string;

import java.util.Stack;

public class BalancedExpression {
    public boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(')
                stack.push('(');
            if (ch == ')')
                stack.pop();
        }

        return stack.isEmpty();
    }
}
