package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fact(n));
        System.out.println(fact(n,1));
    }
    //head recursion
    public static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
    //tail recursion
    public static int fact(int n,int ans){
        if(n==0) return ans;
        return fact(n-1,ans*n);
    }
}
