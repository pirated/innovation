package com.algo.graph.weighted;

/**
 * Created by sanjay.nayak on 5/3/16.
 */
public class GraphTest {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(0, 1, 0);
        graph.addEdge(0, 7, 1);
        graph.addEdge(1, 7, 1);
        graph.addEdge(1, 2, 1);
        graph.addEdge(2, 3, 0);
        graph.addEdge(2, 5, 0);
        graph.addEdge(2, 8, 1);
        graph.addEdge(3, 4, 1);
        graph.addEdge(3, 5, 1);
        graph.addEdge(4, 5, 1);
        graph.addEdge(5, 6, 1);
        graph.addEdge(6, 7, 1);
        graph.addEdge(7, 8, 1);

        graph.initialize();
    }
}
