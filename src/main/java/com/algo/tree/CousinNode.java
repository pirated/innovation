package com.algo.tree;

/**
 * Created by sanjay.nayak on 6/22/17.
 */
public class CousinNode {

    /*Not using queue based approach - just for change*/
    public boolean checkIfCousinNodes(Node root, int a, int b) {

        return level(root, a, 0) == level(root, b, 0) && !isSibling(root, a, b);
    }

    public int level(Node node, int ptr, int level) {

        if (node.data == ptr) {
            return level;
        }

        level(node.left, ptr, level + 1);

        level = 0;//reset level for right traversal
        level(node.right, ptr, level + 1);
        return level;
    }

    private boolean isSibling(Node root, int a, int b) {
        return false;
    }
}
