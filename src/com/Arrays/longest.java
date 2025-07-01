package com.Arrays;

import java.util.HashMap;

public class longest {
    public static int longestprefix(int[] arr,int k){
        int maxlength=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    maxlength=Math.max(maxlength,j-i+1);
                }
            }
        }
        return maxlength;
    }
    public static int lomg(int[] arr,int k){
        int maxlength=0;
        int n=arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=prefix[j]-(i>0?prefix[i-1]:0);
                if(sum==k){
                    maxlength=Math.max(maxlength,j-i+1);
                }
            }
        }
        return maxlength;
    }
    public static int lomng(int[] arr,int k){
        int n=arr.length;
        int maxlength=0;
        int currentSum=0;
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        for(int i=0;i<n;i++){
            currentSum+=arr[i];
            if(currentSum==k){
                maxlength=i+1;
            }
            if(hashmap.containsKey(currentSum-k)){
                int temp=i-hashmap.get(currentSum-k);
                maxlength=Math.max(maxlength,temp);
            }
            if(!hashmap.containsKey(currentSum)){
                hashmap.put(currentSum,i);
            }
        }



        return maxlength;
    }
    public static void main(String[] args) {
        int k=5;
        int[] arr= {3,1,-1,5,2,-6,1};
        int length=lomng(arr,k);
        System.out.println(length);
    }
}
