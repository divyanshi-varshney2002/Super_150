package Programs;

import java.util.Scanner;

public class Sliding_Window_MAX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("window size:");
        int k=sc.nextInt();
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=sum+arr[i];
        }
        int ans=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];;
            ans=Math.max(sum,ans);
        }
        System.out.println(ans);
    }
}
