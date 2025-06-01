package com.RevisionMaths;

public class PalindromeNumbers {
    public static void main(String[] args){
        int number=121;
        boolean output=isPalindrome(number);
        System.out.println(output);
    }
//    public static boolean isPalindrome(int number){
//        if(number <0){
//            return false;
//        }
//        String str=Integer.toString(number);
//        String rev=new StringBuilder(str).reverse().toString();
//        return str.equals(rev);
//    }---------------taking big of n
//    public static boolean isPalindrome(int number){
//        int n=number;
//        int rev=0;
//        if(n<=0)return false;
//        while(n!=0){
//            int last=n%10;
//            rev=rev*10+last;
//            n=n/10;
//        }
//        return rev==number;
//    }----------------------taking o(d)
    public static boolean isPalindrome(int number){
        if(number<0 || number%10==0 && number!=0)return false;
        int rev=0;
        while(number>rev){
            rev=rev*10+number%10;
            number/=10;
        }
        return rev==number|| number==rev/10;
    }// time complexity is log10(d)
}

