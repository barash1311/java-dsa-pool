package com.CustomStack;

public class Main {
    public static void main(String[] args) throws Exception {
    CustomStack stack=new CustomStack(5);
    stack.push(0);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.pop();
    stack.printstacl();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.printstacl();
}
}