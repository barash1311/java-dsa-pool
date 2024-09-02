package com.java;
import java.util.*;
public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=-1;
        int n;
        int sum=0;

        do{
            System.out.print("enter the number:");
            n=sc.nextInt();
            sum+=n;
            count++;
        }
        while(n!=0);
        System.out.println("the avg is :"+sum/count);



    }
}
