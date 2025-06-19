package com.RevisionMaths;

public class Searching {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,7,8};
        //         0,1,2,3,4,5,6,7,8
        int index=countOccurence(arr,arr.length,7);
        System.out.println(index);
    }
    public static int binarySearch(int[] arr,int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static int binarySearch2(int[] arr,int low ,int high,int k){
        int n=arr.length;
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(arr[mid]==k) return mid;
        else if(arr[mid]<k) return binarySearch2(arr,mid+1,high,k);
        else return binarySearch2(arr,low,mid-1,k);
    }
    //finding the  first index
    public static int firstIndex(int[] arr,int low,int high,int x){
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(x>arr[mid]){
            return firstIndex(arr,mid+1,high,x);
        }
        else if(x<arr[mid]){
            return firstIndex(arr,low,mid-1,x);
        }
        else{
            if(mid==0 || arr[mid-1]!=arr[mid]){
                return mid;
            }
            else{
                return firstIndex(arr,low,mid-1,x);
            }
        }
    }
    public static int firsIndex(int[] arr,int n,int x){
         int low=0;
         int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                high=mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                if(mid==0 || arr[mid-1]!=arr[mid]){
                    return mid;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static int lastIndex(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<x){
                low=mid+1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                if(mid==n-1 || arr[mid]!=arr[mid+1]) return mid;
                else {
                    low=mid+1;
                }
            }
        }
        return -1;
    }
    public static int lastIndex2(int[] arr,int low,int high,int x) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] < x) {
            return lastIndex2(arr, mid + 1, high, x);
        } else if (arr[mid] > x) {
            return lastIndex2(arr, low, mid - 1, x);
        } else {
            if (mid == arr.length - 1 || arr[mid] != arr[mid + 1]) {
                return mid;
            } else {
                return lastIndex2(arr, mid + 1, high, x);
            }
        }
    }
    public static int countOccurence(int[] arr,int n,int x){
        int first=firsIndex(arr,arr.length,x);
        if(first==-1) return 0;
        else return (lastIndex(arr,arr.length,x)-first+1);
    }
     public static int search(int[] arr,int x){
        if(arr[0] ==x ) return -1;
        int i=1;
        while(arr[i]<x){
            i=i*2;
        }
        if(arr[i]==x) return i;
        return binarySearch2(arr,i/2+1,i-1,x);
     }
     //search in sorted  rotated array
    public static int searchRotated(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x) return mid;
            if(arr[low]<arr[mid]){
                if(x>=arr[low] && x<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(x>arr[mid] && x<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static int  getPeak(int[] arr,int n){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid])){
                return mid;
            }
            if(mid>0 && arr[mid-1]>=arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static int twoPointer(int[] arr,int x){
        int i=0;
        int n=arr.length;
        int j=n-1;
        while(i<=j){
            if(arr[i]+arr[j]>x){
                j=j-1;
            }
            else if(arr[i]+arr[j]<x){
                i=i+1;
            }
            else{
                return i;
            }
        }
        return -1;
    }

}
