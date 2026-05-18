package com.easybytes.springsecsection1.DSA;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String input = "vikram";
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse(input));
        System.out.println(reverseString.reverseUsingSB(input));

    }
    public String reverse(String input){
        char[] arr = input.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            char temp = arr[i];
            arr[i ] = arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return new String(arr);
    }
    public String reverseUsingSB(String input){
        if(input==null) return null;
        return new StringBuilder(input).reverse().toString();
    }
}
