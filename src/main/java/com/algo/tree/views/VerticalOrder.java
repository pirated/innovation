package com.algo.tree.views;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/*                50
                /    \
             30       60
            /  \     /  \
           5    20 45    70
                         /  \
                       65    80*/

public class VerticalOrder {

    public void printInVerticalOrder(Node root) {

        Map<Integer,List<Node>> nodeMap = new TreeMap<>();
        root.weight = 0;
        Queue<Node> q = new LinkedBlockingQueue<>();
        q.add(root);

        while(!q.isEmpty()){
            Node node = q.poll();
            int weight = node.weight;

            if(node.left!=null){
                node.left.weight = weight-1;
                q.add(node.left);
            }
            if(node.right!=null){
                node.right.weight = weight+1;
                q.add(node.right);
            }
            if(nodeMap.containsKey(weight)) {
                nodeMap.get(weight).add(node);
            }else{
                List<Node> nodes = new ArrayList<>();
                nodes.add(node);
                nodeMap.put(weight,nodes);
            }
        }


        nodeMap.forEach((k,v)->{
            System.out.println("VERTICAL : "+k);
            v.forEach(value->{
                System.out.println("NODES : "+value.data);
            });

        });
    }
}
