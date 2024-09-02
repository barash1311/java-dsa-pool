package com.java;
import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        System.out.print("enter the power you want:");
        int power=sc.nextInt();
        int count=power;

        int result=1;
        while(count!=0){
            result*=power;
            count--;
        }
// n power
        System.out.println("power is "+result);

    }
}
