package com.algo.graph.traversal;

import java.util.Iterator;
import java.util.List;

/**
 * Created by sanjay.nayak on 6/26/17.
 */
public class DFS {

    public void dfsTraversal(Graph graph) {

        int vertexs = graph.getV();
        List<Integer>[] adj =  graph.getAdj();
        boolean[] visited = new boolean[vertexs];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        
        dfs(graph.getAdj(),0,visited);
    }

    private void dfs(List<Integer>[] adjs,int vertexs, boolean[] visited) {

        if(visited[vertexs]==true)
            return;
        else
            visited[vertexs] = true;

        System.out.print(" \n"+vertexs);

        Iterator it = adjs[vertexs].listIterator();
        while(it.hasNext()){
            Integer n = (Integer)it.next();
            if(!visited[n])
            dfs(adjs,n,visited);

        }
    }
}
