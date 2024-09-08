package com.java;
import java.util.*;
public class Kunalday {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("as august have 31 days");
        int totaldays=31;
        int count=0;
        for( int i=1;i<=totaldays;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("total days kunal can be:"+count);
    }
}
