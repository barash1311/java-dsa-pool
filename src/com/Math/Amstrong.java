package com.Math;
import java.util.*;
public class Amstrong {
    public static boolean amstrong(int num){
        int originalnum=num;
        int count=(int)Math.log10(num)+1;
        int sum=0;
        while(num!=0){
            sum+=(int)Math.pow(num%10,count);
        }
        return true;
    }





    public static void main(String[] args) {
//        this function is used to find whether a number is amstrong or not
        Scanner sc=new Scanner(System.in);
        System.out.println("amstrong number");
        System.out.print("enter the number:");
        int value=sc.nextInt();
        System.out.println("amstrong number"+ amstrong(value));
    }
}
