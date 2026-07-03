package com.easybytes.springsecsection1.DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode200NumberOfIslands{
    public static void main(String[] args) {

        int[][] matrix = {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,1}};
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int count=0;
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1 && !visited[i][j]){
                    dfs(i, j, matrix, visited);
                    count++;
                }
            }
        }
        System.out.println("count = "+count);
    }


    private static void dfs(int i, int j, int[][] matrix, boolean[][] visited) {
        if(i<0||j<0||i> matrix.length-1|| j > matrix[0].length-1 ||
                 visited[i][j]){
            return;
        }
        visited[i][j]=true;
        dfs(i+1,j,matrix,visited);
        dfs(i-1,j,matrix,visited);
        dfs(i,j-1,matrix,visited);
        dfs(i,j+1,matrix,visited);
    }
}

