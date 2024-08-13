package com.Math;

public class Divisors {
    public static void main(String[] args) {
        int n=36;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
