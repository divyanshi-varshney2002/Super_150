//package Lec1;
//
//import java.util.Scanner;
//
//public class Problem1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int sum=0,pos=1;
//        while(n>0){
//            int q=n%10;
//            n=n/10;
//            sum+=pos* (Math.pow(10,q-1));
//            pos++;
//        }
//        System.out.println(sum);
//    }
//}
//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int s1=0,s2=0;
//        int pos=1;
//        while(n>0){
//            int rem=n%10;
//            if(pos%2==1)	s1+=rem;
//            else	s2+=rem;
//            n=n/10;
//            pos++;
//        }
//        System.out.println(s1);
//        System.out.println(s2);
//    }
//}
