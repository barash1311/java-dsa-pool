package com.Stack;

public class TwoStacks {
    private int[] arr;
    private int top1,top2;
    private int capacity;

    public TwoStacks(int capacity) {
        if(capacity<=0){
            throw new IllegalArgumentException("capacity must be greater than 0");
        }
        this.capacity=capacity;
        arr=new int[capacity];
        top1=-1;
        top2=capacity;
    }
    public void push1(int x){
        if(top1+1==top2){
            throw new IllegalArgumentException("<UNK>");
        }
        top1++;
        arr[top1]=x;
    }
    public void push2(int x){
        if(top2-1==top1){
            throw new IllegalArgumentException("<UNK>");
        }
        top2--;
        arr[top2]=x;
    }
    public int pop1(){
        if(top1==-1){
            throw new IllegalArgumentException("<UNK>");
        }
        return arr[top1--];
    }
    public int pop2(){
        if(top2==capacity-1){
            throw new IllegalArgumentException("<UNK>");
        }
        return arr[top2++];
    }
    public boolean isEmpty1(){
        return top1==-1;
    }
    public boolean isEmpty2(){
        return top2==capacity-1;
    }
}
