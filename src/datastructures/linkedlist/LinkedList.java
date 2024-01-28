package datastructures.linkedlist;

import java.util.NoSuchElementException;

/**
 * LinkedList represents a linear data structure where elements are stored in nodes.
 * Each node contains a value and a reference to the next node in the sequence.
 * This implementation provides methods for adding elements at the beginning or end,
 * finding the index of an element, checking for the presence of an element,
 * and removing the first element. It offers a dynamic way to manage and manipulate
 * collections of elements in a connected sequence.
 */

public class LinkedList {
    // Inner Node class representing elements of the linked list
    private class Node {
        private int value;
        private Node next;

        // Constructor for creating a new Node with a given value
        public Node(int value) {
            this.value = value;
        }
    }

    // References to the first and last nodes of the linked list
    private Node first;
    private Node last;

    // Add a new node with the given item at the end of the linked list
    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            // If the list is empty, set both first and last to the new node
            first = last = node;
        } else {
            // Otherwise, update the next reference of the last node and move the last reference to the new node
            last.next = last = node;
        }
    }

    // Add a new node with the given item at the beginning of the linked list
    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            // If the list is empty, set both first and last to the new node
            first = last = node;
        } else {
            // Otherwise, update the next reference of the new node and move the first reference to the new node
            node.next = first;
            first = node;
        }
    }

    // Find the index of the first occurrence of the given item in the linked list
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while(current != null) {
            // Iterate through the list until the item is found, then return its index
            if (current.value == item) return index;
            current = current.next;
            index++;
        }

        // Return -1 if the item is not found in the list
        return -1;
    }

    // Check if the linked list contains the given item
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    // Remove the first node from the linked list
    public void removeFirst() {
        if (isEmpty())
            // Throw an exception if the list is empty
            throw new NoSuchElementException();

        if (first == last) {
            // If there is only one node, set both first and last to null
            first = last = null;
            return;
        }

        // Update the first reference to the second node and disconnect the old first node
        var newFirst = first.next;
        first.next = null;
        first = newFirst;
    }

    // Check if the linked list is empty
    private boolean isEmpty() {
        return first == null;
    }
}
