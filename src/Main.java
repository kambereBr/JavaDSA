import datastructures.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        // LinkedList
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        // linkedList : [10, 20, 30]

        linkedList.addFirst(5);
        // linkedList : [5, 10, 20, 30]

        linkedList.removeFirst();
        linkedList.contains(5); // returns false
    }
}