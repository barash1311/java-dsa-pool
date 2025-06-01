package com.RevisionMaths;

public class CountNumber {
    public static void main(String[] args){
        int a=1234567878;
        int length=countDigits(a);
        System.out.println(length);
    }
//    public static int countDigits(int n){
//        return String.valueOf(n).length();//time complexity will be o(n)
//    }
//    public static int countDigits(int n){
//        int count=0;
//        while(n!=0){
//            count++;
//            n/=10;
//        }
//        return count;
//    }
    public static int countDigits(int n){
        if(n==0){
            return 1;
        }
        return (int)Math.floor(Math.log10(n))+1;
    }

}
