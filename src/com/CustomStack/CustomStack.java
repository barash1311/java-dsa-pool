package com.CustomStack;

public class CustomStack {
    protected int[] data;
    public static final int DEFAULT_SIZE=10;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data=new int[size];
    }
    public int ptr=-1;
    public void push(int value) throws Exception{
        //assuming that stack is full
        if(isFull()){
            throw new Exception("stack is full");
        }
        ptr++;
        data[ptr]=value;
    }
    public boolean isFull(){
        return ptr==data.length-1;
//        means that the pointer is at the last index
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
    public int pop() throws Exception{
        if (isEmpty()) {
            throw new  Exception("cannot pop from the empty stack");
        }
        int deleted=data[ptr];
        ptr--;
        return deleted;
    }
    public void printstacl(){
        int temp=ptr;
        while(temp!=-1){
            System.out.println("| "+data[temp]+" |");
            temp--;
        }
        System.out.println("-----");
    }

}
