package com.Strings;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringPrint {
    public static void main(String[] args){
//        int[] count=new int[26];
//        String str="geeksforgeeks";
//        for(int i=0;i<str.length();i++){
//            count[str.charAt(i)-'a']++;
//        }
//        for(int i=0;i<26;i++){
//            if(count[i]>0){
//                char s = (char)(i + 'a') ;
//                System.out.println(s+" "+ count[i]);
//            }
//        }
//        System.out.println("--");
//        System.out.println(count.length);
//        char[] arr={'g','e','k','s'};
//        System.out.println(Arrays.toString(arr));
//        String arr2=new String("geels");
//        System.out.println(arr2.toCharArray());
//        StringBuffer sb= new StringBuffer("Barash");
//        String str="BARASH SHARMA";
//        System.out.println(str.length());
//        System.out.println(str.charAt(0));
//        System.out.println(str.substring(3));
//        System.out.println(str.substring(3,12));
//        String s1="barash sharma";
//        String s2="barash";
//        System.out.println(s1.equals(s2));
        String s1="f or";
        String s2="geeksforgeks";
        int answer=s1.compareTo(s2);
        if(answer==0){
            System.out.println("same");
        }
        else if(answer==1){
            System.out.println("s1 is greater");
        }
        else{
            System.out.println("s2 is greater");
        }

    }
}
