package com.POLYNOMIAL;

public class POLYNOMIAL {

        class Node {
            int coefficient;
            int exponent;
            Node next;

            Node(int coefficient, int exponent) {
                this.coefficient = coefficient;
                this.exponent = exponent;
            }
        }
            Node head;
            public void add(int coefficient,int exponent){
                Node newNode=new Node(coefficient,exponent);
                if(head==null || head.exponent<exponent){
                    newNode.next=head;
                    head=newNode;
                }
                else{
                    Node temp=head;
                    while(temp.next!=null && temp.next.exponent>exponent){
                        temp=temp.next;
                    }
                    if(temp.exponent==exponent){
                        temp.coefficient+=coefficient;
                    }
                    else{
                        newNode.next=temp.next;
                        temp.next=newNode;
                    }
                }
            }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.coefficient + "x^" + temp.exponent);

            temp = temp.next;
            if (temp != null) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }
            public POLYNOMIAL add(POLYNOMIAL p1,POLYNOMIAL p2){
                POLYNOMIAL result=new POLYNOMIAL();
                Node t1=p1.head;
                Node t2=p2.head;
                while(t1!=null && t2!=null) {
                    if (t1.exponent == t2.exponent) {
                        result.add(t1.coefficient + t2.coefficient, t1.exponent);
                        t1 = t1.next;
                        t2 = t2.next;
                    } else if (t1.exponent > t2.exponent) {
                        result.add(t1.coefficient, t1.exponent);
                        t1 = t1.next;
                    } else {
                        result.add(t2.coefficient, t2.exponent);
                        t2 = t2.next;
                    }
                }
                    while (t1 != null) {
                        result.add(t1.coefficient, t1.exponent);
                        t1 = t1.next;
                    }
                    while (t2 != null) {
                        result.add(t2.coefficient, t2.exponent);
                        t2 = t2.next;
                    }
                    return result;


            }
    public static POLYNOMIAL multiply(POLYNOMIAL p1, POLYNOMIAL p2) {
        POLYNOMIAL result = new POLYNOMIAL();
        for (Node t1 = p1.head; t1 != null; t1 = t1.next) {
            for (Node t2 = p2.head; t2 != null; t2 = t2.next) {
                result.add(t1.coefficient * t2.coefficient, t1.exponent + t2.exponent);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        POLYNOMIAL hii=new POLYNOMIAL();
        hii.add(0,0);
        hii.add(2,3);
        hii.add(3,4);
        hii.display();
    }



}
