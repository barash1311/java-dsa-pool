package com.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String s1 = "geeg";
        System.out.println(palindromeCheck1(s1));
    }
    public static boolean palindromeCheck(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev.equals(str);
    }
    public static boolean palindromeCheck1(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


