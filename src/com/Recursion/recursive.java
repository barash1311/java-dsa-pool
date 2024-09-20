package com.Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class recursive {
    public static int count=0;
    public static void fun(){
        if(count==5) return;
        System.out.println(count);
        count++;
        fun();
    }
    public static void  print1(int i,int n){
        if(i>n) {
            return;
//        i wan to print the nuber from one to n
        }
        print1(i+1,n);
        System.out.println(i);

    }
    public static void print2(int n){
        int i=0;
        if(i>n){
            return;
        }
        print2(i+1);
        System.out.println(i);
    }
    public static int finonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return finonacci(n-1)+finonacci(n-2);

    }
    public static void reverse(int[] arr,int left,int right){
        if(left>right) return;
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverse(arr,left+1,right-1);
    }
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
