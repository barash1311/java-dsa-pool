package com.Arrays;

public class Largest {
    public static int lar(int[] arr){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr={5,5,4,3,2,1};
        int largest=lar(arr);
        System.out.println(largest);
    }
}
