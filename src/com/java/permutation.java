package com.java;

import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total elements:");
        int n=sc.nextInt();
        System.out.println("enter the element to chose:");
        int r=sc.nextInt();
//        p(n,r)
        int result=factorial(n)/factorial(n-r);
        System.out.println("the result is:"+result);
        int result2=factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println("the result is :"+result2);

    }
    public  static int factorial(int n){
        int result=1;
        while(n>0){
            result=result*n;
            n--;
        }
        return result;
    }
}
