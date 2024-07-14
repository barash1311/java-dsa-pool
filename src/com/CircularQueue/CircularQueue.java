package com.CircularQueue;

public class CircularQueue {
    protected int[] data;
    public static final int DEFAULT_SIZE= 10;
    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data=new int[size];
    }
    int front=0;
    int end=0;
    int size=0;
    public boolean isFull(){
        return size==data.length;
    }public boolean isEmpty(){
        return size==0;
    }
    public void insert(int value) throws Exception{
        if(isFull()){
            throw new Exception("queue is full");
        }
        data[end++]=value;
        end=end%data.length;
        size++;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        int removed=data[front++];
        front=front%data.length;
        size--;
        return removed;
    }
    public void display(){
        int i=front;
        do{
            System.out.println(data[i]);
            i++;
            i=i%data.length;
        }while(i!=end);
    }
}
