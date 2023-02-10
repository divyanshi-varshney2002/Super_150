package Sorting;

import java.util.*;
public class Quick_Sort {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition (int arr[],int beg,int end){
        int pivot=arr[end];
        int i=beg-1;
        for(int j=beg;j<=end;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return (i+1);
    }
    static void qsort(int arr[],int beg,int end){
        if(beg<end){
            int split=partition(arr, beg, end);
            qsort(arr,beg,split-1);
            qsort(arr,split+1,end);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println( "enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        qsort(arr,0,n-1);
        System.out.println("sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
