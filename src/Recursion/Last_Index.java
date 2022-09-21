package Recursion;

import java.util.Scanner;

public class Last_Index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]= sc.nextInt();
        int x= sc.nextInt();
        System.out.println(position(arr,x,n-1));
    }
    public static int position(int arr[],int x,int i){
        if(i==-1) return -1;
        if(arr[i]==x) return i;
        return position(arr,x,i-1);
    }
}
