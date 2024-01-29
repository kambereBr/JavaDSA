package algorithms.string;

import java.util.Stack;

/**
 * The StringReverser class provides methods for reversing strings.
 * It includes two implementations: one using a Stack and another using a simple loop.
 */
public class StringReverser {

    /**
     * Reverse a given string using a Stack.
     *
     * @param str The input string to be reversed.
     * @return The reversed string.
     */
    public String reverseWithStack(String str) {
        if (str == null)
            // Throw an exception if str is null
            throw new IllegalArgumentException();

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the Stack
        for (char ch : str.toCharArray())
            stack.push(ch);

        // Pop characters from the Stack and append to a StringBuffer
        StringBuffer reversed = new StringBuffer();
        while (!stack.empty())
            reversed.append(stack.pop());

        // Convert the StringBuffer to a String and return the result
        return reversed.toString();
    }

    /**
     * Reverse a given string using a simple loop.
     *
     * @param str The input string to be reversed.
     * @return The reversed string.
     */
    public String reverse(String str) {
        if (str == null)
            // Throw an exception if str is null
            throw new IllegalArgumentException();

        // Create a StringBuffer to store the reversed string
        StringBuffer reversed = new StringBuffer();

        // Iterate through the input string in reverse order and append each character
        for (int i = str.length() - 1; i >= 0; i--)
            reversed.append(str.charAt(i));

        // Convert the StringBuffer to a String and return the result
        return reversed.toString();
    }
}
