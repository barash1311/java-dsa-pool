package com.Patterns.java;
import java.util.*;
public class rectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no if lines you want:");
        int n=sc.nextInt();
       /*
       * our taget is to create a rectangle of *
       * |****|
       * */
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
