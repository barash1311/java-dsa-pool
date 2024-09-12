package com.java.Addition;

import java.util.Scanner;

public class jaba {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no of rows:");
        int m=sc.nextInt();
        System.out.print("enter no of columns:");
        int n=sc.nextInt();
        int[][] matrix1=null;
        int[][] matrix2=null;
        int[][] result=null;
        if(m==n){
            System.out.println("enter the matrix1");
            matrix1=new int[m][n];
            for(int rows=0;rows<matrix1.length;rows++){
                for(int column=0;column<matrix1[rows].length;column++){
                    System.out.print("enter value at matrix["+rows+"]["+column+"] =");
                    matrix1[rows][column]=sc.nextInt();
                }
            }
            System.out.println("enter the matrix2");
            matrix2=new int[m][n];
            for(int rows=0;rows<matrix2.length;rows++){
                for(int column=0;column<matrix2[rows].length;column++){
                    System.out.print("enter value at matrix["+rows+"]["+column+"] =");
                    matrix2[rows][column]=sc.nextInt();
                }
            }
            result=new int[m][n];
            for(int row=0;row<result.length;row++){
                for(int column=0;column<result[row].length;column++){
                    result[row][column]=matrix1[row][column]+matrix2[row][column];
                }
            }
            System.out.println("the result is:");
            for(int[] row:result){
                for(int element:row){
                    System.out.print(element+"  ");
                }
                System.out.println();
            }

        }
    }
}
