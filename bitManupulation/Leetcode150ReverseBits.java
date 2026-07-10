package com.easybytes.springsecsection1.DSA.bitManupulation;

public class Leetcode150ReverseBits {
  public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res |= (n & 1);
            n = n >> 1;
        }
        return res;
    }
}
