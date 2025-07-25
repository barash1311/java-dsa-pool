package com;

public class SimpleLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static int Size;
    public static void main(String[] args){
        insertBegin(0);
        insertBegin(1);
        insertBegin(2);
        insertBegin(3);
        insertBegin(4);
        insertEnd(6);
        insertEnd(7);
        insertEnd(8);
        insertEnd(9);
        printList(head);
        head=reverse(head);
        printList(head);
    }
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static void recursiveDisplay(Node head){
        if(head==null) return;
        System.out.print(head.data+"->");
        recursiveDisplay(head.next);
    }
    public static void insertBegin(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        Size++;
    }
    public static void insertEnd(int data){
        Node newNode=new Node(data);
        Node curr=head;
        if(head==null){
            head=newNode;
            return;
        }
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.next=null;
        Size++;
    }
    public static void insert(Node head,int pos,int data){
        if(pos==1){
            insertBegin(data);
            Size++;
        }
        if(pos==Size-1){
            Size++;
            insertEnd(data);
        }
        Node curr=head;
        for(int i=1;i<pos;i++){
            curr=curr.next;
        }
        Node newNode=new Node(data);
        newNode.next=curr.next;
        curr.next=newNode;
        Size++;
    }
    public static Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public static void deleteFirst(){
        if(head==null){return;}
        if(head.next==null){head=null;}
        Node temp=head;
        head=head.next;
        temp.next=null;
        Size--;
    }
    public static void deleteEnd(){
        if(head==null){deleteFirst();return;}
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        Size--;
    }
    public static void delete(int index){
        if(index==1){deleteFirst();return;}
        if(index==Size-1){
            deleteEnd();
            return;
        }
        Node previousNode=get(index-1);
        Node curreNode=get(index);
        previousNode.next=curreNode.next;
        curreNode.next=null;
        Size--;
    }
    public static int search(Node head,int data){
        int pos=1;
        Node temp=head;
        while(temp!=null){
            if(temp.data==data){
                return pos;
            }else{
                pos++;
                temp=temp.next;
            }
        }
        return -1;
    }
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
