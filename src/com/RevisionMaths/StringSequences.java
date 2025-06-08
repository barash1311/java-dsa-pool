package com.RevisionMaths;

public class StringSequences {
    public static void main(String[] args) {
        int iterator=0;
        String current="";
        subSets("ABC",current,iterator);
    }
    public static void subSets(String str,String current,int i){
        if(i==str.length()){
            System.out.println(current);
            return;
        }
        subSets(str,current,i+1);
        subSets(str,current+str.charAt(i),i+1);


    }
}
