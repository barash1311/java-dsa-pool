package com.java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string:");
        String str=sc.nextLine();
        System.out.println(str);
        String temp="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            temp+=ch;
        }
        if(temp.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
