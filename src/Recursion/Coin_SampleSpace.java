package Recursion;

import java.util.Scanner;

public class Coin_SampleSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("No. of tosses:");
        int n=sc.nextInt();
        coin(n,"");
    }
    public static void coin(int n,String ans){
        if(n==0){
//            if(!ans.contains("HH")) //ans nikal k print krte time ki editing
            System.out.println(ans);
            return ;
        }
//        if(ans.length()==0||ans.charAt(ans.length()-1)!='H')
//        recursive call ki nhi krna to save time and stack memory
//        to print the sample space having no two consecutive head
        coin(n-1,ans+"H");
        coin(n-1,ans+"T");
    }
}
