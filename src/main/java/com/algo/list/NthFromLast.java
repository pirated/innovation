package com.algo.list;

/**
 * Created by sanjay.nayak on 6/20/17.
 * NON WORKING : WIP
 */
public class NthFromLast {


    public void printNthFromLast(LinkedList linkedList, int n){

        Node headFirst = linkedList.head;
        Node head = headFirst;
        int fPtr = 0;
        int sPtr = 0;
        int length = 0;
        int index = -1;
        int current =0;

       while(head.next!=null){

            fPtr = fPtr+1;
            sPtr = sPtr+2;

            Node fHead = head.next;
            Node sHead = head.next.next;
            head = head.next;

            if(index==current) {
                System.out.print("Nth Element from End :: " + head.data);
                break;
            }

            if(sHead==null){
                length = sPtr;
                index = length-n;

                if(fPtr>index){
                    fPtr=0;
                    head = headFirst;
                }

            }
            current++;
        }
    }
}
