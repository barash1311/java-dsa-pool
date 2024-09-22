package com.Sorting;

import java.util.Arrays;

public class Quick {
    public static void qs(int[] arr,int low,int high){
        if(low<high){
            int partition=par(arr,low,high);
            qs(arr,low,partition-1);
            qs(arr,partition+1,high);
        }
    }
    public static int par(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<pivot && i<=high){
                i++;
            }
            while(arr[j]>pivot && j>=low){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        return j;
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,4,5};
        System.out.println(Arrays.toString(arr));
        qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
