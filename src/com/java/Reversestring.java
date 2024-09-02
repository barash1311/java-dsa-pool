package com.java;
import java.util.*;
public class Reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
//        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not a palindrome");
        }
    }
}
