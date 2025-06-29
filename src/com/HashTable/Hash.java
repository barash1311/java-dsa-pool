package com.HashTable;

import java.util.LinkedList;
import java.util.ArrayList;
public class Hash {
    public static int BUCKET_SIZE;
    public static ArrayList<LinkedList<Integer>> table;
    public Hash(int b){
        BUCKET_SIZE=b;
        table=new ArrayList<LinkedList<Integer>>();
        for(int i=0;i<b;i++){
            table.add(new LinkedList<Integer>());
        }
    }
    public static void insert(int key,int value){
        int i=key % BUCKET_SIZE;
        table.get(i).add(key,value);
    };
    public static boolean search(int key,int value){
        int i=key % BUCKET_SIZE;
        return table.get(i).contains(key);
    };
    public static void delete(int key,int value){
        int i=key % BUCKET_SIZE;
        table.get(i).remove(key);
    };

    public static void main(String[] args){

    }
}
