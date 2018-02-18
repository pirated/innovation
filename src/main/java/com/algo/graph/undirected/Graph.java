package com.algo.graph.undirected;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by sanjay.nayak on 5/3/16.
 */
public class Graph {

    private int[][] adjMatrix ;
    private boolean[][] visitedMatrix;
    private int pathCount = 0;
    private Map<Integer,List<Integer>> edgeMap;

    public Graph(int m, int n){
        adjMatrix = new int[m][n];
        visitedMatrix = new boolean[m][n];
    }

    public void addEdge(int m,int n){
        if(edgeMap.containsKey(m)){
            List<Integer>  edgeList =  edgeMap.get(m);
            edgeList.add(n);
            edgeMap.put(m,edgeList);
        }else{
            List<Integer>  edgeList = new ArrayList<>();
            edgeList.add(n);
            edgeMap.put(m,edgeList);
        }
    }

    public List getEdges(int m, int n){
      if(edgeMap==null || edgeMap.isEmpty() || !edgeMap.containsKey(m))
          return null;

        return  edgeMap.get(m);
    }

    public boolean isVisited(boolean[][] visitedMatrix, int m,int n){
        if(visitedMatrix[m][n]==true){
            return true;
        }
        return false;
    }

    public void markVisited(boolean[][] visitedMatrix, int m,int n){
        visitedMatrix[m][n]=true;
    }

    public boolean isPathExists(int[][] adjMatrix,boolean[][] visitedMatrix, int m, int n, int pathCount, int k){

        if(adjMatrix.length==0 )
            return false;

        if(pathCount>k)
            return true;

        List<Integer> edges = getEdges(m,n);

        if(edges==null){
            //TODO :need to check for m length exceeding the matrix row length
            isPathExists(adjMatrix,visitedMatrix,m+1,n,pathCount,k);
        }

        for(int edge : edges){

            boolean visited = isVisited(visitedMatrix,m,n);

            if(visited)
                continue;

            pathCount = pathCount+1;
            isPathExists(adjMatrix,visitedMatrix,m,edge,pathCount,k);

        }
        return false;
    }
}
