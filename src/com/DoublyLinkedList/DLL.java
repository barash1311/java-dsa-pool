package com.DoublyLinkedList;

public class DLL {
    public class Node{
        private int value;
        private Node next;
        private Node prev;
        public Node(int value){this.value=value;}
    }
    private Node head;
    private int size;
    DLL(){size=0;}
    //inserting al first position
    public void insertFirst(int value){
        Node newNode=new Node(value);
        newNode.next=head;
        newNode.prev=null;
        if(head!=null){
            head.prev=newNode;
        }
        head=newNode;
        size++;
    }
    //inserting at the last
    public void insertLst(int value){
        Node newNode=new Node(value);
        Node temp=head;
        if(head==null){
            insertFirst(value);
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        newNode.next=null;
        size++;
    }
    //inserting at a particular index
    public void insert(int index,int value){
        Node newNode=new Node(value);
        if(index==0){
            insertFirst(value);
            size++;
            return;
        }
        if(index==size){
            insertLst(value);
            size++;
            return;
        }
        Node previous=get(index-1);
        newNode.next=previous.next;
        previous.next.prev=newNode;
        previous.next=newNode;
        newNode.prev=previous;
        size++;
    }
    //get method to get a particular index
    public Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    //deleting from fist
    public void deleteFirst(){
        if(head==null){
            size=0;
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

    }
    //deleting from the last
    public void deleteLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;

    }
    //delete from a particular index
    public void delete(int index){
        if(index==0){
            deleteFirst();
        }
        if(index==size){
            deleteLast();
        }
        Node first=get(index-1);
        Node remove=first.next;
        first.next=remove.next;
        remove.next.prev=first;
        remove.next=null;
        remove.prev=null;
        size--;

    }
    public void display(){
        Node temp=head;
        System.out.print("null <==> ");
        while(temp!=null){
            System.out.print(temp.value+" <==> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    //printing in reverse order
    public void reverseDisplay(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            last=temp;
            temp=temp.next;
        }
        while(last!=null){
            System.out.print(last.value+"<==>");
            last=last.prev;
        }
        System.out.print("null");
    }
}
