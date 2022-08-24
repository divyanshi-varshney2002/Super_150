package Patterns;

import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int star=1;
        int space=n-1;
        while (row<=2*n-1){
            int i=1;
            while (i<=space){
                System.out.print("  ");i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");j++;
            }
            row++;
            if(row<=n){ star++;space--;}
            else {star--;space++;}
            System.out.println();
        }
    }
}
//                        *
//                      * *
//                    * * *
//                  * * * *
//                * * * * *
//                  * * * *
//                    * * *
//                      * *
//                        *
