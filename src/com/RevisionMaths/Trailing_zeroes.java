package com.RevisionMaths;

public class Trailing_zeroes {
    public static void main(String[] args){
        int number=5;
        int result=countTrailingZeroes(number);
        System.out.println(result);
    }
//    public static  int countTrailingZeroes(int n){
//        int fact=1;
//        for(int i=2;i<=n;i++){
//            fact*=i;
//        }
//        int count=0;
//        while(fact%10==0){
//            count++;
//            fact/=10;
//        }
//        return count;
//    }-->O(n)
    public static int countTrailingZeroes(int number){
        int count=0;
        for(int i=5;i<=number;i=i*5){
            count+=number/i;
        }
        return count;
    }
}
