package Recursion;

import java.util.Scanner;

public class dice_distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sum at which you have to reach:");
        int end=sc.nextInt();
        print_path(0,end,"");
    }
    public static void print_path(int curr,int end,String ans){
        if(curr==end){
            System.out.println(ans);
            return;
        }
        if(curr>end){
            return;
        }
//        print_path(curr+1,end,ans+1);
//        print_path(curr+2,end,ans+2);
//        print_path(curr+3,end,ans+3);
        for (int dice = 1; dice <=3 ; dice++) {
            print_path(curr+dice,end,ans+dice);
        }
    }
}
