package com;

public class DoubleLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=head;
        print(head);
        Node start=insertFirstSmart(head,1);
        print(start);
        Node end=insertLast(head,50);
        print(end);
        print(start);
    }
    public static void print(Node head){
        Node temp=head;
        if(head==null) return;
        do{
            System.out.print(temp.data);
            temp=temp.next;

            if(temp!=head){
                System.out.print("-->");
            }
        }while(temp!=head);
        System.out.println();
    }
    public static Node insertFirst(Node head,int data){
        Node temp=new Node(data);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        Node curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }
        curr.next=temp;
        temp.next=head;
        return temp;
    }
    public static Node insertFirstSmart(Node head,int data){
        Node temp=new Node(data);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        else{
            temp.next=head.next;
            head.next=temp;
            int t=head.data;
            head.data=temp.data;
            temp.data=t;
            return temp;
        }
    }
    public static Node insertLast(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
            insertFirst(newNode,data);
            return newNode;
        }
        else{
            newNode.next=head.next;
            head.next=newNode;

            int temp=head.data;
            head.data=newNode.data;
            newNode.data=temp;
            return newNode;
        }
    }
    public static Node deleteHead(Node head){
        if(head==null){
            return null;
        }
        if(head.next==head){
            return null;
        }
        Node temp=head.next;
        head.data=temp.data;
        head.next=temp.next;
        return head;
    }
    public static Node deleteKth(Node head,int k){
        if(head==null){
            return null;
        }
        if(k==1){
            deleteHead(head);
        }
        Node curr=head;
        for(int i=0;i<k-2;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }

}
