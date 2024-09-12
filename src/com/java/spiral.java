package com.java;
import java.util.*;
public class spiral {
    public static void main(String[] args) {
        int[][] matrix={
                {1 ,2 ,3 ,4 ,5 ,6},
                {20,21,22,23,24,7},
                {19,32,33,34,25,8},
                {18,31,36,35,26,9},
                {17,30,29,28,27,10},
                {16,15,14,13,12,11}
        };
        List<Integer> list=new ArrayList<>();

        int m=matrix.length;
        int n=matrix[0].length;
        int top=0,bottom=m-1;
        int left=0,right=n-1;

        while(top<=bottom && left<=right){
//            we are printing right->bottom->left->top
            for(int i=top;i<=right;i++){
                list.add(matrix[top][i]);
//                top is constant
            }
            top++;
//            printing the top->bottom
            for (int i=top;i<bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println(list);

    }
}
