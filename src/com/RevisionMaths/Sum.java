package com.RevisionMaths;

public class Sum {
    public static void main(String[] args) {
//        int n=5;
//        int output=sum(n);
//        System.out.println(output);
//        String str="abbcbbaa";
//        int start=0;
//        int end=str.length()-1;
//        boolean accepted=isPalindrome(str,start,end);
//        System.out.println(accepted);
        int number=123;
        int output=sumDigit(number);
        System.out.println(output);
    }
    public static int sum(int n){
        if(n==0)return 0;
        return n+sum(n-1);
    }
    public static boolean isPalindrome(String str,int start,int end){
        if(start>=end) return true;
        return (str.charAt(start)==str.charAt(end))&& isPalindrome(str,start+1,end-1);
    }
    public static int sumDigit(int n){
        if(n==0) return 0;
        return n%10+sumDigit(n/10);
    }
}
