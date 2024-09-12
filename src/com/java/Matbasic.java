package com.java;
import java.util.*;

public class Matbasic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[row].length;column++){
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int[] row:matrix){
            for(int element:row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
        System.out.println("enter the no of rows");
        int m=sc.nextInt();
        System.out.println("enter the no of columns");
        int n=sc.nextInt();
        int[][] matrix2=null;
        if(m==n) {
            matrix2 = new int[m][n];
            for(int row=0;row<matrix2.length;row++){
                for(int column=0;column<matrix2[row].length;column++){
                    System.out.println("enter the matrix"+matrix[row][column]+":");
                    matrix2[row][column]=sc.nextInt();
                }
            }
        }
        else{
            System.out.println("invlid no of rows and column");
        }
        for(int[] row:matrix2){
            for(int element:row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
