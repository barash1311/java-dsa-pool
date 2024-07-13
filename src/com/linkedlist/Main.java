package com.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.display();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.display();
        System.out.println(list.find(4));

    }
}
