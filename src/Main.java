import java.util.*;
public class Main {
    // public static void swap(int arr[],int i,int j){
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    // }
    // public static int partition (int arr[],int beg,int end){
    //     int pivot=arr[end];
    //     int i=beg-1;
    //     for(int j=beg;j<=end;j++){
    //         if(arr[j]<pivot){
    //             i++;
    //             swap(arr,i,j);
    //         }
    //     }
    //     swap(arr,i+1,end);
    //     return (i+1);
    // }
    // public static void qsort(int arr[],int beg,int end){
    //     if(beg<end){
    //         int split=partition(arr, beg, end);
    //         qsort(arr,beg,split-1);
    //         qsort(arr,split+1,end);
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int n0=0,n1=0,n2=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]==0) n0++;
            if(arr[i]==1) n1++;
            if(arr[i]==2) n2++;
        }

        // qsort(arr,0,n-1);
        // Arrays.sort(arr);
        for (int i = 1; i <= n0; i++)    System.out.print("0 ");
        for (int i = 1; i <= n1; i++)    System.out.print("1 ");
        for (int i = 1; i <= n2; i++)    System.out.print("2 ");
    }
}