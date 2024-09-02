package com.java;

import java.util.Scanner;

public class Numpalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("no is planindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
