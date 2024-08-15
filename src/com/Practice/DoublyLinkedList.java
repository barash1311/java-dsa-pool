package com.Practice;


import java.util.*;
public class DoublyLinkedList{
    public class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value){
            this.value=value;
        }
    }
    Node head;
    int size;
    public DoublyLinkedList(){
        this.size=0;
    }
    // inserting from the first
    public void insertfirst(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            head.prev=null;
            head.next=null;
            size++;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;
        return;
    }
    // inserting at the last
    public void insertlast(int value){
        Node newNode=new Node(value);
        if(head==null){
            insertfirst(value);
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        size++;
        return;
    }
    // inserting at a particular position
    public void insert(int index,int value){
        Node newNode=new Node(value);
        if(index==0){
            insertfirst(value);
        }
        if(index==size-1){
            insertlast(value);
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        newNode.prev=temp;
        temp.next.prev=newNode;
        size++;
        return;
    }
    // deleting from first
    public int deletefirst(){
        if(head.next==null){
            head=null;
            head.next=head.prev=null;
        }
        Node temp=head;
        head=head.next;
        head.prev=null;
        int val=temp.value;
        temp.next=temp.prev=null;
        size--;
        return val;
    }
    // deleting from the last
    public int deletelast(){
        if(head.next==null){
            return deletefirst();
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int val=temp.next.value;
        temp.next.prev=null;
        temp.next=null;
        size--;
        return val;
    }
    // deleting from a particluar index
    public int delete(int index){
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        int val=temp.next.value;
        temp.next=temp.next.next;
        temp.next.next.prev=temp;
        temp.next.prev=null;
        temp.next.next=null;
        size--;
        return val;
    }
    // reversal of the linked list
    public void reverse(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp.prev!=null){
            temp=temp.prev;
            System.out.println(temp.value);
        }
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" < = >");
            temp=temp.next;
        }
        System.out.print("null");
    }

}