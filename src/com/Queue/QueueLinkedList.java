package com.Queue;

public class QueueLinkedList {
        class  Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        public  Node front;
        public Node rear;
        public int size;

    public  QueueLinkedList(){
        this.front=null;
        this.rear=null;
        this.size=0;
    }
    public void enqueue(int data){
            Node newNode=new Node(data);

            if(rear==null){
                //first element
                front=rear=newNode;
            }
            else{
                rear.next=newNode;
                rear=newNode;
            }
            size++;
    }
    public int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int data=front.data;
            front=front.next;

            if(front==null){
                rear=null;
            }
            size--;
            return data;
    }
    public boolean isEmpty(){
            return size==0;
    }
    public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
    }
    public int getSize(){
            return size;
    }
    public void print(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+"<--");
            temp=temp.next;
        }
        System.out.println("null");
    }




    public static void main(String[] args) {
        QueueLinkedList list=new QueueLinkedList();
        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(4);
        list.print();
        list.enqueue(5);
        list.print();
        int output=list.dequeue();
        System.out.println(output);
        list.print();

    }
}
