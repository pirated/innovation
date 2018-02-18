package com.algo.graph.traversal;

import java.util.*;

/**
 * Created by sanjay.nayak on 5/3/16.
 */
public class Graph {

    private int V;
    private List<Integer> adj[];

    public Graph(){
        V = 10;
        adj = new LinkedList[V];
        for (int i = 0; i < V ; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w){
      adj[v].add(w);
    }


    public int getV() {
        return V;
    }

    public void setV(int v) {
        V = v;
    }

    public List<Integer>[] getAdj() {
        return adj;
    }

    public void setAdj(List<Integer>[] adj) {
        this.adj = adj;
    }
}
