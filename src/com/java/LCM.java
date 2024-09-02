package com.java;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        System.out.println("enter the number:");
        int m=sc.nextInt();
        int temp=0;
        for(int i=1;i<=n;i++){
            if(n%i==0 && m%i==0){
                temp=i;
            }
        }
        System.out.println(temp);
    }

}
