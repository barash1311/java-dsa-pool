package com.RevisionMaths;

import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
//        leftRoate2(arr,arr.length,3);
//        System.out.println(Arrays.toString(arr));
        leader2(arr, arr.length);
    }

    public static int insert(int[] arr, int n, int x, int cap, int pos) {
        if (n == cap) {
            return n;
        }
        int index = pos - 1;
        for (int i = n - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = x;
        return (n + 1);
    }

    public static int delete(int[] arr, int n, int x) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) break;
        }
        if (i == n) return n;
        for (int j = i; j <= n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        return (n - 1);
    }

    public static int largest(int[] arr, int n) {
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int secondLargest(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static boolean checkSorted(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
        //this is having the time complexity of 0(n^2)
    }

    public static boolean checkSorted2(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void reverse(int[] arr, int n) {
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static int removeDuplicates(int[] arr, int n) {
        int[] temp = new int[n];
        temp[0] = arr[0];
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (temp[res - 1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }
        for (int i = 0; i < res; i++) {
            arr[i] = temp[i];
        }
        return res;
    }

    public static void movetoEnd(int[] arr, int n) {
        for (int i = 0; i <= n; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j <= n; j++) {
                    if (arr[j] != 0) {
                        swap(arr[i], arr[j]);
                    }
                }
            }
        }
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void moveToEnd2(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (arr[i] != 0) {
                swap2(arr, arr[i], arr[count]);
                count++;
            }
        }
    }

    public static void swap2(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void roateByD(int[] arr, int n, int d) {
        for (int i = 0; i < d; i++) {
            leftRotate(arr, n);
        }
    }

    public static void leftRotate(int[] arr, int n) {
        int first = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = first;
    }

    public static void leftRoate2(int[] arr, int n, int d) {
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void leader(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void leader2(int[] arr, int n) {
        int current_leader = arr[n - 1];
        System.out.println("current_leader:" + current_leader);
        for (int i = n - 2; i >= 0; i--) {
            if (current_leader < arr[i]) {
                current_leader = arr[i];
                System.out.println("current_leader:" + current_leader);
            }
        }
    }

    public static void printFreq(int[] arr, int n) {
        int freq = 1;
        int i = 1;
        while (i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i - 1] + " " + freq);
            i++;
            freq = 1;

        }
        if (n == 1 || arr[n - 1] != arr[n - 2]) {
            System.out.println(arr[n - 1]);
        }
    }

    public static int maxProfit(int[] arr, int start, int end) {
        if (end <= start) {
            return 0;
        }
        int profit = 0;
        for (int i = start; i <= end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (arr[j] > arr[i]) {
                    int current_profit = arr[j] - arr[i] + maxProfit(arr, start, i - 1) + maxProfit(arr, j + 1, end);
                    profit = Math.max(profit, current_profit);
                }
            }
        }
        return profit;
    }

    public static int getWater(int[] arr) {
        int n = arr.length;
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            int lmax = arr[i];
            for (int j = 0; j < i; j++) {
                lmax = Math.max(lmax, arr[j]);
            }
            int rmax = arr[i];
            for (int j = i + 1; j < n; j++) {
                rmax = Math.max(rmax, arr[j]);
            }
            res += (Math.min(lmax, rmax) - arr[i]);

        }
        return res;
    }

    public static int getWater2(int[] arr) {
        int n = arr.length;
        int res = 0;
        int[] lmax = new int[n];
        int[] rmax = new int[n];

        lmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(arr[i], lmax[i - 1]);
        }
        rmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(arr[i], rmax[i + 1]);
        }
        for (int i = 1; i <= n; i++) {
            res += (Math.min(lmax[i], rmax[i]) - arr[i]);
        }
        return res;
    }

    public static int maxConsec(int[] arr) {
        int res = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == 1) {
                    curr++;
                    break;
                }
            }
            res = Math.max(res, curr);
        }
    }

    public static int maxSum(int[] arr, int n) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < n; j++) {
                curr += arr[j];
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    public static int maxSum2(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static int maxOdd(int[] arr) {
        int n = arr.length;
        int res = 1;
        for (int i = 0; i < n; i++) {
            int curr = 1;
            for (int j = i + 1; j < n; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)) {
                    curr++;
                } else {
                    break;
                }
            }
            res = Math.max(res, curr);
        }
        return res;
    }

    public static int maxOdd2(int[] arr) {
        int n = arr.length;
        int res = 1;
        int curr = 1;
        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                curr++;
                res = Math.max(res, curr);
            } else {
                curr = 1;
            }

        }
        return res;
    }

    public static int normalSum(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static int overALLMaxsum(int[] arr) {
        int maxSum = normalSum(arr);
        if (maxSum <= 0) return maxSum;
        int arr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int max_circular = arr_sum + normalSum(arr);
        return Math.max(max_circular, maxSum);
    }

    public static int maximumSum(int[] arr, int k) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i + k - 1 < arr.length; i++) {
            int curr = 0;
            for (int j = i + 1; j < k; j++) {
                curr += arr[j];
            }
            result = Math.max(result, curr);
        }
        return result;
    }

    public static boolean isSubSum(int[] arr, int sum) {
        int start = 0;
        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];
            while (sum < curr) {
                curr -= arr[start];
                start++;
            }
            if (curr == sum) {
                return true;
            }
        }
        return false;
    }
    public static int getSum(int[] arr,int start,int end){
        int result=0;
        for(int i=start;i<=end;i++){
            result+=arr[i];
        }
        return result;
}


}
