package com.easybytes.springsecsection1.DSA;

public class Main
{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
        //To reverse this array
        int n = arr.length;
        int temp;
        for(int i=0;i<n/2;i++){
            temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-i-1] =temp;
        }

        for (int i : arr) {
            System.out.print(i +" ");
        }
	}
}
