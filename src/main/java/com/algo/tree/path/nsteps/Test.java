package com.algo.tree.path.nsteps;

/**
 * Created by sanjay.nayak on 8/20/16.
 */
public class Test {

    public static void main(String[] args) {

        Tree bt = new Tree();
        bt.insert(11);
        bt.insert(2);
        bt.insert(13);
        bt.insert(41);
        bt.insert(51);
        bt.insert(61);
        bt.insert(70);
        bt.insert(18);
        bt.insert(90);



        bt.display(bt.getRoot(),"root");
        bt.bfs();

    }
}
