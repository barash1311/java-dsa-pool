package com.Stack;

public class LStack {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private  Node top;
    private int size;
    public LStack(){
        top=null;
        size=0;
    }
    public  void push(int value){
        Node newNode=new Node(value);
        newNode.next=top;
        top=newNode;
        size++;
    }
    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("stack underflow");
        }
        int value=top.data;
        top=top.next;
        size--;
        return value;
    }
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("stack underflow");
        }
        return top.data;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public void printStack(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LStack stack=new LStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printStack();
        stack.push(6);
        stack.printStack();
        System.out.println(stack.pop());
        stack.printStack();

    }
}
