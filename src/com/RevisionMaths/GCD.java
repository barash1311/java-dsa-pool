package com.RevisionMaths;

public class GCD {
    public static void main(String[] args) {
        int number1=12;
        int number2=18;
        int result=gcd(number1,number2);
        System.out.println(result);
    }
//    public static int gcd(int a,int b){
//        int result=Math.min(a,b);
//        while(result>0){
//            if (a % result == 0 && b % result == 0) {
//                return result;
//            }
//            result--;
//        }
//        return 1;
//    }-->O(m,n)
//    public static int gcd(int a,int b){
//        while(a!=b){
//            if(a>b) a=a-b;
//            else b=b-a;
//        }
//        return a;
//    }
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}

