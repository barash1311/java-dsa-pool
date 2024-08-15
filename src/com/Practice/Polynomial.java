package com.Practice;

import java.util.*;
class Polynomial{
    class Node{
        int coeff;
        int exp;
        Node next;
        Node(int coeff,int exp){
            this.coeff=coeff;
            this.exp=exp;
        }
    }
    public Node head;
    public void add(int coeff,int exp){
        Node newNode=new Node(coeff,exp);
        if(head==null || head.exp<exp){
            newNode.next=head;
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null && temp.next.exp>exp){
                temp=temp.next;
            }
            if(temp.exp==exp){
                temp.coeff+=coeff;
            }
            else{
                newNode.next=temp.next;
                temp.next=newNode;
            }
        }
    }
    public Polynomial addthem(Polynomial p1,Polynomial p2){
        Polynomial result=new Polynomial();
        Node t1=p1.head;
        Node t2=p2.head;
        while(t1!=null && t2!=null){
            if(t1.exp==t2.exp){
                result.add(t1.coeff+t2.coeff,t1.exp);
                t1=t1.next;
                t2=t2.next;
            }

            else if(t1.exp>t2.exp){
                result.add(t1.coeff,t1.exp);
                t1=t1.next;
            }
            else{
                result.add(t2.coeff,t2.exp);
                t2=t2.next;
            }
        }
        while(t1!=null){
            result.add(t1.coeff,t1.exp);
            t1=t1.next;
        }
        while(t2!=null){
            result.add(t2.coeff,t2.exp);
            t2=t2.next;
        }
        return result;
    }

}


