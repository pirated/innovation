package com.algo.list;

/**
 * Created by sanjay.nayak on 6/20/17.
 */
public class MiddleOfList {


    public void printMiddleOfList(LinkedList linkedList) {

        if (linkedList == null)
            return;

        int fPtr = 0;
        int sPtr = 0;
        Node head = linkedList.head;
        for (int i = 0; i < linkedList.length(); i++) {
            fPtr = fPtr + 1;
            sPtr = sPtr + 2;
            if (linkedList.length() == sPtr) {
                System.out.print("OUTPUT :: " + head.data);
                break;
            }
            head = head.next;
        }
    }

}
