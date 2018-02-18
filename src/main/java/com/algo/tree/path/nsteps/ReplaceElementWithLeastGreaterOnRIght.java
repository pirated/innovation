package com.algo.tree.path.nsteps;

import com.algo.tree.*;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sanjay.nayak on 8/20/16.
 * <p>
 * Given an array of integers, replace every element with the least greater element on its right side in the array.
 * If there are no greater element on right side, replace it with -1.
 */
public class ReplaceElementWithLeastGreaterOnRIght {


    public static void main(String args[]) {

        int[] array = {8, 58, 71, 18, 31, 32, 63, 92,
                43, 3, 91, 93, 25, 80, 28};
        System.out.println(new ReplaceElementWithLeastGreaterOnRIght().replaceElements(array));

    }

    public int[] replaceElements(int[] array) {
        try {
            Tree tree = new Tree();
            for (int element : array) {
                tree.insert(element);
            }
            tree.display(tree.getRoot(),"root");
            replace(tree.getRoot());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    private void replace(Node node) {
        Queue<Node> q = new LinkedBlockingQueue<Node>();
        Node item;
        if (node != null) {
            q.add(node);
            System.out.println(node.getData());
            while (!q.isEmpty()) {
                item = (Node) q.remove();

                if (item != null) {
                    if (item.getLeft() != null) {
                        q.add(item.getLeft());
                        System.out.println("-->" + item.getLeft().getData());
                    }else{
                        System.out.println("-->" +"-1");
                    }
                    if (item.getRight() != null) {
                        q.add(item.getRight());
                    }else{
                        //System.out.println("-->" +"-1");
                    }
                }
            }
        }
    }

}
