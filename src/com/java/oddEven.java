package com.java;
import java.util.*;

public class oddEven {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("enter the number:");
       int  n=input.nextInt();
        while(n!=0){
            if(n%2==0){
                System.out.println(" no is even");
                return;
            }else{
                System.out.println(" no is odd");
            }
        }
    }
}
