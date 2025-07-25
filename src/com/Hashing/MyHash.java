package com.Hashing;

public class MyHash {
    int capacity;
    int size;
    int[] arr;
    MyHash(int c){
        capacity=c;
        size=0;
        for(int i=0;i<capacity;i++){
            arr[i]=-1;
        }
    }
    int hash(int key){
        return key%capacity;
    }
    boolean search(int key){
        int h=hash(key); //key % bucketSize(size of structure)
        int i=h;
        while(arr[i]!=-1){
            if(arr[i]==key){
                return true;
            }
            i=(i+1)%capacity;
            if(i==h){return true;}
        }
        return false;
    }
    boolean insert(int key){
        if(size==capacity)return false;
        int i=hash(key);
        while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key){
            i=(i+1)%capacity;
        }
        if(arr[i]==key){return false;}
        else{
            arr[i]=key;
            size++;
            return true;
        }
    }
    boolean erase(int key){
        int h=hash(key);
        int i=h;
        while(arr[i]!=-1){
            if(arr[i]==key){
                arr[i]=-2;
                return true;
            }
            i=(i+1)%capacity;
            if(i==h) return false;
        }
        return false;
    }
    public static void main(String[] args){


    }
}
