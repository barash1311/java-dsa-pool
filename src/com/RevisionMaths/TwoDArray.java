package com.RevisionMaths;

public class TwoDArray {
    public static void print(int[][] arr){
        for(int[] ar:arr){
            for(int ar2:ar){
                System.out.println(ar2);
            }
            System.out.println();
        }
    }
    public static void snake(int[][] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count%2!=0){
                for(int j=arr[i].length-1;j>=0;j--){
                    System.out.println(arr[i][j]);
                }
                count++;
            }
            else{
                for(int j=0;j<arr[i].length;j++){
                    System.out.println(arr[i][j]);
                }
                count++;
            }
            System.out.println();

        }
    }
    public static void printBoundary(int[][] arr) {
        int row=arr.length;
        int column=arr[0].length;
        if(row==1){
                for(int i=0;i<column;i++){
                    System.out.println(arr[0][i]);
                }
                return;
        }
        if(column==1){
            for(int i=0;i<row;i++){
                System.out.println(arr[i][0]);
            }
            return;
        }
        for(int i=0;i<column;i++){
            System.out.println(arr[0][i]+" ");
        }
        System.out.println();

        for(int i=1;i<row;i++){
            System.out.println(arr[i][column-1]+" ");
        }
        System.out.println();

        for(int i=column-2;i>=0;i--){
            System.out.println(arr[row-1][i]+" ");
        }
        System.out.println();

        for(int i=row-2;i>0;i--){
            System.out.println(arr[i][0]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
//        snake(arr);
        spiral(arr);
    }
    public static void spiral(int[][] arr){
        int top=0;
        int bottom=arr.length-1;
        int left=0;
        int right=arr[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                System.out.println(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.println(arr[i][right]);
            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.println(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.println(arr[i][left]);
                }
                left++;
            }
        }
    }
}
