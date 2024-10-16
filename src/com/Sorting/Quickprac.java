package com.Sorting;

import java.util.Arrays;

public class Quickprac {
    public static void quick(int[] arr,int low,int high){
        if(low<high){
            int pindex=partition(arr,low,high);
            quick(arr,low,pindex-1);
            quick(arr,pindex+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
