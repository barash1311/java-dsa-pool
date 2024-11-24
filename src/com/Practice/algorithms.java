package com.Practice;

import java.util.Arrays;

public class algorithms {
    public static boolean linear(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }
    public static boolean binarySearch(int[] arr,int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                return true;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
//    bubble sort
//    compare the addjact values and swap them
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionsort(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
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
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr2={8,7,6,5,4,3,3,2,1,0};
        int[] arr={1,2,3,4,5,6,7,8,9,10};
       boolean exits= linear(arr2,4);
       System.out.println(exits);
       boolean exits1= binarySearch(arr2,4);
        System.out.println(exits1);
        bubbleSort(arr2);
        selectionsort(arr2);
        insertion(arr2);

    }
}
