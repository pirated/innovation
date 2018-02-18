package com.algo.graph.traversal;

/**
 * Created by sanjay.nayak on 5/3/16.
 */
public class GraphTest {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(0, 1);
        graph.addEdge(0, 7);
        graph.addEdge(1, 7);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 5);
        graph.addEdge(2, 8);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 7);
        graph.addEdge(7, 8);

        //new DFS().dfsTraversal(graph);
        new BFS().bfsTraversal(graph);
    }
}
