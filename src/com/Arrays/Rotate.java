package com.Arrays;

import java.util.Arrays;

public class Rotate {
    public static void rotate(int[] arr,int k){
        int n=arr.length;
        if(n==0) return;
        k=k%n;
        if(k>n)return;
        int[] temp=new int[k];
        for(int i=n-k;i<n;i++){
            temp[i-n+k]=arr[i];
        }
        for(int i=n-k-1;i>=0;i--){
            arr[i+k]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        rotate(arr,3);
    }
}
