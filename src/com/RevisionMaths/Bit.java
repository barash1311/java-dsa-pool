package com.RevisionMaths;

public class Bit {
    public static void main(String[] args){
        boolean output=checkKthBit(10,1);
        System.out.println(output);
    }
    public static boolean checkKthBit(int n,int k){
        String Binary=Integer.toBinaryString(n);
        int length=Binary.length();
        if(length<=k) return false;
        return Binary.charAt(length-1-k)=='1';
    }//o(logn)
    public static boolean checkKthBit2(int n,int k){
        return (n&(1<<k))!=0;
    }//0(1)
}
