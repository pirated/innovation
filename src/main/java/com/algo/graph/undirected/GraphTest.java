package com.algo.graph.undirected;

/**
 * Created by sanjay.nayak on 5/3/16.
 */
public class GraphTest {

    public static void main(String[] args){

        int height = 3;
        int width = 3;
        Graph graph = new Graph(height,width);

        String date = "2016-05-16 05:40:00";
        date = date.replaceAll(date.substring(10,date.length()), " 00:00:00");
        System.out.println("date : "+date);
    }
}
