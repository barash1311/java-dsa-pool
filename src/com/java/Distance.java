package com.java;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x1 y1 coordinate:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("enter the x2 y2 coordinate:");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        System.out.print("("+x1+","+y1+")");
        System.out.print("-------------");
        System.out.print("("+x2+","+y2+")");
        System.out.println();
        double result=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("distance between two  above points is :"+(int)(result));



    }
}
