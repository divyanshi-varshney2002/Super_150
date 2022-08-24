package Patterns;

import java.util.Scanner;

public class p10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        while(row<=2*n-1) {
            int i=1;
            while(i<=star) {
                System.out.print("* ");
                i++;
            }
            row++;
            //mirror
            if(row<=n) star++;
            else star--;
            System.out.println();
        }
    }

}
//        *
//        * *
//        * * *
//        * * * *
//        * * *
//        * *
//        *