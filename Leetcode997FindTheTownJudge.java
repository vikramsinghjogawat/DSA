
package com.easybytes.springsecsection1.DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode997FindTheTownJudge {
    public static void main(String[] args) {
        //
      Leetcode997FindTheTownJudge obj = new Leetcode997FindTheTownJudge();
      int[][] trust = {{1,3},{2,3},{3,1}};
      int n=3;
      int res = obj.findJudge(n, trust);
        
      System.out.println("Judge is = "+res);
    }
  public int findJudge(int n, int[][] trust) {
        if(n==1) return 1;
        int[] scores = new int[n+1];
        for(int[] i: trust){
            scores[i[0]]--;
            scores[i[1]]++;
        }
        for(int i=0;i<scores.length;i++){
            if(scores[i]==n-1) return i;
        }
        return -1;
    }
}
