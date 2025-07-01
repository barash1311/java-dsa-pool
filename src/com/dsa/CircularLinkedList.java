package com.dsa;

public class CircularLinkedList {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    Node tail;
    public int size;
    CircularLinkedList(){this.size=0;}
//    inserting at the begining
    public void insertFirst(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=head;
            size++;
            return;
        }
        else {
            newNode.next = head;
            head=newNode;
            tail.next=head;
            size++;
            return;
        }
    }
    public void insertLast(int data){
        Node newNode=new Node(data);
        if(tail==null){
            insertFirst(data);
            return;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next=head;
            size++;
            return;
        }

    }
    public void insert(int data,int index){
        Node newNode=new Node(data);
        if(index==0){
            insertFirst(data);
        }
        if(index==size-1){
            insertLast(data);
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }
//    delete the first node
    public void deleteFirst(){
        if(head==null || tail==null){
            return;
        }
        if(head.next==null || tail.next==null){
            head=null;
            tail=null;
        }
        Node temp=head;
        tail.next=head.next;
        head=head.next;
        temp.next=null;
        size--;
    }
//    delete last
    public void deleteLast(){
        if(head==null || tail==null){
            return;
        }
        if(head.next==null || tail.next==null){
            head=null;
            tail=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=tail.next;
        tail=temp;
        size--;
    }
//    delete from specific indiex
    public void delete(int index){
        if(index==0){
            deleteFirst();
        }
        if(index==size-1){
            deleteLast();
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
        return;
    }

    public void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("head");



    }
    public static void main(String[] args){
        CircularLinkedList list=new CircularLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(5);
        list.insertLast(6);
        list.print();
        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();
        list.delete(1);
        list.print();
    }
}
