package Patterns;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt() , row=1,star=n,space=0;
        while(row<=n){
            int i=1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while (j<=star){
                System.out.print("* ");
                j++;
            }
            star--;
            space++;
            row++;
            System.out.println();
        }
    }
}
//* * * * *
//  * * * *
//    * * *
//      * *
//        *