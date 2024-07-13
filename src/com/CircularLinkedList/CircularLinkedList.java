package com.CircularLinkedList;

public class CircularLinkedList {
    public class Node{
        private int value;
        private Node next;
        Node(int value){
            this.value=value;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    CircularLinkedList(){
        size=0;
    }
    public void insert(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.next=head;
        tail=newNode;
        size++;

    }
    //deleting from al
    public void delete(int value){
        Node node=head;
        if(node==null){
            return;
        }
        if(node.value==value){
            head=head.next;
            tail.next=head;
            return;
        }
        do{Node n=node.next;
            if(n.value==value){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);
    }
    public void display(){
        Node temp=head;
        if(head!=null) {
            do {
                System.out.println(temp.value+"->");
                temp=temp.next;
            }while(temp!=head);
        }
    }
}
