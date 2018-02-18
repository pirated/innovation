package com.algo.tree.level;
// Java program to print nodes at k distance from root

import java.util.LinkedList;
import java.util.Queue;

/* A binary tree node has data, pointer to left child
   and a pointer to right child */
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinaryTree
{
    Node root;

    void printKDistant(Node node, int k)
    {
        if (node == null)
            return;
        if (k == 0)
        {
            System.out.print(node.data + " ");
            return;
        }
        else
        {
            printKDistant(node.left, k - 1);
            printKDistant(node.right, k - 1);
        }
    }

    public int getLevel(Node node, int data, int level){

        if(node.data==data){
            return level;
        }
        getLevel(node.left,data,level++);
        if(level!=0)
            return  level;
        getLevel(node.right,data,level++);
        return level;
    }

    public void printCousinOfNode(Node root, Node node){

        int level = getLevel(root,4,0);
        printKDistant(root,level);
    }

    public boolean isIdentical(Node root1, Node root2){

        if(root1.left!=root2.left && root1.right!=root2.right)
            return false;

        isIdentical(root1.left,root2.left);
        isIdentical(root1.right,root2.right);
        return true;
    }



    public void largestIdenticalSubTree(Node node){

        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while (q.isEmpty()){
            Node current = q.poll();

            if(current.left==current.right){
                System.out.println(" "+current.data);
                System.out.println(" "+current.left.data+" , "+current.right.data);
            }
        }
    }


    public int isMirror(Node left, Node right, int height){
        try {
            if(left.left==null && right.left!=null || left.right==null && right.right!=null)
                return 0;
            if(right.left==null && left.left!=null || right.right==null && left.left!=null)
                return 0;
            int tempHeight =  isMirror(left.left,right.left, height++);
            if(tempHeight>0)
                return height;
            return isMirror(left.right,right.right, height++);
        }catch(Exception e){
            throw e;
        }
    }

    int maxHeight = 0;
    Node nodeWithMaxHeight = null;
    public Node findLargestIdenticalSubTree(Node node){

        int height = isMirror(node.left,node.right, 0);
            if(height>maxHeight){
                maxHeight = height;
            }
        return node;
    }

    /* Driver program to test above functions */
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();

        /* Constructed binary tree is
                1
              /   \
             2     3
            /  \   /
           4    5 8
        */
     /*   tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(8);*/

        /*          50
                /      \
              10       60
             /  \     /   \
            5   20   70    70
                    / \   / \
                  65  80 65  80
        */
        tree.root  = new Node(50);
        tree.root.left = new Node(10);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(20);
        tree.root.right.left = new Node(70);
        tree.root.right.left = new Node(70);
        tree.root.right.left.left = new Node(65);
        tree.root.right.left.right = new Node(80);
        tree.root.right.right.left = new Node(65);
        tree.root.right.right.right = new Node(80);

        System.out.println("largest mirror tree start at Node : ");
    }
}
