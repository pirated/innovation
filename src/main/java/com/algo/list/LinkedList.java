package com.algo.list;

/**
 * Created by sanjay.nayak on 6/20/17.
 */
public class LinkedList {

    Node head;

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        tail().next = new Node(data);
    }

    private Node tail() {
        Node tail = head;
        // Find last element of linked list known as tail
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + ",");
            current = current.next;
        }
    }


    public int length() {
        int length = 0;
        Node current = head;  // Starts counting from head - first node
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }


}
