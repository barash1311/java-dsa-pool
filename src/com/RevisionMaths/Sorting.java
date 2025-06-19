package com.RevisionMaths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;


public class Sorting {
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        selectionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void selectionSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
                int temp=arr[i];
                arr[i]=arr[min_index];
                arr[min_index]=temp;
            }
        }
    }
    public static void insertionSort(int[] arr,int n){
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
    }
    public static void mergeSort(int[] arr,int low,int high,int[] temp){
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        mergeSort(arr,low,mid,temp);
        mergeSort(arr,mid+1,high,temp);
        merge(arr,low,mid,high,temp);

    }
    public static void merge(int[] arr,int low,int mid,int high,int[] temp){
        int i=low;
        int j=mid+1;
        int k=high;

        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[i++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=high){
            temp[k++]=arr[j++];
        }
        for(int p=low;p<=high;p++){
            arr[p]=temp[p];
        }
    }
}
