package com.Math;

public class Prime {
    public static void main(String[] args) {
        int n=1;
        int counter=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                counter++;
            }

        }
        if(counter==2){
            System.out.println("primw");
        }
        else{
            System.out.println("not primw");
        }
    }
}
