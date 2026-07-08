package com.easybytes.springsecsection1.DSA;

public class Leetcode3754ConcatenateNonZeroDigitsAndMultiplyBySumI{
    public long sumAndMultiply(int n) {
        long con = 0;
        long sum = 0;
        long z = 1;
        while(n>0){
            int r = n%10;
            n=n/10;
            if(r!=0){
                con+=r*z;
                z=z*10;
                sum+=r;
            }
            //System.out.println(con);

        }
        return sum*con;
    }
}