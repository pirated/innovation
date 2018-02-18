package com.algo.list;

/**
 * Created by sanjay.nayak on 6/20/17.
 */
public class LinkedListTest {

    public static void main(String args[]) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        linkedList.print();

        //new MiddleOfList().printMiddleOfList(linkedList);
        //new NthFromLast().printNthFromLast(linkedList,2);
        LinkedList modifiedLinkedList = new PairWiseSwap().pairWiseSwapList(linkedList);
        modifiedLinkedList.print();
    }
}
