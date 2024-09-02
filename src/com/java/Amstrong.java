package com.java;
import java.util.*;
public class Amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int temp=n;
        int result=0;
//        logic is to find the cubic sun
        while(n!=0){
            result+=Math.pow(n%10,3);
            n=n/10;
        }
        if(result==temp){
            System.out.println("no is amstrong");
        }
        else{
            System.out.println("no is not amstrong");
        }
    }
}
