package Sorting;

import java.util.Scanner;

public class Selection_Sort {
    public static void ssort(int arr[],int n){
        for(int i=0;i<n;i++){//pass loop
            int pas=i;
            for(int j=i+1;j<n;j++){//comparison loop
                if(arr[pas]>arr[j])
                    pas=j;
            }
            int min=arr[pas];
            arr[pas]=arr[i];
            arr[i]=min;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println( "enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        ssort(arr,n);
        System.out.println("sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
