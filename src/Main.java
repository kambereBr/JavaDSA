import algorithms.string.StringReverser;
import datastructures.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*  LINKEDLIST */

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


        /* STRING REVERSER */
        String str = "abcde";
        StringReverser stringReverser = new StringReverser();
        System.out.println(stringReverser.reverseWithStack(str)); // edcba
        System.out.println(stringReverser.reverse(str)); // edcba
    }
}