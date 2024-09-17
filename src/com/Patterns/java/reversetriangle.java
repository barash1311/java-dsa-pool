package com.Patterns.java;

import java.util.Scanner;

public class reversetriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                int r=Math.abs(j-n);
                System.out.print(r+" ");
            }
            System.out.println();
        }

    }
}
