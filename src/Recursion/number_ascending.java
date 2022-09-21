package Recursion;

import java.util.Scanner;

public class number_ascending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solution(n);
    }
    public static void solution(int n){
//        base condition:
//        if(n==0) return;
        if(n>0){
            System.out.println(n);//jaate time
            solution(n-1);
            System.out.println(n);//aate time
        }
    }
}
//if last line of function is function call i.e recursive call
//ans immediate return statement than it is a tail recursion
//otherwise,head recursion
//after recursive call it perform some task
