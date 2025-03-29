package com.dsa;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    int size=0;
    public static Node head;
    LinkedList(){this.size=0;}
//    insertion at linked list
    public  void insertFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
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
        size++;
        return;
    }
//    inserting at a specific position
    public  void  insert(int data,int index){
        Node newNode =new Node(data);
        if(index==0){
            insertFirst(data);
            return;
        }
        if(index==size-1){
            insertLast(data);
            return;
        }
        Node temp=head;
//        as 0 th index as head
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }
//    delete the nodes
    public void deleteFirst(){
        if(head.next==null){
            head=null;
        }
        if(head==null){
            return;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;
        size--;
    }
    public void deleteLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            deleteFirst();
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        size--;
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
        size--;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

//    print of linked list
    public   void traverseLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static boolean search(Node head,int target){
        while(head!=null){
            if(head.data==target){
                return true;
            }
            head=head.next;
        }
        return false;
    }
    public  int length(){
        int length=0;
        Node temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }

    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.traverseLinkedList();
        list.insertLast(4);
        list.insertLast(5);
        list.traverseLinkedList();
        System.out.println(list.length());
        list.insert(200,1);
        list.traverseLinkedList();
        list.deleteFirst();
        list.traverseLinkedList();
        list.deleteLast();
        list.traverseLinkedList();
        list.delete(2);
        list.traverseLinkedList();


    }

}
