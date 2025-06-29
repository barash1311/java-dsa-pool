package com.Hashing;

import java.util.Hashtable;

public class hash {
    public static void main(String[] args) {
//        we are implementin the hashtable
        Hashtable<Integer,String> hm=new Hashtable<>();
//        input the value
        hm.put(1,"a");
        hm.put(3,"b");
        hm.put(2,"c");
        hm.put(4,"d");
        System.out.println(hm);
    }
}
