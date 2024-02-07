package datastructures.stack;

import java.util.Arrays;

/**
 * Represents a basic stack data structure implemented using an array.
 * Supports standard stack operations such as push, pop, peek, and provides
 * methods to check if the stack is empty and obtain a string representation
 * of its current contents.
 */

public class Stack {
    // Array to store stack elements
    private int[] items = new int[5];

    // Variable to keep track of the number of elements in the stack
    private int count;

    // Method to push an item onto the stack
    public void push(int item) {
        // Check for stack overflow
        if (items.length == count)
            throw new StackOverflowError();

        // Add the item to the stack and increment the count
        items[count++] = item;
    }

    // Method to pop an item from the stack
    public int pop() {
        // Check for an empty stack
        if (count == 0)
            throw new IllegalStateException();

        // Remove and return the top item from the stack
        return items[--count];
    }

    // Method to peek at the top item of the stack without removing it
    public int peek() {
        // Check for an empty stack
        if (count == 0)
            throw new IllegalStateException();

        // Return the top item of the stack
        return items[count - 1];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Override the toString method to provide a string representation of the stack
    @Override
    public String toString() {
        // Create a copy of the array containing only the elements in the stack
        var content = Arrays.copyOfRange(items, 0, count);

        // Convert the array to a string and return
        return Arrays.toString(content);
    }
}