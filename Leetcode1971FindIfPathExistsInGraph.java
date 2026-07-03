
package com.easybytes.springsecsection1.DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode1971FindIfPathExistsInGraph {
    public static void main(String[] args) {
        int[][] edges = {{0,1},{0,2},{3,5},{5,4},{4,3}};
        int nodes = 6;
        int source = 0;
        int destination=5;

      //creating adj list
        List<List<Integer>> adj = new ArrayList<>(nodes);
        for (int i = 0; i < nodes; i++) {
            adj.add( new ArrayList<>());
        }
        System.out.println("adj = "+adj);
      //populating adj list
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        System.out.println("adj = "+adj);
        //Implement bfs
        boolean flag = false;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[nodes];
        queue.add(source);
        visited[source]=true;
        while(!queue.isEmpty()){
            int m = queue.poll();
            System.out.println(m);
            List<Integer> neighboursOfM = adj.get(m);
            for(int i:neighboursOfM){
                if(!visited[i]) {
                    queue.add(i);
                    visited[i]=true;
                }
                if(i==destination){
                    flag = true;
                    break;
                }
            }
            System.out.println("queue = "+queue);
        }
        if(flag) System.out.println("Yes path exists!!!");
        if(!flag) System.out.println("Nope path does not exist!!!");

    }
}
