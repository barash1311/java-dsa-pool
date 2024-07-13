package com.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertFirst(0);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
//        list.display();
        list.insertLst(4);
        list.insertLst(5);
//        list.display();
        list.insert(1,44);
        list.deleteFirst();

        list.display();
        list.deleteLast();
        list.display();
        list.delete(0);
        list.display();
//        list.reverseDisplay();

    }
}
