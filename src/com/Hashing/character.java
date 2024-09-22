package com.Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String s=sc.next().trim();
        int[] hash=new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }

        System.out.print("enter the elements to be fetched for:");
        int q=sc.nextInt();
        while(q-->0){
            char ch=sc.next().charAt(0);
            System.out.println(hash[ch-'a']+" ");
//            q--;
        }
        System.out.println(Arrays.toString(hash));


    }
}
