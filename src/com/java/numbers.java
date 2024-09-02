package com.java;

import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int negsum=0;
        int possumeven=0;
        int possumodd=0;
        do{
            System.out.println("Enter a number");
             n=sc.nextInt();
            if(n<0){
                negsum+=-n;
            }
            if(n>=0){
                if(n%2==0){
                    possumeven+=n;
                }
                else{
                    possumodd+=n;
                }
            }
        }while(n!=0);
        System.out.println(possumeven);
        System.out.println("-"+negsum);;
        System.out.println(possumodd);
    }
}
