package com.algo.list;

/**
 * Created by sanjay.nayak on 6/20/17.
 */
public class PairWiseSwap {

    /* 1->2->3->4->5->6 */
    public LinkedList pairWiseSwapList(LinkedList linkedList){

        Node current = linkedList.head;
        while (true){
            if(current==null) break;
            int tmp = current.data;
            current.data = current.next.data;
            current.next.data = tmp;

            current = current.next.next;
        }
        return linkedList;
    }
}
