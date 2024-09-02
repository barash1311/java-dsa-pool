package com.java;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year=sc.nextInt();
        if(year%4==0 && year%100!=0 ||year%400==0){
// it means that leap uear have exactly 366 days and it is not a centuary and has less than 400 days or we can say that it have

            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }

    }
}
