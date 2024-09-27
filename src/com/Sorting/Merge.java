package com.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge {
    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high) return;
        int middle=(low+high)/2;
        mergeSort(arr,low,middle);
        mergeSort(arr,middle+1,high);
        mergee(arr,low,middle,high);
    }
    public static void mergee(int[] arr,int low,int middle,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=middle+1;
        while(left<=middle && right<=high) {
            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
            while(left<=middle){
                temp.add(arr[left]);
                left++;
            }
            while(right<=high){
                temp.add(arr[right]);
                right++;
            }
            for(int i=low;i<=high;i++){
                arr[i]=temp.get(i-low);
            }


    }


    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2,6,3,4,5,6,7,8,9,1,0, 1 };
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
