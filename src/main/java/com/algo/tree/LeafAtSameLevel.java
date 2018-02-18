package com.algo.tree;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sanjay.nayak on 6/23/17.
 * Check if all leaves are at same level
 */
public class LeafAtSameLevel {

    Set<Integer> levels = new HashSet<>();

    public static void main(String args[]) throws Exception {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(20);
        tree.root.right.right = new Node(70);
        tree.root.right.left = new Node(45);
        tree.root.left.left.left = new Node(2);
        tree.root.left.left.right = new Node(7);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(25);
        tree.root.right.right.right = new Node(80);
        tree.root.right.right.left = new Node(65);


              /*  50
                 /    \
              30       60
             /  \     /  \
           5   20   45    70
          /\  /  \        /  \
         2  7 10  25    65    80*/

        boolean result = new LeafAtSameLevel().getLeafNodesAtSameLevel(tree.root,0);
        System.out.print("Is All leaf nodes are at same level : "+result);

    }

    private boolean getLeafNodesAtSameLevel(Node root, int level) {

        if(root==null) return true;
        if(root.left ==null && root.right ==null){
            levels.add(level);
            return levels.size()>1?false:true;
        }

         return getLeafNodesAtSameLevel(root.left,level+1) &
                 getLeafNodesAtSameLevel(root.right,level+1);
    }
}
