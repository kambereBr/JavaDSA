package algorithms.string;

import java.util.Stack;

public class StringReverser {
    public String reverseWithStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray())
            stack.push(ch);

        StringBuffer reversed = new StringBuffer();
        while(!stack.empty())
            reversed.append(stack.pop());

        return reversed.toString();
    }

    public String reverse(String str) {
        StringBuffer reversed = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--)
            reversed.append(str.charAt(i));

        return reversed.toString();
    }
}
