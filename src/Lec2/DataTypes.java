package Lec2;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        fails when anyone from the base is not 10
        int n=sc.nextInt();
        int des=sc.nextInt();
        int src=sc.nextInt();
        int sum=0,mul=1;
        while(n>0){
            int rem =n%des;
            sum+=rem*mul;
            n=n/des;
            mul=mul*src;
        }
        System.out.println(sum);
    }
}
