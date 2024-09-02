package com.java;
import java.util.*;
public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        we have to find all the factors of the numebr
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
