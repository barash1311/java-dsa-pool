package com.RevisionMaths;

public class OneOdd {
    public static void main(String[] args) {
        int[] arr={7,3,3,2,7,7,7};
        int output=countOneOdd(arr);
        System.out.println(output);
    }
    public static int countOneOdd(int[] arr){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count%2!=0){
                return arr[i];
            }
        }
        return -1;
    }
}
