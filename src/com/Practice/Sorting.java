package com.Practice;

import java.util.Arrays;

public class Sorting {
//    1.bubble sort
    public static void bubblesort(int[] arr,int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr,int n){
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<=arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr={5,5,4,3,2,2,1,0,-1};
        System.out.println(Arrays.toString(arr));
        selection(arr,arr.length-1);
    }
}
