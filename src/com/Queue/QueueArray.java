package com.Queue;

public class QueueArray {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    QueueArray(int capacity){
        this.capacity=capacity;
        this.arr=new int[capacity];
        this.front=0;
        this.rear=-1;
        this.size=0;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        rear=(rear+1)%capacity;
        arr[rear]=data;
        size++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data=arr[front];
        front=(front+1)%capacity;
        size--;
        return data;
    }
    public int peek(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public boolean isFull(){
        return size==capacity;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int getSize(){
        return size;
    }
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"<-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray queue=new QueueArray(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.print();


    }
}
