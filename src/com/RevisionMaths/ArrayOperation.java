package com.RevisionMaths;

import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args){

    }
    public static int insert(int[] arr,int n,int x,int cap,int pos){
        if(n==cap){
            return n;
        }
        int index=pos-1;
        for(int i=n-1;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=x;
        return (n+1);
    }
    public static int delete(int[] arr,int n,int x){
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==x) break;
        }
        if(i==n) return n;
        for(int j=i;j<=n-1;j++){
            arr[j]=arr[j+1];
        }
        return (n-1);
    }
    public static int largest(int[] arr ,int n){
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static int secondLargest(int[] arr,int n){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        return (secondLargest==Integer.MIN_VALUE)?-1:secondLargest;
    }
    public static boolean checkSorted(int[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }
        return true;
        //this is having the time complexity of 0(n^2)
    }
    public static boolean checkSorted2(int[] arr,int n){
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void reverse(int[] arr,int n){
        int i=0;
        int j=n-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static int removeDuplicates(int[] arr,int n){
        int[] temp=new int[n];
        temp[0]=arr[0];
        int res=1;
        for(int i=1;i<n;i++){
            if(temp[res-1]!=arr[i]){
                temp[res]=arr[i];
                res++;
            }
        }
        for(int i=0;i<res;i++){
            arr[i]=temp[i];
        }
        return res;
    }
    public static void movetoEnd(int[] arr,int n){
        for(int i=0;i<=n;i++){
            if(arr[i]==0){
                for(int j=i+1;j<=n;j++){
                    if(arr[j]!=0){
                        swap(arr[i],arr[j]);
                    }
                }
            }
        }
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void moveToEnd2(int[] arr,int n){
        int count=0;
        for(int i=0;i<=n;i++){
            if(arr[i]!=0){
                swap2(arr,arr[i],arr[count]);
                count++;
            }
        }
    }
    public static void swap2(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
