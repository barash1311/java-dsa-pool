package com.java;
import java.util.*;
public class lar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest=0;
        int n;
        do {
            System.out.println("Enter the number:");
             n = sc.nextInt();
            if (n > largest) {
                largest = n;
            }
        }while(n!=0);
        System.out.println("largest="+largest);
    }
}

