package com.Stack;

public class KStack {
    private int[] arr;
    private int[] top;
    private int[] next;
    private int n,k;
    private int free;
    public static void main(String[] args) {

    }

    public KStack(int k,int n){
        this.k=k;
        this.n=n;
        arr=new int[n];
        top=new int[k];
        next=new int[n];

        for(int i=0;i<k;i++){
            top[i]=-1;
        }
        free=0;
        for(int i=0;i<n-1;i++){
            next[i]=i+1;
        }
        next[n-1]=-1;
    }
    public void push(int stackNum,int x){
        if(free==-1){
            throw new IllegalStateException("stack overflow");
        }
        int i=free;
        free=next[i];
        arr[i]=x;
        next[i]=top[stackNum];
        top[stackNum]=i;
    }
    public  int pop(int stackNum){
        if(top[stackNum]==-1){
            throw new IllegalStateException("stack underflow");
        }
        int i=top[stackNum];
        top[stackNum]=next[i];
        next[i]=free;
        free=i;
        return arr[i];
    }


}
