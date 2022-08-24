package Patterns;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        while (row <= n) {
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            row++;
            star++;
            System.out.println();
        }
    }
}
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
