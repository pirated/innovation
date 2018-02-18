package com.algo.list.practise;

/**
 * Created by sanjay.nayak on 11/22/17.
 */
public class LinkedList {

    class Node{

        int data;
        Node next = null;

        public Node (int data){
            this.data = data;
        }

        public void append(int data){
            Node end = new Node(data);
            Node node = this;
            while(node.next!=null){
                node = node.next;
            }
            node.next = end;
            node.next.next = null;
        }

        public void delete(Node head, int data){
            Node node = head;
            while(node.next!=null){
                if( node.next.data == data) {
                    Node temp = node.next.next;
                    node.next = temp;
                    break;
                }
                node = node.next;
            }

        }
    }
}
