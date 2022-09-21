package Recursion;

import java.util.Scanner;

public class number_decending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solution(n);
    }
    public static void solution(int n){
//        base condition:
//        if(n==0) return;
        if(n>0){
            System.out.println(n);
            solution(n-1);
        }
    }
}
