package Sorting;

import java.util.Scanner;

public class Insertion_Sort {
    public static void isort(int a[],int n){
        for(int i=1;i<n;i++){//pass loop
            int temp=a[i];
            int pos=i-1;
            while(pos>=0 && temp<a[pos]){//comparison loop//for descending order temp>a[pos]
                a[pos+1]=a[pos];
                pos=pos-1;
            }
            a[pos+1]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println( "enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        isort(arr,n);
        System.out.println("sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
