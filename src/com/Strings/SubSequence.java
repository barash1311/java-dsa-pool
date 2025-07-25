package com.Strings;

public class SubSequence {
    public static void main(String[] args){
        String s1="geeksforgeeks";
        String s2="gerks";
        System.out.println(Subsequence(s1,s2));
    }
    public static boolean Subsequence(String str1,String str2){
        int i=0;
        int j=0;
        while(i!=str1.length() && j!=str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return j==str2.length();
    }
}
