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
    //inserting at a particlar index
    public void insert(int index,int value){
        Node newNode=new Node(value);
        if(index==0){
            insertFirst(value);
            size++;
            return;
        }
        if(index==size-1){
            size++;
            insertLast(value);
            return ;
        }
        Node temp=head;
        //because 0 index is head itself
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }
    //deleting form the first
    public void removeFirst(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;
        size--;

    }
    public void removeLast(){
        if(head==null){
            return ;
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
    //method to get the index node
    public Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    //deleting at a particular index
    public int delete(int index){
        if(index==0){
            removeFirst();
        }
        if(index==size-1){
            removeLast();
        }

        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
        }
        //fid the particular node
    public Node find(int value){
        Node temp=head;
        while(temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;
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
