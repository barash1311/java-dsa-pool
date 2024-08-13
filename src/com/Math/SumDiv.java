package com.Math;

public class SumDiv {
    public static void main(String[] args) {
        int num=4;
        int totalsum=0;
        for(int i=1;i<=num;i++){
            int sum=0;
            for(int j=1;j<=Math.sqrt(i);j++){
                if(i%j==0) {
                    sum += j;
                }
                    if(j!=i/j){
                        sum+=i/j;
                    }

            }
            totalsum+=sum;
        }
        System.out.println(totalsum);
    }
}
