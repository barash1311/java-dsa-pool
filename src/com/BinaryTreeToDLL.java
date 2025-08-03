package com;


class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}
public class BinaryTreeToDLL {
    Node prev=null;
    Node head=null;
    public void convertToDLL(Node root){
        if(root==null){
            return;
        }
        convertToDLL(root.left);
        if(prev==null){
            head=root;
        }
        else{
            prev.right=root;
            root.left=prev;
        }
        prev=root;
        convertToDLL(root.right);
    }
}
