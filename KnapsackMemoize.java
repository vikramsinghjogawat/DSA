package com.easybytes.springsecsection1.DSA;

import java.util.Arrays;

public class KnapsackMemoize {
    static int[][]  t = new int[7][11];
    public static void main(String[] args) {
        int[] wt ={1,2,5,4,5,6};
        int[] val ={4,8,3,4,5,6};
        int W=10;
        for(int[] row:t){
            Arrays.fill(row,-1);
        }
        KnapsackMemoize knapsackMemoize = new KnapsackMemoize();
        int res = knapsackMemoize.knapsack(wt, val, W, wt.length);
        System.out.println("res = "+res);
    }
    public int knapsack(int[] wt, int[] val, int W,int n){

        //Base condition to return or in case when using memoization or top down this is the first row tabulation
        if(W==0|| n==0) {
            return 0;
        }
        if(t[n][W]!=-1) return t[n][W];
        if(wt[n-1]<=W) {
            //we can choose it and add the value or we can avoid it consider rest of the array
            t[n][W] =  Math.max(val[n - 1] + knapsack(wt,val,W-wt[n-1],n-1), knapsack(wt, val, W, n-1));
        }
        else  {
            t[n][W]=knapsack(wt, val, W, n-1);
        }
        return t[n][W];
    }
}
