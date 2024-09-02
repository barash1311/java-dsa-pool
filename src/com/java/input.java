package com.java;
import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int su=0;
        int n;
        do {
            n = sc.nextInt();
            su += n;
        }while(n!=0);


        System.out.println("sum="+su);
    }
}
