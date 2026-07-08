package com.easybytes.springsecsection1.DSA;

public class Leetcode150MergerSortedArray{
    public static void main(String[] args){
        //Leetcode 88. Merge Sorted Array
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,5,6};
        int m=3;
        int n=3;

        //SOLUTION
        //Approach- start from back meaning decide last index in nums1

        int k=m+n-1;
        int i=m-1;
        int j=n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }

    }
}