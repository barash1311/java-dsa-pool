package com.CustomQueue;

import com.CustomStack.CustomStack;

public class CustomQueue {
    private int[] data;
    public static final int DEFAULT_SIZE=10;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data=new int[size];
    }
    public int end=0;
    public boolean isFull(){
        return end==data.length;
    }
    public boolean isEmpty(){
        return end==0;
    }
    public void insert(int value) throws Exception{
        if(isFull()){
            throw new Exception("queue is full");
        }
        data[end]=value;
        end++;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        int value=data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return value;
    }
    public int head() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[0];
    }
    public void display(){
        for(int i=0;i<end;i++){
            System.out.print("|"+data[i]);
        }
        System.out.println("|");
    }
}
