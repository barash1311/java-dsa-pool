package com.RevisionMaths;

public class Rope {
    public static void main(String[] args){
        int n=23;
        int output=maxPieces(n,11,9,12);
        System.out.println(output);
    }
    public static int maxPieces(int n,int a,int b,int c){
        if(n==0) return 0;
        if(n<=0) return -1;
        int res0=Math.max(maxPieces(n-a,a,b,c),maxPieces(n-b,a,b,c));
        int res1=Math.max(res0, maxPieces(n-c,a,b,c));
        if(res1==-1)return -1;
        return res1+1;
    }
}
