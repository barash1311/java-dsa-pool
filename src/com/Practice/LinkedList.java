package com.Practice;

import java.util.*;

public class LinkedList {
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    // declareing the head and size
    Node head;
    int size;

    LinkedList() {
        this.size = 0;
    }

    // inserting at initial
    public void insertfirst(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            size++;
        }
        newnode.next = head;
        head = newnode;
        size++;
    }

    // inserting from last
    public void insertlast(int val) {
        Node temp = head;
        Node newnode = new Node(val);
        if (head == null) {
            insertfirst(val);
        }
        while (temp != null) {
            temp.next = newnode;
            newnode.next = null;
            size++;
        }
    }

    // inserting at a particualr index
    public void insert(int index, int val) {
        if (index == 0) {
            insertfirst(val);
            size++;
            return;
        }
        if (index == size - 1) {
            insertlast(val);
            size++;
            return;
        }
        Node temp = head;
        Node newNode = new Node(val);
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return;
    }

    // delete first
    public int deletefirst() {
        Node temp = head;
        if (head.next == null) {
            head = null;
            size = 0;
        }
        head = head.next;
        int val = temp.val;
        temp.next = null;
        size--;
        return val;
    }
    // deleting from the last
    public int deletelast() {
        Node temp = head;
        if (head.next == null) {
            size--;
            return deletefirst();
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int val = temp.val;
        temp.next = null;
        size--;
        return val;
    }
    // delete from particular index
    public int delete(int index){
        Node temp=head;
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        int val=temp.next.val;
        temp.next=temp.next.next;
        size--;
        return val;
    }
    // getiing a particilar index
    public Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.next;
    }
    // find the particular element
    public boolean find(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.val==val){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    // printing the element
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void bubblesort(){
        if(head==null){
            return;
        }
        boolean swapped;
        Node ist;
        Node prev=null;
        do{
            swapped=false;
            ist=head;
            while(ist.next!=prev){
                if(ist.val>ist.next.val){
                    int temp=ist.val;
                    ist.val=ist.next.val;
                    ist.next.val=temp;
                    swapped=true;
                }
                ist=ist.next;
            }
            prev=ist;
        }while(swapped);
    }
}
