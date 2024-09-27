package com.Sorting;

import java.util.Arrays;

public class bubble {
    public static void bubbleSort(int[] arr,int n){
//        using simple loops for the calculation of the loops
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void SelectionSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }

            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }


    }
    public static  void insertionSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int j=i;
            while(j-->0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={21,3,5};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
