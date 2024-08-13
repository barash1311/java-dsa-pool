package com.Math;

import java.util.Scanner;

public class Reverse {
//    program to create reverse of a number
    public static void reverse(int num){
        while(num>0){
            int last=num%10;
            System.out.print(last);
            num=num/10;
        }

    }
    public static void main(String[] args){
        System.out.println("lets Reverse a number");
        System.out.println("enter the number you want to reverse");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        reverse(num);


    }
}
