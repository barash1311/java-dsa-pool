package com.java;

public class Matrix {
    public static void main(String[] args) {
        int[][]matrix={
                {1,2,3},
                {4,5,7},
                {7,8,9}
        };
        for(int i=0;i<=matrix.length;i++){
            for(int j=matrix.length;j>=0;j--){
                matrix[i][j]=matrix[i][j];
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
}
