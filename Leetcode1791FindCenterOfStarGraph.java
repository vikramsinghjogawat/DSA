
package com.easybytes.springsecsection1.DSA;


public class Leetcode1791FindCenterOfStarGraph {
    public static void main(String[] args) {
      Leetcode1791FindCenterOfStarGraph obj = new Leetcode1791FindCenterOfStarGraph();
      int[][] edges = {{1,2},{2,3},{4,2}};
      int res = obj.findCenter(n, trust);
        
      System.out.println("Star node is = "+res);
    }
  public int findCenter(int[][] edges) {
        int[] scores = new int[edges.length+2];
        for(int[] i: edges){
            scores[i[0]]++;
            scores[i[1]]++;
        }
        for(int i=0;i<scores.length;i++){
            if(scores[i]==edges.length) return i;
        }
        return -1;
    }
}
