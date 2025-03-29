package com.Hashing;

import java.util.HashMap;

public class Hashmap {
    static void printfreq(int[] arr){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            Integer c=hm.get(arr[i]);
            if(c==null){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],++c);
            }
        }
        System.out.println(hm);
    }
    public static void main(String[] args) {
        int[] arr={1,1,3,3,2,2,5,5,6,6,6};
        printfreq(arr);
    }
}
