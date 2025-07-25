package com;

public class practice {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    Node sortedInsert(Node head,int key){
        Node newNode=new Node(key);
        if(head==null || head.data>=key){
            newNode.next=head;
            head=newNode;
            return head;
        }
        Node current=head;
        while(current.next!=null && current.next.data>key){
            current=current.next;
        }
        newNode.next=current.next;
        current.next=newNode;
        return head;
    }

    public static void main(String[] args) {

    }
}
