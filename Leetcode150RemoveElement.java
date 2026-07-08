package com.easybytes.springsecsection1.DSA;

public class Leetcode150RemoveElement{
    public int removeElement(int[] nums, int val) {
        List<Integer> indicesOfVal = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if(nums[i]==val){
                indicesOfVal.add(i);
            }
            i++;
        }
        System.out.println("Number of vals "+indicesOfVal.size()+" - "+indicesOfVal);
        if(indicesOfVal.size()==0) return nums.length;
        i=nums.length-1;
        int count=0;
        while(i>=0){
            if(nums[i]!=val){
                //Starting from back if we find an element that is not val -> we put that value at the index where val was found
                nums[indicesOfVal.get(count)]=nums[i];
                count++;
            }
            if(count==indicesOfVal.size()) break;
            i--;
        }
        return nums.length-indicesOfVal.size();
    }
}