package com.algo.graph.traversal;

import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sanjay.nayak on 6/26/17.
 */
public class BFS {

    public void bfsTraversal(Graph graph) {

        List<Integer> adj[] = graph.getAdj();
        boolean[] visited = new boolean[graph.getV()];

        Queue<Integer> q = new LinkedBlockingQueue<>();
        q.add(0);// source vertices
        visited[0] = true;

        while (!q.isEmpty()){

            int v = q.poll();
            List<Integer> adjs = adj[v];

            Iterator it = adjs.iterator();

            while(it.hasNext()){

                Integer n = (Integer)it.next();
                if(!visited[n]){
                    System.out.print("\n"+n);
                    visited[n]=true;
                    q.add(n);
                }
            }
        }
    }
}
