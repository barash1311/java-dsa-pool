package com.Strings;

public class Repeat {
    public static void main(String[] args) {
        int[] count=new int[256];
        String str="geeks";
//        System.out.println(count[str.charAt(0)]);
        System.out.println(str.charAt(0));
        count[str.charAt(0)]++;

        count[str.charAt(1)]++;
//        System.out.println(count[str.charAt(0)]);
        for(int j=0;j<str.length();j++){
            System.out.println(count[str.charAt(j)]);
        }
    }
    public static int RepeatString(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }
    static final int CHAR=256;
    public static int RepeatString2(String str){
        int[] count=new int[CHAR];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]>1){
                return 1;
            }
        }
        return -1;
    }
    public static int RepeatString3(String str){
        boolean[] visited=new boolean[CHAR];
        int res=-1;
        for(int i=str.length()-1;i>=0;i--){
            if(visited[str.charAt(i)]){
                return i;
            }
            else{
                visited[str.charAt(i)]=true;
            }
        }
        return res;
    }
    public static int LeftMost(String[] args){
        return 0;
    }
}
