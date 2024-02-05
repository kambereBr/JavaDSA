package algorithms.string;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression {
    private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private final List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');
    public boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push('(');

            if (isRightBracket(ch)) {
                if (stack.isEmpty()) return false;

                var top = stack.pop();
                if (!bracketsMatch(top, ch)) return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean bracketsMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
