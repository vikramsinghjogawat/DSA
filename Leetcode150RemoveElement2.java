package com.easybytes.springsecsection1.DSA;

public class Leetcode150RemoveElement2 {
    public int removeDuplicates(int[] nums) {
        int k=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[k-2]){
                nums[k]=nums[i];
                k++;
            }
        }
          
        return k;
    }
}