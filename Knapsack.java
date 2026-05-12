package com.easybytes.springsecsection1.DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Knapsack {
    public static void main(String[] args) {
        //the goal is to select a subset of items, each with a specific weight and value,
        //to maximize the total value while ensuring the total weight does not exceed a fixed capacity constraint

        int[] wt ={1,2,5,4,5,6};
        int[] val ={4,8,3,4,5,6};
        int W=10;
        Knapsack obj = new Knapsack();
        int res = obj.knapsack(wt, val, W, wt.length);
        System.out.println("Knapsack = "+res);
    }

    public int knapsack(int[] wt, int[] val, int W,int n){
        //Base condition to return or in case when using memoization or top down this is the first row tabulation
        if(W==0|| n==0) return 0;
        if(wt[n-1]<=W) {
            //we can choose it and add the value or we can avoid it consider rest of the array
            return Math.max(val[n - 1] + knapsack(wt, val, W - wt[n - 1], n - 1), knapsack(wt, val, W, n - 1));
        }
        else  {
            return knapsack(wt, val, W, n-1);
        }
    }
}
