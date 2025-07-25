package com.Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Yellow {
    public static void main(String[] args){
//        HashSet<String> h=new HashSet<String>();
//        h.add("barash");
//        h.add("sharma");
//        h.add("study");
//        System.out.println(h);
//        System.out.println(h.contains("barash"));
//        Iterator i=h.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next()+" ");
//        }
//        HashMap<String,Integer> map=new HashMap<String,Integer>();
//        map.put("gfg",10);
//        map.put("ide",20);
//        map.put("courses",30);
//        System.out.println(map);
//        System.out.println(map.size());
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={1,2,3};
       // printFrequency(arr,arr.length);
        intersection(arr1,arr2);
        int[]  arr={8,3,4,2,5};
        boolean n=isPair(arr,6);
        System.out.println(n);

    }
    public static int countDistinct(int[] arr,int n){
        n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                res++;
            }
        }
        return res;
    }
    public static int countDistinct2(int[] arr){
        HashSet<Integer> s=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        return s.size();
    }
    public static void printFrequency(int[] arr,int n){
        n=arr.length;
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag){
                continue;
            }
            int freq=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    freq++;
                }
            }
            System.out.println(arr[i]+" "+"present: "+freq+" times");
        }
    }
    public static int countFreq(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        return map.size();
    }
    public static void intersection(int[] a,int[] b){
        for(int i=0;i<a.length;i++){
            boolean flag=false;
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                System.out.println(a[i]+" ");
            }
        }

    }
    public static void insert(int[] a,int[] b){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        for(int i=0;i<a.length;i++){
            if(set.contains(a[i])){
                System.out.println(a[i]+" ");
            }
        }
    }
    public static int unionCount(int[] a,int[] b){
        HashSet<Integer> set=new HashSet<>();
        for(int x:a){
            set.add(x);
        }
        for(int x:b){
            set.add(x);
        }
        return set.size();
    }
    public static boolean isPair(int[] arr,int sum){
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
            if(set.contains(sum-x)) return true;
            else set.add(x);
        }
        return false;
    }
    public static boolean isSubArray(int[] arr){
        HashSet<Integer> h=new HashSet<>();
        int pre_sum=0;
        for(int x:arr){
            pre_sum+=x;
            if(h.contains(pre_sum))return true;
            if(pre_sum==0) return true;
            h.add(pre_sum);
        }
        return false;
    }
    public static boolean isSubArraySum(int[] arr,int sum){
        for(int i=0;i<arr.length;i++){
            int curr_sum=0;
            for(int j=i;j<arr.length;j++){
                curr_sum+=arr[j];
                if(curr_sum==sum){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isSubArraySum2(int[] arr,int sum){
        HashSet<Integer> set=new HashSet<>();
        int pre_sum=0;
        for(int x:arr) {
        pre_sum+=x;
        if(pre_sum==sum) return true;
        if(set.contains(pre_sum-sum))return true;
        set.add(pre_sum);
        }
        return false;
    }
    public static int maxLength(int[] arr,int sum){
        int res=0;
        for(int i=0;i<arr.length;i++){
            int curr_sum=0;
            for(int j=i;j<arr.length;j++){
                curr_sum+=arr[j];
                if(curr_sum==sum){
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
    public static int maxLength2(int[] arr,int sum){
        HashMap<Integer,Integer> map=new HashMap<>();
        int pre_sum=0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            pre_sum+=arr[i];

            if(!map.containsKey(pre_sum)){
                map.put(pre_sum,i);
            }
            if(map.containsKey(pre_sum-sum)){
                res=Math.max(res,i-map.get(pre_sum-sum));
            }
        }
        return res;
    }
    public static int longestSubArray(int[] arr,int sum){
        int res=0;
        for(int i=0;i<arr.length;i++){
            int c0=0;
            int c1=0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==0) c0++;
                else c1++;
            }
            res=Math.max(res,c0+c1);
        }
        return res;
    }
    public static int maxCommon(int[] arr1,int[] arr2){
        int n=arr1.length;
        int res=0;
        for(int i=0;i<arr1.length;i++){
            int sum1=0;
            int sum2=0;
            for(int j=i;j<arr1.length;j++){
                sum1+=arr1[j];
                sum2+=arr2[j];
                if(sum1==sum2){
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
    public static int maxLongestSum(int[] arr1,int[] arr2){
        int[] temp=new int[arr1.length];
        for(int i=0;i<temp.length;i++){
            temp[i]=arr1[i]-arr2[i];
        }
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        int pre_sum=0;
        for(int i=0;i<temp.length;i++){
            pre_sum+=temp[i];
            if(pre_sum==sum){
                res=i+1;
            }
            if(!map.containsKey(pre_sum)){
                map.put(pre_sum,i);
            }
            if(map.containsKey(pre_sum-sum)){
                res=Math.max(res,i-map.get(pre_sum-sum));
            }
        }
        return res;

    }
}
