package com.algo.graph.weighted;

import java.util.*;

/**
 * Created by sanjay.nayak on 5/3/16.
 */
public class Graph {

    private List<Node> graph = new ArrayList<>();
    private boolean[][] isVisited;
    private Map<Integer,List<Node>> map = new HashMap<>();

    public void addEdge(int from, int to, int weight) {
        graph.add(new Node(from, to, weight));
    }

    protected void initialize() {
        isVisited = new boolean[graph.size()][graph.size()];
    }

    public void findShortestPathSourcetoEachNode() throws Exception {
        for (Node node : graph) {
            if(map.containsKey(node.getFrom())){
                map.get(node.getFrom()).add(node);
            }else{
                List<Node> nodes = new ArrayList<>();
                nodes.add(node);
                map.put(node.getFrom(), nodes);
            }
        }


        for(Map.Entry<Integer,List<Node>> entry :  map.entrySet()){

            if(entry.getKey()==0){
                List<Node> nodes = entry.getValue();

            }
        }

    }
}
