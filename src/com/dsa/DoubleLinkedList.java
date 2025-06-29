package com.dsa;

public class DoubleLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head;
    public int size;
    DoubleLinkedList(){this.size=0;}
//    insert at first
    public void insertFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=null;
            newNode.prev=null;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        head.next.prev=newNode;
        size++;
        return;
    }
    public void insertLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            insertFirst(data);
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        newNode.next=null;
        size++;

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
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next.prev=newNode;
        temp.next=newNode;
        newNode.prev=temp;
        size++;
        return;
    }
//    deleting from the list
    public void deleteFirst(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
        return;
    }
    public void deleteLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        size--;
        return;
    }
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
        temp.next.prev=temp.prev.prev;
        size--;
    }
    public void reversal(){
        Node current=head;
        Node temp=null;
        while(current!=null){
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }
        if(temp!=null){
            head=temp.prev;
        }
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<==>");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args){
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.print();
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.print();
        list.insert(100,2);
        list.print();
        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();
        list.delete(2);
        list.print();
        list.reversal();

    }
}
