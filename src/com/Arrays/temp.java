package com.Arrays;
import java.util.Arrays;
public class temp {
    public static int brutesecond(int[] arr,int n){
        if(n<2)return -1;
        int secondlargest=-1;
        Arrays.sort(arr);
        int largest=arr[n-1];
        secondlargest=arr[n-2];
        return secondlargest;
    }
    public static int bettersecond(int[] arr,int n){
        if(n<2)return -1;
        int largest=arr[0];
        int slargest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<largest && arr[i]!=largest){
                slargest=arr[i];
                break;
            }
        }
        return slargest;
    }
    public static int optimized(int[] arr,int n){
        if(n<2) return -1;
        int largest=arr[0];
        int slargest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest && arr[i]!=largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,7,7};
        System.out.println(Arrays.toString(arr));
        int secondlargest=optimized(arr,arr.length-1);
        System.out.println(secondlargest);
    }
}
