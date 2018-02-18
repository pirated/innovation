package com.algo.cache;

/**
 * Created by sanjay.nayak on 4/30/17.
 */

public class Node {

    private  int from;
    private  int weight;
    private  int to;

    public Node(int from, int to , int weight) {
        this.from=from;
        this.to=to;
        this.weight=weight;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }
}
