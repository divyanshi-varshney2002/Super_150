package Patterns;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), row=1,star=1,space=n-1;
        while (row<=n){
            int i=1;
            while (i<=space){
                System.out.print("  ");i++;
            }
            int j=1;
            while (j<=star){
                System.out.print("* ");j++;
            }
            space--;row++;star++;
            System.out.println();
        }
    }
}
//                *
//              * *
//            * * *
//          * * * *
//        * * * * *
