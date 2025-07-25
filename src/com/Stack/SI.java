package com.Stack;

public class SI {
    //array implemenration of the stack
    private int[] data;
    private int top;
    public int capacity;
    public SI(int capacity){
        if(capacity<=0) {
            throw new IllegalArgumentException("capaicty must be greater than 0");
        }
        this.capacity = capacity;
        data=new int[capacity];
        top=-1;

    }
    public void push(int value){
        if(isFull()){
            throw new IllegalArgumentException("stack is full");
        }
        top++;
        data[top]=value;
    }
    public int pop(){
        if(isEmpty()){
            throw new IllegalArgumentException("stack is empty");
        }
        return data[top--];
    }
    public int peek(){
        if(isEmpty()){
            throw new IllegalArgumentException("stack is empty");
        }
        return data[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public  int size(){
        return top+1;
    }
    public void clear(){
        top=-1;
    }
    public void printStack(){
        if(top==-1){
            System.out.println("empty");
        }
        int start=top;
        for(int i=top;i>=0;i--){
            System.out.print(data[i]+"->");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        SI s=new SI(10);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.printStack();
        s.pop();
        s.printStack();
        s.pop();
        s.printStack();
        s.pop();
        s.printStack();
        System.out.println(s.size());
        s.clear();
        s.printStack();
        System.out.println(s.isFull());
        System.out.println(s.isEmpty());
    }
}
