package com.RevisionMaths;

public class Count {
    public static void main(String[] args) {
        int output=countSetBits(16);
        System.out.println(output);
    }
    public static int countSetBits(int n){
        String binary=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1')count++;
        }
        return count;
    }
    public static int countSetBits2(int n){
        int count=0;
        while(n>0){
            count+=n%2;
            n/=2;
        }
        return count;
    }
    public static int countSetBits3(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }

}
