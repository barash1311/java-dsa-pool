package com.Conversion;

import java.util.Stack;

public class ITP {
    static int presidence(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    static String ITP(String exp){
        String result="";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<exp.length();i++) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result+=c;
            }
            else if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    result+=stack.pop();
                }
                stack.push(c);
            }
            else{
                while(!stack.isEmpty() && presidence(c)<=presidence(stack.peek())){
                    result+=stack.pop();
                }
                stack.pop();
            }

            }
        while(!stack.isEmpty()){
            if(stack.peek()=='('){
                return "invalid expression";
            }
            result+=stack.pop();
        }
        return result;
        }
}
