package com.java;

import java.util.Scanner;

public class vovels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c;
        do {
             c = sc.next().charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("vovel");
            } else {
                System.out.println("not a vovel");
            }
        }while(c!=0);
    }
}
