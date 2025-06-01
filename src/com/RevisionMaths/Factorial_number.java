package com.RevisionMaths;

public class Factorial_number {
    public static void main(String[] args){
        int factorial=5;
        int result=factorial(factorial);
        System.out.println(result);
    }
//    public static int factorial(int n){
//        if(n==0 || n==1){
//            return 1;
//        }
//        int fact=1;
//        for(int i=2;i<=n;i++){
//            fact=fact*i;
//        }
//        return fact;
//    }//5->5*4*3*2*1->o(n)
    public static int factorial(int n){
        if(n==0 || n==1)return 1;
        return n*factorial(n-1);
    }
}
