package com.java;

import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
//        0 0 1 1 2 3 5
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int result=0;
        int counter=2;
        System.out.println(a+" "+b);
        while(counter!=n){
            result=a+b;

            System.out.println(" "+result+" ");
            a=b;
            b=result;
            counter++;
        }
    }
}
