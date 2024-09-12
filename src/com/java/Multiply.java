package com.java;

public class Multiply {
    public static void main(String[] args) {
        int[][] a={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] b={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] result=new int[a.length][b[0].length];
        for(int row=0;row<a.length;row++){ //this will iterate over the row of first matrix
            for(int col=0;col<b[row].length;col++){
                for(int k=0;k<b.length;k++){
                    result[row][col]+=a[row][k]*b[k][col];
                }
            }

        }
        for(int[] r:result){
            for(int element:r){
                System.out.print(element+" ");
            }
            System.out.println();
        }

    }
}
