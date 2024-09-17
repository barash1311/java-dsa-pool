package com.Patterns.java;

public class setofpatterns {
    public static void  pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
    public static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();

        }
    }
    public static void pattern5(int n){
        for(int i=0;i<5;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public static void  pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for(int i=0;i<n;i++){
            // first there will be space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();

        }

    }
    public static void pattern8(int n){
        for(int i=0;i<n;i++){
            // space star space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            // star
            for(int j=0;j<(2*n)-(2*i+1);j++){
                System.out.print("*");
            }


            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        for(int i=0;i<n;i++){
            // space start space
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print(" ");
            }

            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<(2*n)-(2*i+1);j++){
                System.out.print(" ");
            }

            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern10(int n){
        for(int i=0;i<=2*n-1;i++){
            int stars=i;
            if(i>n) stars=2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void pattern10a(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n) stars=2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern11(int n){
        int start=1;
        for(int i=1;i<=n;i++){
            if(i%2==0) start=0;
            else start=1;
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();

        }
    }
    public static void pattern12(int n){
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            space=space-2;
        }
    }
    public static void  pattern13(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        for(int i=0;i<=n;i++){
            for(char ch='A';ch<='A'+(n-i-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(int)('A'+i)+" ");
            }
            System.out.println();

        }
    }
    public static void pattern17(int n){
        for(int i=0;i<=n;i++){
            // spaces printing
            for(int j=0;j<n-i+1;j++){
                System.out.print("  ");
            }
            // for star
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=0;j<2*i+1;j++){
                System.out.print(ch+" ");
                if(j<=breakpoint)ch++;
                else ch--;
            }
            for(int j=0;j<n-i+1;j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void pattern18(int n){
        for(int i=0;i<n;i++){
            for( char ch=(char)(int)('A'+n-1-i);ch<=(char)(int)('A'+n-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void  pattern18alt(int n){
        for(int i=0;i<n;i++){
            for(char ch=(char)(int)('E'-i);ch<='E';ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern19(int n){
        int spaces=2*(n-1);
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n)stars=2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) spaces-=2;
            else spaces+=2;
        }
    }
    public static void pattern20(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern21(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int bottom=j;
                int right=(2*n-2)-j;
                int left=(2*n-2)-i;
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right))+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(5);
    }
}
