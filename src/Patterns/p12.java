package Patterns;

import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        while(row<=n){
            if(row==1||row==n){
                int i=1;
                while (i<=star){
                    System.out.print("* ");i++;
                }
            }else{
                int j=1;
                while(j<=n){
                    if(j==1||j==n) System.out.print("* ");
                    else System.out.print("  ");
                    j++;
                }
            }
            row++;
            System.out.println();
        }
    }
}
//        * * * * *
//        *       *
//        *       *
//        *       *
//        * * * * *
