package com.Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class hashh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter the size of the array:");
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int[] hash=new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
//        System.out.print("enter the elements to be fetched:");
//        int q=sc.nextInt();
//        while(q!=0){
//            int number=sc.nextInt();
//            q--;
//        }

        for (int i = 0; i < hash.length; i++) {
            System.out.print("[ "+i+","+hash[i]+" ]");
        }
    }
}
