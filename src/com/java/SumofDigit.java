package com.java;

import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println("the sum is :"+sum);
    }
}
