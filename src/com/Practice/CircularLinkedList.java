package com.Practice;

import java.util.*;
public class CircularLinkedList{
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
    }
    Node head;
    Node tail;
    int size;
    public void insert(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            tail=newNode;
            size++;
            return;
        }
        tail.next=newNode;
        newNode.next=head;
        tail=newNode;
        size++;
        return;
    }
    public void delete(int value){
        if(head==null)return;
        Node temp=head;
        if(temp.value==value){
            if(head==tail){
                head=null;
                tail=null;
            }
            else{
                head=head.next;
                tail.next=head;
            }
            return;
        }
        do{
            Node nextNode=temp.next;
            if(nextNode.value==value){
                if(nextNode==tail){
                    tail=temp;
                }
                temp.next=nextNode.next;
                break;
            }
            temp=temp.next;
        }while(temp!=head);

    }

}