package com.algo.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by sanjay.nayak on 1/17/18.
 */
public class HackerRankTest {


    private static int V;
    private static List<Integer> adj[];

    public static void main(String[] args) {

        int m = 6;
        int n = 4;
        int tests[] = {1,1,0,1,0,0};
        Graph graph = new Graph(m, n);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(5, 6);
        new HackerRankTest().test(graph, tests, 0, n);

    }

    private void test(Graph graph, int[] tests, int m, int n) {

//        boolean[] visited = new boolean[]{false};
        for (int i = 0; i <tests.length; i++) {
            List edge = graph.getEdge(i);
            if(edge==null || edge.isEmpty()) {
               System.out.print(tests[i]==1?"YES"+"\n":"NO"+"\n");
            }else{
                //test(graph, tests, m, n);
                String result = "YES";
              ListIterator it = edge.listIterator();
              while(it.hasNext()){
                 int next =  (int)it.next();
                 if(tests[next-1]==0){
                     result = "NO";
                     break;
                 }
              }
                System.out.print(result+"\n");
            }
        }
    }

    static class Graph {
        public Graph(int vertices, int edges) {
            V = vertices;
            adj = new LinkedList[V];
            for (int i = 0; i < V; i++) {
                adj[i] = new LinkedList<>();
            }
        }

        public void addEdge(int v, int w) {
            adj[v].add(w);
        }

        public List<Integer>[] getEdges() {
            return adj;
        }

        public List<Integer> getEdge(int position) {
            if(position>=V)return null;
            return adj[position];
        }
    }


}
