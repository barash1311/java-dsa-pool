package com.RevisionMaths;

import java.util.Arrays;

public class Part {
    public static void main(String[] args){
        int[] arr={80,30,90,40,10,50,70};
        qSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void partition(int[] arr,int l,int h,int p){
        int[] temp=new int[h-l+1];
        int index=0;
        for(int i=l;i<=h;i++){
            if(arr[i]<=arr[p] && i!=p){
                temp[index]=arr[i];
                index++;
            }
        }
        temp[index]=arr[p];
        index++;
        for(int i=l;i<=h;i++){
            if(arr[i]>arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=l;i<=h;i++){
            arr[i]=temp[i-l];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int lPartition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return (i+1);
    }
    public static int hPartition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low-1;
        int j=high+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }
            while(arr[j]>pivot);
            if(i>=j) return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void qSort(int[] arr,int low,int high){
        while(low<high){
            int p=hoarePartition(arr,low,high);
//            qSort(arr,low,p-1);
            qSort(arr,low,p);
//            qSort(arr,p+1,high);
            low=p+1;
        }
    }
    public static int lomutoPartition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return (i+1);
    }
    public static int hoarePartition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low-1;
        int j=high+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j) return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }


}

