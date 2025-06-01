package com.RevisionMaths;

import java.util.Arrays;

public class Prime {
    public static void main(String[] args){
        int number=36;
        boolean result=isPrime2(number);
//        System.out.println(result);
//        printPrime2(number);
//        allDivisors(number);
        printPrime3(36);
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean isPrime2(int n){
        if(n<=1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i<=Math.sqrt(n);i+=6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }//time complexity root(N)
    public static void printPrime(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                while(n%i==0){
                    System.out.println(i+ " ");
                    n=n/i;
                }
            }
        }
    }
    public static void printPrime2(int n){
                if(n<=1) return;
                while(n%2==0){
                    System.out.println(2+" ");
                    n=n/2;
                }
                for(int i=3;i<=Math.sqrt(n);i+=2){
                    while(n%i==0){
                        System.out.println(3+" ");
                        n=n/i;
                    }
                }
                if(n>2){
                    System.out.println(n);
                }
    }
    public static void allDivisors(int n){
        int i;
        for(i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        for(;i>=1;i--){
            if(n%i==0){
                System.out.println(n/i);
            }
        }
    }
    public static void printPrime3(int n){
        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,false);
        isPrime[0]=isPrime[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(isPrime[i]){
                for(int j=i*i;j<n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.println(i+" ");
            }
        }
    }

}
