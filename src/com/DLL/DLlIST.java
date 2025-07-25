package com.DLL;

import static com.DLL.DLlIST.Node.*;

public class DLlIST {
    public static Node head;
    public static int size;
    public static void main(String[] args) {
        head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        temp2.next=null;
        printList(head);
        insertBegin(1);
        insertBegin(2);
        printList(head);
        insertEnd(4);
        printList(head);
    }
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }

         public static void printList(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"<==>");
                temp=temp.next;
            }
            System.out.println("null");
        }

        public static void insertBegin(int data){
             Node newNode=new Node(data);
             newNode.next=head;
             newNode.prev=null;
             if(head!=null){
                 head.prev=newNode;
             }
             head=newNode;
             size++;
        }
        public static void insertEnd(int data){
            Node newNode=new Node(data);
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
            size++;
        }
        public static Node reverse(Node head){
            if(head==null || head.next==null) return head;
            Node prev=null;
            Node curr=head;
            while(curr!=null){
                prev=curr.prev;
                curr.prev=curr.next;
                curr.next=prev;
                curr=curr.next;
            }
            return head;
        }
        public static void deleteHead(){
            if(head==null || head.next==null) return;
            head=head.next;
            head.prev=null;
            size--;
        }
        public static void deleteEnd(){
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            size--;
        }
    }
}
