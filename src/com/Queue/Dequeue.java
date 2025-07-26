package com.Queue;

public class Dequeue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Dequeue(int capacity){
        this.capacity=capacity;
        this.arr=new int[capacity];
        this.front=-1;
        this.rear=0;
        this.size=0;
    }
    public void addFirst(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(front==-1){
            front=0;
            rear=0;
        }
        else if(front==0){
            front=capacity-1;
        }
        else{
            front--;
        }
        arr[front]=value;
        size++;
    }
    public void addLast(int value){
        if(isFull()){
            System.out.println("Dequeue is fULL");
            return;
        }
        if(front==-1){
            front=0;
            rear=0;
        }
        else if(rear==capacity-1){
            rear=0;
        }
        else{
            rear++;
        }
        arr[rear]=value;
        size++;
    }
    public int removeFirst(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return -1;
        }
        int data=arr[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else if(front==capacity-1){
            front=0;
        }
        else{
            front++;
        }
        size--;
        return data;
    }
    public int removeLast() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }

        int data = arr[rear];

        // Only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        // Circular decrement
        else if (rear == 0) {
            rear = capacity - 1;
        }
        else {
            rear--;
        }

        size--;
        return data;
    }

    public boolean isFull(){
        return size==capacity;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public static void main(String[] args) {

    }
}
