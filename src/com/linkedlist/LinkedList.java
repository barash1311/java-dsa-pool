package com.linkedlist;

public class LinkedList {
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    LinkedList(){
        this.size=0;
     }
     public void insertFirst(int value){
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
        if(tail==null){
            tail=head;
        }
        size++;
     }
     //insering from the last
    public void insertLast(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            size++;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        size++;


    }
     public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
         System.out.println("null");
     }

}
