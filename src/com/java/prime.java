package com.java;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check:");
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("nota prime or composite number");
        }
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.println("not prime number");
                }
            }
            System.out.println("prime");

        }



}
