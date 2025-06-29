package com.Math;

public class arm {
    public static boolean count(int n){
        double number=0;
        double real=n;
        int counter=(int)Math.log10(n)+1;
        while(n>0){
            int digit=n%10;
            number=number*10+Math.pow(digit,counter);
            n=n/10;
        }
        return number==real;
    }
    public static void main(String[] args) {
        int number=1634;
        System.out.println(count(number));
    }
}
